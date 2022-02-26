package com.POManager;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Adactin.Adactin.Base_Class;
import com.PoManager.Page_Object_Manager;

public class Pomanager_Runnerclass extends Base_Class {
	
	public static WebDriver driver;
	
	public static void main (String[] args) throws InterruptedException, IOException
	
	{
		
		driver = browserlaunch("chrome");
		
		launchUrl("https://adactinhotelapp.com/");
		
		//POM Initialization
		
		Page_Object_Manager pom = new Page_Object_Manager(driver);
		
		//Login
		
		sendkeys(pom.get_Instance_Login().getUsername(), "Sumaya25");
		
		sendkeys(pom.get_Instance_Login().getPassword(), "K9B54W");
		
		click(pom.get_Instance_Login().getLogin());
		
		System.out.println("Logged in sucessfully");
		
		//search hotel page

		sendkeys(pom.get_Instance_Searching().getLocation(), "Sydney");
	    
	    selectBytext(pom.get_Instance_Searching().getHotels(), "Hotel Sunshine");
	    
	    selectBytext (pom.get_Instance_Searching().getRoomtype(), "Deluxe");
	    
	    selectbyValue (pom.get_Instance_Searching().getAdultroom(), "4");
	    
	    selectbyValue (pom.get_Instance_Searching().getChildroom(), "2");
	    
	    click (pom.get_Instance_Searching().getSearch());
	    
	    System.out.println("All details are updated and searching");
	    
	    //Select Hotel page
	    
	    radiobtn(pom.get_Instance_Selection().getRadiobtn());
	    
	    click(pom.get_Instance_Selection().getContinue());
	    
	    System.out.println("Selected a Hotel");
	   
	    //Book a hotel
	    
	    sendkeys (pom.get_Instance_Booking().getFirstname(),"Sumaya");
	    sendkeys(pom.get_Instance_Booking().getLastname(),"Sadikbasha");
	    sendkeys(pom.get_Instance_Booking().getAddress(), "30, Ranjith Road, Chennai-600085");
	    sendkeys(pom.get_Instance_Booking().getCCnumber(),"12345678910121312");
	    selectbyValue(pom.get_Instance_Booking().getCCtype(),"VISA");
	    selectBytext(pom.get_Instance_Booking().getCCexpmnth(),"May");
	    selectBytext(pom.get_Instance_Booking().getCCYExpyear(),"2022");
	    sendkeys(pom.get_Instance_Booking().getCvv(), "787");
	    click (pom.get_Instance_Booking().getBooknow());
	    
	    System.out.println("Hotel Booked");
		
		//Booking confirmation
	    
	    Thread.sleep(6000);
	    
	    click(pom.get_Instance_Confirmation().getMyit());
	    System.out.println("viewed My Itinerary");
	    
	    
	    Thread.sleep(5000);
	    
	    click (pom.get_Instance_Confirmation().getLogout());
	    System.out.println("Loggedout sucessfully");


	}
	

	
	
}
