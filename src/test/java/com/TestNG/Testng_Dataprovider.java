package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Testng_Dataprovider {
	
	@Test(dataProvider="data1")
	public void methodData(String name, String pass)
	{
		System.out.println("Username=" +name+" passowrd= " +pass);
	}
	
	@Test
	@DataProvider(name = "data1")
	public Object[][] testData()
	{
		return new Object[][]
				{
			{"Sumie","2595"},{"Shintoo","0703"}
				};
		
	}
	

}
