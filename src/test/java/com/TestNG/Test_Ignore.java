package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Test_Ignore {
	
	@Test
	public void aMethod()
	{
		System.out.println("Test Process 1");
	}
	@Ignore
	@Test
	public void bMethod()
	{
		System.out.println("Test Process 2");
	}
	
	
	public void cMethod()
	{
		System.out.println("Test process 3");
	}
	@Test
	public void dMethod()
	{
		System.out.println("Test Process 4");
	}
	
	@Test(enabled = false)
	public void eMethod()
	{
		System.out.println("Test Process 5");
	}
	
	@Test
	public void fMethod()
	{
		System.out.println("Test Process 6");
	}
	
}
