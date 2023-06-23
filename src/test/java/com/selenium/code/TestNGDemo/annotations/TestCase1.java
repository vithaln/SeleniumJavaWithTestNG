package com.selenium.code.TestNGDemo.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

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
	
	@BeforeSuite//this method will execute just before the suite tag.
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@AfterSuite//after the suite tag
	public void afterSuite() {
		System.out.println("After Suite");
	}

	@BeforeTest//before test tag
	public void beforeTests() {
		System.out.println("before Test tag");
	}
	@AfterTest//after test tag
	public void afterTests() {
		System.out.println("after Test tag");
	}
	
	@BeforeClass//just before the classes , it executes only once.
	public void beforeClass() {
		System.out.println("Before class");
	}
	

	@AfterClass//after the classes...
	public void afterClass() {
		System.out.println("After class");
	}
	
	@BeforeMethod//just before the each test cases
	public void beforeTest() {
		System.out.println("Before test method");
	}

	@AfterMethod//after each test cases
	public void afterTest() {
		System.out.println("After test method");
	}

	@Test//indicates as test case
	public void test1() {
		System.out.println("This is test method 1");
	}

	@Test
	public void test2() {
		System.out.println("This is test method 2");
	}

}
