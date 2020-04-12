package com.saucestepdef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;

import com.baseclass.LaunchBrowser;
//import com.baseclass.Wrapperclass;
import com.sauce.SauceInvalidlogin;
import com.sauce.Saucelogin;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SauceInvalidloginn {
	public static Logger logger = (Logger) LogManager.getLogger(SauceInvalidloginn.class.getName());
	WebDriver driver;
	
	@Given("^user launched the chrome browser$")
	public void user_launched_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // loginpage.link();
		LaunchBrowser.setUp("ch");
		this.driver=LaunchBrowser.driver;
	    logger.debug("message");
	}

	@When("^user opens swaglabs homepage$")
	public void user_opens_swaglabs_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SauceInvalidlogin loginpage = new  SauceInvalidlogin(driver);
	    loginpage.Login();
	    logger.trace("message");
	}

	@When("^user enters invalid  username and password$")
	public void user_enters_invalid_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SauceInvalidlogin loginpage = new  SauceInvalidlogin(driver);
	    loginpage. LoginDetails();
	    logger.trace("message");
	}

	@When("^the user clicks the login button$")
	public void the_user_clicks_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SauceInvalidlogin loginpage = new  SauceInvalidlogin(driver);
	    loginpage.Buttonclick();
	    LaunchBrowser.tearDown();
	   // screenshot("src/test/resources/screenshot/invalidlogin.png");
	}

	@Then("^Assert if the error message is displayed$")
	public void assert_if_the_error_message_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // loginpage.submitt();
	    logger.error("message");
	}



}
