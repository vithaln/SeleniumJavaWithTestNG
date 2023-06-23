package com.selenium.code.TestNGDemo.annotationsAttributes;

import org.testng.annotations.Test;

public class TestCaseGroupAttributes {

	@Test(groups = "softaware company",priority = -1)
	public void shvinTech() {
		System.out.println("shvintech");
	}
	
	@Test(groups = "softaware company")
	public void infosys() {
		System.out.println("Infosys");
	}
	@Test(groups = "softaware company")
	public void wipro() {
		System.out.println("Wipro");
	}
	
	@Test(groups = "automobile company")
	public void tata() {
		System.out.println("TATA");
	}
	@Test(groups = "automobile company")
	public void maruti() {
		System.out.println("Marutti");
	}
}
