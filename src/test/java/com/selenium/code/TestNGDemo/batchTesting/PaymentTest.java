package com.selenium.code.TestNGDemo.batchTesting;

import org.testng.annotations.Test;

public class PaymentTest {

	@Test
	public void cashOnDelivery() {
		System.out.println("Product is available for Cash on delivery...Test Passed");
	}
	@Test
	public void netBanking() {
		System.out.println("Product is available for netBanking..Test Passed");
	}
}
