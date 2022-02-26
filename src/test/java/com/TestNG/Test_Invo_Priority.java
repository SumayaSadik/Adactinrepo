package com.TestNG;

import org.testng.annotations.Test;

public class Test_Invo_Priority {
	
	@Test(invocationCount = 5)
	public void aMethod()
	{
		System.out.println("Testing 1");
	}
	
	@Test(priority = 1)
	public void bMethod() {
		System.out.println("Testing 2");
	}
	
	@Test(priority=3)
	public void cMethod()
	{
		System.out.println("Testing 3");
	}

	
	@Test(priority = -1)
	public void dMethod()
	{
		System.out.println("Testing 4");
	}
	
	@Test(priority = 2 )
	public void eMethod1()
	{
		
		System.out.println("Testing 5");
	}
}
