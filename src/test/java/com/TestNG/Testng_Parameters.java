package com.TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Testng_Parameters {
	@Test
	@Parameters({"Sana"})
	public void name1(String name)
	{
		System.out.println("Username1; " +name);
	}
	
	
	@Test
	@Parameters({"Riya","2595"})
    public void Up(@Optional("Sameeh")String name1,String password)
    {
    	System.out.println("Username " +name1);
    	System.out.println("Passowrd "+password);
    }
	
	
}


