package com.sauce;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucelogout {
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
	 public Saucelogout(WebDriver driver)
	 {
		 this.driver= driver;
	 }
	public void Login() //using webdriver get visting the testing website
	{
		driver.get("https://www.saucedemo.com");
		System.out.println(driver.getTitle());
	}
	public void LoginDetails()
	{
	
		
		driver.findElement(uname).sendKeys("standard_user"); // passing the vaild mail
		driver.findElement(pword).sendKeys("secret_sauce"); // passing the vaild password
		
		
	}
	public void Button() throws InterruptedException 
	{
		driver.findElement(login).click(); // loging button
		Thread.sleep(3000);
		 // close the current tab
	}
	public void sort() {
		driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select")).click();
		//String actText =driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
		
	//Assert.assertEquals("Sauce Labs Backpack", actText);
	}
	public void logout() {
		driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	}
}
