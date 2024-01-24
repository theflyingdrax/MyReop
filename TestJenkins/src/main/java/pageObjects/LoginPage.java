package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commonFunctionality.Base;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	public void ApplicationURL(String url) {
		if (url.equalsIgnoreCase("Google")) {
			Base.getDriver().get("https://www.google.co.in/");
		}

	}
	
	public boolean verifyTest() {
		
		boolean verificationKey=false;
		
		 verificationKey = driver.findElement(By.xpath("//img[@alt='Google']")).isEnabled();
		
		return verificationKey;
	}

}
