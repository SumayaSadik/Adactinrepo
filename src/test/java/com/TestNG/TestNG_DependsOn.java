package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestNG_DependsOn {
	public static WebDriver driver;

	
	@Test
	public void BrowserlaunchA()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/admin/eclipse-workspace/Adactin/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		System.out.println("Browser Launched successfully");
		
		//driver.quit();
	}
	
	@Test(expectedExceptions= NullPointerException.class,dependsOnMethods="getC")
	public void navigateto()
	{
		driver.navigate().to("www.facebook.com");
		System.out.println("Navigated sucessfully");
		
	}
	
	@Test(dependsOnMethods="getD")
	public void getC()
	{
		System.out.println("GetC");
	}
	
	
	@Test (dependsOnMethods="BrowserlaunchA")
	public void getD()
	{
		System.out.println("GetD");
	}

}
