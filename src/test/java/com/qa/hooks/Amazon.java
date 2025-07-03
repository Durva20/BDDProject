package com.qa.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Amazon {
	
	@Before("@smoke")
	public void setup_browser()
	{
		System.out.println("Launch browser");
		
	}
	//@Before(order=2)
	//public void setup(Scenario sc)
	//{
	//	System.out.println("Launch amazon application");
	//	System.out.println(sc.getName());
	//}
	
	@After("@regression")
	public void tearDown(Scenario sc)
	{
		System.out.println("Close the browser");
		System.out.println(sc.getName());
	}

/*	@BeforeStep
	public void takeScreenshot()
	{
		System.out.println("take screenshot");
	}
	@AfterStep
	public void refreshPage()
	{
		System.out.println("refresh page");
	}*/
}
