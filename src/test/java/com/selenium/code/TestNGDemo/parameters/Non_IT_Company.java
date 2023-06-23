package com.selenium.code.TestNGDemo.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Non_IT_Company {

	@Test
	@Parameters({"non-IT"})
	public void getName(String name) {
		System.out.println("Name of Non-IT company: "+name);
	}
}
