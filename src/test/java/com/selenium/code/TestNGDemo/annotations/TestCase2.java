package com.selenium.code.TestNGDemo.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 {
	/*
	 * //let's implement some annotations on TestNG.
	 * 
	 * 1:@BeforeSuite-> this method will execute before <suite> in testng.xml file.
	 * 2:@AfterSuite-> this method will execute after <suite> in testng.xml file.
	 * 
	 * 3:@BeforeTest--> this method will execute before <test> in testng.xml .
	 * 4:@AfterTest--> this method will execute after <test> in testng.xml .
	 * 
	 * 5:@BeforeClass -> this method will execute before all methods in class.
	 * 6:@AfterClass-->this method will execute after all method executes in class.
	 * 
	 * 7:@BeforeMethod-> this method will execute before each test method executes.
	 * 8:@AfterMethod->this method will execute after each test method executes.
	 */

	

	@BeforeMethod
	public void openApplication() {
		System.out.println("This is test method opens the apps");
	}

	@Test
	public void test() {
		System.out.println("This is test method executed...");
	}
	
	@AfterMethod
	public void closeAppication() {
		System.out.println("This is test method closed apps");
	}
}
