package com.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Testng_Groups {
	
	public static WebDriver driver;

	
	@BeforeTest(groups = "Test1")
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/admin/eclipse-workspace/Adactin/Driver/chromedriver");
		 driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		System.out.println("Browser Launched successfully");
		
	}
	
	@Test(groups = "Test1")
	public void login()
	{
		String Title = driver.getTitle();
		System.out.println("Title of the page: "+Title);
	}
	
	@Test(groups = "Test2")
	public void signin() 
	{
		driver.navigate().to("https://www.facebook.com");
		System.out.println("Navigated to facebook page successfully");
	}
	
	@Test(groups="Test3")
	public void getCurrenturl()
	{
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: "+currentUrl);
		
	}
	
	@AfterTest(groups = {"Test1","Test2"})
	public void closebrowser()
	{
		System.out.println("Close the browser");
	}
	

}
