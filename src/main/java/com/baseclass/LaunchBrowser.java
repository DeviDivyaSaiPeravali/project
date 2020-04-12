package com.baseclass;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
//import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import sun.util.calendar.BaseCalendar.Date;

public class LaunchBrowser {
	public static WebDriver driver;
	public static void setUp(String browsername) {
		if(browsername.equalsIgnoreCase("ch")) {
		System.setProperty(  "webdriver.chrome.driver","C://Users//divya//Downloads//chromedriver_win32 (4)//chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", "C:/Users/divya/Downloads/geckodriver-v0.26.0-win64/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 
		  driver.get("https://www.saucedemo.com");
		  
		
}

	public static void tearDown()
	{
		Date date = new Date();
		String dateStr = date.toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file =ts.getScreenshotAs(OutputType.FILE);
		file.renameTo(new File("src/test/resources/screenshot/image" +dateStr+ ".png"));
		driver.quit();
		
		
	}

}
