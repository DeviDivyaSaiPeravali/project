package com.saucestepdef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;

import com.baseclass.LaunchBrowser;
//import com.baseclass.Wrapperclass;
import com.sauce.Saucesort;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SauceSortlogin {
	public static Logger logger = (Logger) LogManager.getLogger(SauceSortlogin.class.getName());
	WebDriver driver;
	
	@Given("^Launching the chrome browser$")
	public void launching_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  login.link();
		Saucesort login=new Saucesort(driver);
		LaunchBrowser.setUp("ch");
		this.driver=LaunchBrowser.driver;
	    logger.debug("message");
	}

	@When("^launching the application$")
	public void launching_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Saucesort login=new Saucesort(driver);
	    login.Login();
	}

	@When("^click on Name A to Z$")
	public void click_on_Name_A_to_Z() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Saucesort login=new Saucesort(driver);
	    login.LoginDetails();
	}

	@When("^compare the first two item names$")
	public void compare_the_first_two_item_names() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Saucesort login=new Saucesort(driver);
	    login.Buttonclick();
	}

	@Then("^assert if the two names are in alpahbetical order$")
	public void assert_if_the_two_names_are_in_alpahbetical_order() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Saucesort login=new Saucesort(driver);
	   login.sort();
	   LaunchBrowser.tearDown();
	  // screenshot("sauce/src/test/resources/screenshotnav.png");
	   logger.error("message");
	}



}
