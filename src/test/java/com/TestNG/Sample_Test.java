package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample_Test {
		
	

	
	@BeforeSuite
	public void setup()

	{
		
		System.out.println("Setting up the broswer");
	}
	
	@BeforeTest
	public void browserlaunch()
	{
		System.out.println("Launch the chrome browser");
	}
	
	@BeforeClass
	public void url()
	{
		System.out.println("Enter the url");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("Login to the application");
	}
	
	@Test
	public void SearchElectronics ()
	{
		System.out.println("Search for the electronics");
		
	}
	
	@Test
	public void Searchcomputers()
	{
		System.out.println("Search for computers");
		
	}
	
	@AfterMethod
	public void verify()
	{
		System.out.println("Verify if elecronic sections are displayed");
		
	}
	
	
	@AfterClass
	public void logout()
	{
		System.out.println("Logout the application");
	}
	
	@AfterTest
	public void closebrowser()
	{
		System.out.println("Close the browser");
	}
	
	@AfterSuite
	public void deletecookies()
	{
		System.out.println("Delete cookies");
	}

}
