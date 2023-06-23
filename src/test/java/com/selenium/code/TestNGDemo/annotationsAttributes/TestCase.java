package com.selenium.code.TestNGDemo.annotationsAttributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {
	
	//1:description->specify about testcase 2:timeout->we can set particular time to execute testcase if not execute that time it will  fail testcase..
	
	
	
	//@Test(description = "This is Test case 1 description")
	@Test(dependsOnMethods = {"test2"})
//	@Test(priority = 0)//default priority
	//@Test
	public void test1() {
		System.out.println("Test case 1");
	}
	
	
	@Test(description = "This is Test case 2 description")
	//@Test(timeOut = 200)
	//@Test
	public void test2() {
		
		try {
			Thread.sleep(400);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertTrue(false);//dependsOnMethods
		System.out.println("Test case 2");
	}
	
	
	@Test(description = "This is Test case 3 description")
	public void test3() {
		System.out.println("Test case 3");
	}

}
