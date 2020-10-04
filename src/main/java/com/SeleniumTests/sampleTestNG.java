package com.SeleniumTests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTestNG {

	@BeforeTest
	public void setup()
	{
		System.out.println("Inside setup");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Inside test1");
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("Inside teardown");
	}
}
