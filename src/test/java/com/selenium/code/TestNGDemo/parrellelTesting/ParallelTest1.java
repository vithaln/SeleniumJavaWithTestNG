package com.selenium.code.TestNGDemo.parrellelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ParallelTest1 {
	
	WebDriver driver;
	
	@Test
	public void verifyTitle() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
				
		driver.get("http://www.google.com");
		
		String expectedResult="Google";
		String actualResult=driver.getTitle();
		
		Assert.assertEquals(actualResult, expectedResult);
		
	}
	
	@Test
	public void verifyCurrentUrl() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		driver.get("http://www.google.com");
		
		String expectedResult="https://www.google.com/?gws_rd=ssl";
		String actualResult=driver.getCurrentUrl();
		
		Assert.assertEquals(actualResult, expectedResult);
		
	}
	

}
