package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Crossbrowser {
	
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void beforeLogin(String browser)
	{
		if (browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/admin/eclipse-workspace/Adactin/Driver/chromedriver");
			 driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
			System.out.println("Chrome Browser");
		}
		
		 else if (browser.equalsIgnoreCase("Safari"))
		 {
			 driver = new SafariDriver();

			driver.manage().window().maximize();
			driver.get("https://adactinhotelapp.com/");
            System.out.println("Safari Browser");
		 }
		 
	}
	
	@Test
	public void launch()
	{
		System.out.println("Browser Launched successfully");
		
	}
	
	@AfterClass
	public void afterLogin()
	{
		driver.quit();
	}
	
	
	

}
