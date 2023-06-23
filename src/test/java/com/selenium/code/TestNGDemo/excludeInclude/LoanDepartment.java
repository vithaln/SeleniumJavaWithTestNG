package com.selenium.code.TestNGDemo.excludeInclude;

import org.testng.annotations.Test;

public class LoanDepartment {

	//to disable testcases there's two ways
	//1:@Test(enabled=false)
	//2:xml based by adding methods tag.
	
	
	@Test(enabled = false)
	public void webLoginPersonalLoan() {
		System.out.println("Web login personal loan...");
	}
	@Test
	public void mobileLoginPersonalLoan() {
		System.out.println("Mobile login personal loan...");
	}
	@Test
	public void apiLoginPersonalLoan() {
		System.out.println("API login personal loan...");
	}
	
	@Test
	public void webLoginAuttomobileLoan() {
		System.out.println("Web login Automobile loan...");
	}
	@Test
	public void mobileLoginAutomobileLoan() {
		System.out.println("Mobile login Automobile loan...");
	}
	@Test
	public void apiLoginAutomobileLoan() {
		System.out.println("API login Automobile loan...");
	}
}
