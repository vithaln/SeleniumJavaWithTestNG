package com.selenium.code.TestNGDemo.xml;

import org.testng.annotations.Test;

/*main use of TestNG xml file is we can multiple class test cases at a same time.
but we need to convert TestNG. right click on project->TestNG->convert TestNG->next->ok.*/


public class CurrentAcTestClass1 {

	@Test
	public void test1() 
	{
		System.out.println("Current Account Class1 Test case: 1");
	}


	@Test
	public void test2() 
	{
		System.out.println("Current Account Class1 Test case: 2");
	}

}
