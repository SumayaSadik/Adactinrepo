package com.Adactin.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	private WebDriver driver;
	
	@FindBy (name="location")
	private WebElement location;
	
	@FindBy (id="hotels")
	private WebElement hotels;
	
	@FindBy (name="room_type")
	private WebElement roomtype;
	
	@FindBy (name="room_nos")
	private WebElement roomno;
	
	@FindBy (name="datepick_in")
	private WebElement Checkin;
	
	@FindBy (name="datepick_out")
	private WebElement Checkout;
	
	@FindBy (id="adult_room")
	private WebElement Adultroom;
	
	@FindBy (name="child_room")
	private WebElement Childroom;
	
	@FindBy (id="Submit")
	private WebElement search;
	
	@FindBy (id="Reset")
	private WebElement reset;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getCheckin() {
		return Checkin;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	public WebElement getAdultroom() {
		return Adultroom;
	}

	public WebElement getChildroom() {
		return Childroom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getReset() {
		return reset;
	}

	public Search_Hotel (WebDriver driver)
	{
		{
			this.driver = driver;
			
			PageFactory.initElements (driver,this);

		}

	}
	

}


