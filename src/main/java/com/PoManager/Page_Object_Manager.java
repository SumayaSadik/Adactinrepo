package com.PoManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.Adactin.Book_Confirm;
import com.Adactin.Adactin.Book_Hotel;
import com.Adactin.Adactin.Booked_Itinerary;
import com.Adactin.Adactin.Login_Page;
import com.Adactin.Adactin.Search_Hotel;
import com.Adactin.Adactin.Select_Hotel;

public class Page_Object_Manager {
	
	private WebDriver driver;
	
	private Login_Page login;
	private Select_Hotel selection;
	private Search_Hotel searching;
	private Book_Hotel Booking;
	private Book_Confirm confirmation;
	private Booked_Itinerary logout;
	
	
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public Login_Page get_Instance_Login() {
		
		//Login login = new Login(driver)
		login = new Login_Page(driver);
		return login;
	}
	public Select_Hotel get_Instance_Selection() {
		selection = new Select_Hotel(driver);
		return selection;
	}
	public Search_Hotel get_Instance_Searching() {
		searching = new Search_Hotel(driver);
		return searching;
	}
	public Book_Hotel get_Instance_Booking() {
		Booking = new Book_Hotel(driver);
		return Booking;
	}
	public Book_Confirm get_Instance_Confirmation() {
		confirmation = new Book_Confirm(driver);
		return confirmation;
	}
	public Booked_Itinerary get_Instance_Logout() {
		logout = new Booked_Itinerary(driver);
		return logout;
	}
	
	
	public Page_Object_Manager (WebDriver pomfinal)
	{
		this.driver = pomfinal;
		PageFactory.initElements(driver, this);
	}
	
	
}
	