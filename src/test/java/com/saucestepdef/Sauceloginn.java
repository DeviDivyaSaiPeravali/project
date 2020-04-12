package com.saucestepdef;

import java.io.File;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.LaunchBrowser;
//import com.baseclass.Wrapperclass;
import com.sauce.Saucelogin;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import cucumber.api.java.it.Date;

public class Sauceloginn  {
	
	public static Logger logger = (Logger) LogManager.getLogger(Sauceloginn.class.getName());
	
	 WebDriver driver;
	
	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LaunchBrowser.setUp("ch");
		this.driver=LaunchBrowser.driver;
		  
	    logger.debug("message");
	}

	@When("^the user opens Swaglabs homepage$")
	public void the_user_opens_Swaglabs_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Saucelogin loginpage = new  Saucelogin(driver);
		loginpage.Login();
	    logger.trace("message");
	}
	@When("^the user enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_valid_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Saucelogin loginpage = new  Saucelogin(driver);
		loginpage.LoginDetails(arg1,arg2);
		
	}


	
	

	
	   // logger.trace("message");
	
	@When("^click the login button$")
	public void click_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Saucelogin loginpage = new  Saucelogin(driver);

		loginpage.Buttonclick();
		
		
	}

	

	@Then("^Assert if the product_label is displayed$")
	public void assert_if_the_product_label_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    //loginpage.submitt();
	   // String actText =driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
		
		//Assert.assertEquals("Sauce Labs Backpack", actText);
		LaunchBrowser.tearDown();
	    logger.error("message");
	}



}
