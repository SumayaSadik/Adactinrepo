package com.TestNG;

import org.testng.annotations.Test;

public class Test_timeout {
	
	@Test(timeOut=1000)
	public void First_Test() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("First Test Execution");
	}

	@Test
	public void Second_Test()
	{
		System.out.println("Second Test Execution");
	}
	
	@Test
	public void Third_Test()
	{
		System.out.println("Third Test Execution");
	}
	
}
