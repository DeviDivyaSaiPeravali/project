package com.sauce;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.masterthought.cucumber.json.Output;

public class Saucelogin {
	WebDriver driver;
	
	 By uname=By.id("user-name");
	 By pword=By.id("password");
	 By login=By.className("btn_action");

		/*
		 * public void link() { System.setProperty(
		 * "webdriver.chrome.driver","C://Users//divya//Downloads//chromedriver_win32 (4)//chromedriver.exe"
		 * ); driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 * 
		 * 
		 * }
		 */
	 public Saucelogin(WebDriver driver)
	 {
		 this.driver= driver;
	 }
	public void Login() //using webdriver get visting the testing website
	{
		driver.get("https://www.saucedemo.com");
		System.out.println(driver.getTitle());
	}
	public void LoginDetails(String un, String pw )
	{
	
		
		driver.findElement(uname).sendKeys(un); // passing the vaild mail
		driver.findElement(pword).sendKeys(pw); // passing the vaild password
	
		
	}
	public void Buttonclick() throws InterruptedException 
	{
		driver.findElement(login).click(); // loging button
		Thread.sleep(3000);
		 // close the current tab
	}
	
	public void submitt() 
	{
		//driver.close();
	}

}
