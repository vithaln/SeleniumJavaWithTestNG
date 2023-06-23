package com.selenium.code.TestNGDemo.retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTesteCasseDemo {
/**
	mainly there are two ways to retry any test cases 
	1:testng-failed.xml
	2:IRetryAnalyzer interface
	
	if we want to retry very few test-cases then no need to use xml and IAnnotationListeners so
	we can use @Test(retryAnaylyzer=Retryanalyzer.class)
	*/
	
	
	@Test
	public void test1() {
		System.out.println("test1-->TestCase Passed");
	}

	//@Test(retryAnalyzer = RetryAnalyzerWay.class)
	@Test
	public void test2() {
		Assert.assertTrue(false);
		System.out.println("test2-->TestCase Passed");
	}

//	@Test(retryAnalyzer = RetryAnalyzerWay.class) //alternate way is testng.xml file we added IAnnotatonRetryWayTransformer
	@Test
	public void test3() {
		Assert.assertTrue(false);
		System.out.println("test3-->TestCase Passed");
	}

	@Test
	public void test4() {
		System.out.println("test4-->TestCase Passed");
	}

}
