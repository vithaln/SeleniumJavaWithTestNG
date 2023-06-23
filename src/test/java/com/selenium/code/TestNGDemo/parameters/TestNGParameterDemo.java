package com.selenium.code.TestNGDemo.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterDemo {

	@Test
	@Parameters({"i","j"})
	public void add(int a,int b) {
		System.out.println("Addition is : "+(a+b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void sub(int a,int b) {
		System.out.println("Substraction is : "+(a-b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void multiply(int a,int b) {
		System.out.println("Multiply is : "+(a*b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void divide(int a,int b) {
		System.out.println("Dividedation is : "+(a/b));
	}
}
