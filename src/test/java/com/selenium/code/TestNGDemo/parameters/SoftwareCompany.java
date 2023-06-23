package com.selenium.code.TestNGDemo.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SoftwareCompany {
	
	@Test
	@Parameters({"softwareCompany"})
	public void getName(String name) {
		System.out.println("Name of software Company is : "+name);
	}
	

}
