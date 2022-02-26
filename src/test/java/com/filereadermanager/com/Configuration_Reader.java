package com.filereadermanager.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//create a package for Filereadermanager
//Create an object for file input stream to read the data from the file

//Create a class 
public class Configuration_Reader {
	
	public static Properties p;
	
	//Create a constructor 
	
	public Configuration_Reader() throws IOException
	{
		//create a file , pass the path of the property file 

		File f = new File ("/Users/admin/eclipse-workspace/Adactin/Configuration/Configuration.properties");
		
		//create an object for FileInputStream to read the data from the file
        //classname refnam = new classname
		FileInputStream fis = new FileInputStream(f);
		
		//create an object for properties class and make as static
        
		
		p= new Properties();
		
		//load the file using refname.load();
		p.load(fis);
		
		
	}
	
	public String get_url()
	{
		String url = p.getProperty("url");
		return url;
	}
	
	public String get_username()
	{
		String username = p.getProperty("username");
		return username;
	}
	
	public String get_password()
	{
		String password = p.getProperty("password");
		return password;
		
	}
	
	public String get_location()
	{
		String location = p.getProperty("location");
		return location;
	}
	
	public String get_hotel()
	{
		String hotel = p.getProperty("hotel");
		return hotel;
	}
	
	public String get_roomtype()
	{
		String roomtype = p.getProperty("roomtype");
		return roomtype;
	}
	
	public String get_adultroom()
	{
		String adultroom = p.getProperty("adultroom");
		return adultroom;
	}
	
	public String get_childroom()
	{
		String childroom = p.getProperty("childroom");
		return childroom;
	}
	
	public String get_firstname()
	{
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	
	public String get_lastname()
	{
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	
	public String get_address()
	{
		String address = p.getProperty("address");
		return address;
	}
	
	public String get_ccnumber()
	{
		String ccnumber =p.getProperty("ccnumber");
		return ccnumber;
	}
	
	public String get_cctype()
	{
		String cctype = p.getProperty("cctype");
		return cctype;
	}
	
	public String get_ccexpmnth()
	{
		String ccexpmnth= p.getProperty("ccexpmnth");
		return ccexpmnth;
	}

	public String get_ccexpyr()
	{
	String ccexpyr = p.getProperty("ccexpyr");
	return ccexpyr;
	
}
	
	public String get_cvv()
	{
		String ccv = p.getProperty("cvv");
		return ccv;
	
	}

}