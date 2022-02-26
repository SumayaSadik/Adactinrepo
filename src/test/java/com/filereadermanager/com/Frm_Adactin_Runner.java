package com.filereadermanager.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Adactin.Adactin.Base_Class;
import com.Adactin.Adactin.Book_Confirm;
import com.Adactin.Adactin.Book_Hotel;
import com.Adactin.Adactin.Login_Page;
import com.Adactin.Adactin.Search_Hotel;
import com.Adactin.Adactin.Select_Hotel;
import com.PoManager.Page_Object_Manager;

public class Frm_Adactin_Runner extends Base_Class {
	
	public static WebDriver driver;
	
	public static void main (String[] args) throws IOException, InterruptedException
	{
		driver = browserlaunch("chrome");
		
		Login_Page login = new Login_Page (driver);
		Search_Hotel search = new Search_Hotel(driver);
	    Select_Hotel select = new Select_Hotel (driver);
	    Book_Hotel book = new Book_Hotel(driver);
	    Book_Confirm confirm = new Book_Confirm(driver);
	    
	    String url = File_Reader_Manager.getInstanceFR().getInstanceCR().get_url();
	    launchUrl(url);
	    
		Page_Object_Manager pom = new Page_Object_Manager(driver);

	    //login
		sendkeys(pom.get_Instance_Login().getUsername(),File_Reader_Manager.getInstanceFR().getInstanceCR().get_username());
	    
	    sendkeys(pom.get_Instance_Login().getPassword(), File_Reader_Manager.getInstanceFR().getInstanceCR().get_password());

		click(pom.get_Instance_Login().getLogin());
		
		System.out.println("Logged in sucessfully");
		
		//search hotel
		
        sendkeys(pom.get_Instance_Searching().getLocation(), File_Reader_Manager.getInstanceFR().getInstanceCR().get_location());
	    
	   selectbyValue(pom.get_Instance_Searching().getHotels(), File_Reader_Manager.getInstanceFR().getInstanceCR().get_hotel());
	    
	    selectBytext (pom.get_Instance_Searching().getRoomtype(), File_Reader_Manager.getInstanceFR().getInstanceCR().get_roomtype());
	    
	    selectbyValue (pom.get_Instance_Searching().getAdultroom(), File_Reader_Manager.getInstanceFR().getInstanceCR().get_adultroom());
	    
	    selectbyValue (pom.get_Instance_Searching().getChildroom(), File_Reader_Manager.getInstanceFR().getInstanceCR().get_childroom());
	    
	    click (pom.get_Instance_Searching().getSearch());
	    
	    System.out.println("All details are updated and searching");
	    
        //Select Hotel page
	    
	    radiobtn(pom.get_Instance_Selection().getRadiobtn());
	    
	    click(pom.get_Instance_Selection().getContinue());
	   
	    System.out.println("Selected a Hotel");
	    
       //Book a hotel
	    
	    sendkeys (pom.get_Instance_Booking().getFirstname(),File_Reader_Manager.getInstanceFR().getInstanceCR().get_firstname());
	    sendkeys(pom.get_Instance_Booking().getLastname(), File_Reader_Manager.getInstanceFR().getInstanceCR().get_lastname());
	    sendkeys(pom.get_Instance_Booking().getAddress(), File_Reader_Manager.getInstanceFR().getInstanceCR().get_address());
	    sendkeys(pom.get_Instance_Booking().getCCnumber(),File_Reader_Manager.getInstanceFR().getInstanceCR().get_ccnumber());
	    selectbyValue(pom.get_Instance_Booking().getCCtype(),File_Reader_Manager.getInstanceFR().getInstanceCR().get_cctype());
	    selectBytext(pom.get_Instance_Booking().getCCexpmnth(), File_Reader_Manager.getInstanceFR().getInstanceCR().get_ccexpmnth());
	    selectBytext(pom.get_Instance_Booking().getCCYExpyear(),File_Reader_Manager.getInstanceFR().getInstanceCR().get_ccexpyr());
	    sendkeys(pom.get_Instance_Booking().getCvv(), File_Reader_Manager.getInstanceFR().getInstanceCR().get_cvv());
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
