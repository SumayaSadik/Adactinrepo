package com.TestNG;

import org.testng.annotations.Test;

public class Test_Expected_Exception {
	
	@Test
	public void method1()
	{
		String s1 = "Sumaya";
		System.out.println(s1.length());
	}
	
	
	@Test(expectedExceptions= NullPointerException.class)
	public void method2()
	{
		String s = null;
	    System.out.println(s.length());
	}

	
	
	

}
