package com.saucestepdef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;

import com.baseclass.LaunchBrowser;
//import com.baseclass.Wrapperclass;
import com.sauce.SauceNav;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Saucenav {
	WebDriver driver;
	public static Logger logger = (Logger) LogManager.getLogger(Sauceloginn.class.getName());
	//SauceNav nav=new SauceNav();
	@Given("^lAUNCHIng the browser$")
	public void launching_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   // nav.link();
		LaunchBrowser.setUp("ch");
		this.driver= LaunchBrowser.driver;
	    logger.debug("message");
	}

	@When("^lAUNCHIng the application$")
	public void launching_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SauceNav nav=new SauceNav(driver);

	    nav.Login();
	    logger.trace("message");
	}

	@When("^cLick on menu bar$")  
	public void click_on_menu_bar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SauceNav nav=new SauceNav(driver);

	    nav.LoginDetails();
	    logger.trace("message");
	}

	@When("^click on About$")
	public void click_on_About() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SauceNav nav=new SauceNav(driver);

	    nav.Button();
	    
	   // screenshot("src/main/resources/screenshot/nav.png");
	}

	@Then("^assert if the page is navigating to saucelabs$")
	public void assert_if_the_page_is_navigating_to_saucelabs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SauceNav nav=new SauceNav(driver);

	    nav.about();
	    LaunchBrowser.tearDown();
	    
	    logger.error("message");
	}


}