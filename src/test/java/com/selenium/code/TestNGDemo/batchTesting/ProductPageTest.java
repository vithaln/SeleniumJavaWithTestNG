package com.selenium.code.TestNGDemo.batchTesting;

import org.testng.annotations.Test;

public class ProductPageTest {

	@Test
	public void addProductToWishList() {
		System.out.println("Product added successfully...Test Passed");
	}
	@Test
	public void addProductToCart() {
		System.out.println("Product is added into cart successfully...Test Passed");
	}
	@Test
	public void selectQuantity() {
		System.out.println("Product quantity is selected successfully...Test Passed");
	}
}
