package com.Adactin.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {
	
	private WebDriver driver;
	
	@FindBy (name="check_all")
	private WebElement checkall;


	@FindBy (name="logout")
	private WebElement logout;
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckall() {
		return checkall;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	public Booked_Itinerary (WebDriver driver)
	{
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		}
	}
