package com.Adactin.runner;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.Adactin.Adactin.Base_Class;
import com.filereadermanager.com.File_Reader_Manager;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions (features ="src/test/java/com/Adactin/feature/Adactin.feature", glue = "stepdefinition/Adactin_StepDef.java")
	
	public class Test_Runner extends Base_Class {
		
		public static WebDriver driver;

		
		public static void setup() throws Throwable
		{
			String url = File_Reader_Manager.getInstanceFR().getInstanceCR().get_url();
		    driver = Base_Class.browserlaunch(url);
		}
		
		public static void tear_down()
		{
			driver.close();
		}

}
