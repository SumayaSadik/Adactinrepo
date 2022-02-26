package com.filereadermanager.com;

import java.io.IOException;

public class File_Reader_Manager {
	
	//create a private constructor
	
	private File_Reader_Manager(){
	}
	
	//create an object for file reader manager using getInstance and return the object
	
	public static File_Reader_Manager getInstanceFR()
	{
		File_Reader_Manager  reader = new File_Reader_Manager();
		return reader;
	}
	
	public Configuration_Reader getInstanceCR() throws IOException
	{
		Configuration_Reader helper = new Configuration_Reader();
		return helper;
	}
	
	
	

}
