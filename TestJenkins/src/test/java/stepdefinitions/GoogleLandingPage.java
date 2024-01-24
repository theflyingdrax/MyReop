package stepdefinitions;

import org.testng.Assert;

import commonFunctionality.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage;

public class GoogleLandingPage {
	
	private LoginPage lg = new LoginPage(Base.getDriver());

	@Given(": User is on {string} landing page")
	public void user_is_on_landing_page_for_on(String portal) {
		lg.ApplicationURL(portal);
	}
	
	@Then(": User is redirected to targeted page")
	public void User_login_as() {
		boolean key = lg.verifyTest();
		if(key==true) {
			Assert.assertTrue(true, "Test Passed");
		}else if(key==false) {
			Assert.assertTrue(false, "Test Failed");
		}
	}



}