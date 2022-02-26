package com.Adactin.Adactin;

import org.openqa.selenium.WebDriver;

public class Adactin_Runnerclass extends Base_Class {
	
	public static WebDriver driver;

	public static void main (String [] args) throws InterruptedException
	{
		
		//login page
		
	driver = browserlaunch("chrome");
	
	launchUrl("http://adactinhotelapp.com/index.php");
	
	Login_Page lp = new Login_Page(driver);
	
   sendkeys(lp.getUsername(), "Sumaya25");
	
	sendkeys(lp.getPassword(), "K9B54W");
	
	click(lp.getLogin());
	
	System.out.println("Logged in sucessfully");
	
	
	//search hotel page
	
	Search_Hotel sh = new Search_Hotel(driver);
	
    sendkeys(sh.getLocation(), "Sydney");
    
    selectIndex(sh.getHotels(), 2);
    
    selectBytext (sh.getRoomtype(), "Double");
    
    selectbyValue (sh.getAdultroom(), "4");
    
    selectbyValue (sh.getChildroom(), "2");
    
    click (sh.getSearch());
    
    System.out.println("All details are updated");
    
    //select hotel
    
    Select_Hotel choose = new Select_Hotel (driver);
    radiobtn(choose.getRadiobtn());
    
    click(choose.getContinue());
    
    System.out.println("Selected a Hotel");
    
    //Book a hotel
    
    Book_Hotel bh = new Book_Hotel(driver);
    sendkeys (bh.getFirstname(),"Sumaya");
    sendkeys(bh.getLastname(),"Sadikbasha");
    sendkeys(bh.getAddress(), "30, Ranjith Road, Chennai-600085");
    sendkeys(bh.getCCnumber(),"12345678910121312");
    selectbyValue(bh.getCCtype(),"VISA");
    selectBytext(bh.getCCexpmnth(),"May");
    selectBytext(bh.getCCYExpyear(),"2022");
    sendkeys(bh.getCvv(), "787");
    click (bh.getBooknow());
    
    System.out.println("Hotel Booked");
    
    //My Itinerary
    
    Thread.sleep(5000);

    
    Book_Confirm bc = new Book_Confirm(driver);
    click(bc.getMyit());
        
    Thread.sleep(3000);
    
    Book_Confirm logout = new Book_Confirm (driver);
    click (logout.getLogout());
    
    }
}
