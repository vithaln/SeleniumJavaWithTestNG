package com.selenium.code.TestNGDemo.batchTesting;

import org.testng.annotations.Test;

public class HomeScreenTest {

	
	@Test
	public void launchApplication() {
		System.out.println("Application is launched successfully...Test Passed");
	}
	@Test
	public void verifyTitle() {
		System.out.println("verifyied title successfully...Test Passed");
	}
	@Test
	public void verifyLogo() {
		System.out.println("verifyied logo successfully...Test Passed");
	}
}
