package com.selenium.code.TestNGDemo.base;

import org.testng.annotations.Test;

//in TestNG does not require main method and methods should not be static.
//for TestNG we need to install testNG plugin in eclipse and add dependancy in pom.xml.

public class TestExample {

	@Test(priority = 2)
	public void test1() {
		System.out.println("Test case 1 ");
	}

	@Test
	public void test2() {
		System.out.println("Test case 2 ");
	}
}
