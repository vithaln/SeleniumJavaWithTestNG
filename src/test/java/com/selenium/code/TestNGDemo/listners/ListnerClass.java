package com.selenium.code.TestNGDemo.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerClass  implements ITestListener{

	//first time will execute like class level
	public void onStart(ITestContext context) {
		System.out.println("on Start method called==first ");
	}
	
	
//on test finish after finishing all test cases
	public void onFinish(ITestContext context) {
		System.out.println("On finish method called====last");
	}
	
	//on start will execute..
	public void onTestStart(ITestResult result) {
		
		System.out.println("On Test Start method called...");
		}
	
	
	//on test successs will execute aftyer test case passed
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("On Test successfull method called..==>"+result.getName());
	}
//on test failure will execute after test fails
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure method called==> "+result.getName());
	}
//on test skipped will execute sfter test skipped.
	public void onTestSkipped(ITestResult result) {
		System.out.println("on Test Skipped method called==> "+result.getName());
	}

	

	

	

	

	
		

}
