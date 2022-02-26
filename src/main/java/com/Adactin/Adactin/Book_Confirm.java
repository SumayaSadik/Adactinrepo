package com.Adactin.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Confirm {
	
	private WebDriver driver;
	
	@FindBy (id="search_hotel")
	
	private WebElement SearchHotel;

	@FindBy (id="my_itinerary")
	private WebElement myit;
	
	@FindBy (id="logout")
	private WebElement logout;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchHotel() {
		return SearchHotel;
	}

	public WebElement getMyit() {
		return myit;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
	public Book_Confirm (WebDriver driver)
	{
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		}
	}
