package com.saucestepdef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;

import com.baseclass.LaunchBrowser;
//import com.baseclass.Wrapperclass;
import com.sauce.Saucelogout;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Saucelogoutt  {
	public static Logger logger = (Logger) LogManager.getLogger(Saucelogoutt.class.getName());
	WebDriver driver;
	@Given("^lAUNCHing the browser$")
	public void launching_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // logout.link();
		LaunchBrowser.setUp("ch");
		this.driver=LaunchBrowser.driver;
	    logger.debug("message");
	}

	@When("^lAUNCHing the application$")
	public void launching_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Saucelogout logout=new Saucelogout(driver);
	    logout.Login();
	    logger.trace("message");
	}

	@When("^click on Menu bar$")
	public void click_on_Menu_bar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Saucelogout logout=new Saucelogout(driver);
	    logout.LoginDetails();
	    logger.trace("message");
	}

	@When("^click on Logout button$")
	public void click_on_Logout_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Saucelogout logout=new Saucelogout(driver);
		logout.Button();
		
		//screenshot("sauce/src/test/resources/screenshot/logout.png");
	}

	@Then("^assert if the application is showing the login page$")
	public void assert_if_the_application_is_showing_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Saucelogout logout=new Saucelogout(driver);
		logout.logout();
		LaunchBrowser.tearDown();
		logger.error("message");
	   
	   
	}


}
