package hooks;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import commonFunctionality.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;

public class ProjectHooks {

	private Base base;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.readProperty();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		base = new Base();
		driver = base.initializeBroswer(browserName);

	}

	@After(order = 0)
	public void quitBrowser() {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
					driver.findElement(By.xpath("//div[@class='profilebtn']")));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			((JavascriptExecutor) driver).executeScript("arguments[0].click();",
					driver.findElement(By.xpath("//span[@class='person-header']")));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();",
					driver.findElement(By.xpath("//span[text()='Logout']")));
		} catch (Exception e) {

		}

		driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] scourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(scourcePath, "image/png", screenshotName);
		} else {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] scourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(scourcePath, "image/png", screenshotName);
		}

	}
}
