package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Assertion {
	
	public static WebDriver driver;
	
	@Test
	public void login()
	{
		
		 driver = new SafariDriver();

		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void checkTitle()
	
	{
		
		String Expected = "Instagram";
		String Actual ="Insta";
		//Assert.assertEquals(Actual,Expected);
		
		SoftAssert sa = new SoftAssert(); 
		sa.assertEquals(Actual, Expected);
		//sa.assertAll();
		System.out.println("Expected equals actual");
		}
		
	}

