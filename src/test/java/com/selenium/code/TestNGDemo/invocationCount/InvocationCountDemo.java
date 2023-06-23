package com.selenium.code.TestNGDemo.invocationCount;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class InvocationCountDemo {

	//we can run multiple times any test cases withowt using loop*
//	by using invocationCout attributes
	
	
	@Test(invocationCount = 5)
	public void test1(ITestContext context) {
		
		//get current invocation counts
		int currentInvocationCount = context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("test1()...");
		System.out.println("Executing==> "+currentInvocationCount);
	}
	@Test
	public void test2() {
		System.out.println("test2()...");
	}
}
