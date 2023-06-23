package com.selenium.code.TestNGDemo.parrellelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ParallelTest3 {
	
	WebDriver driver;
	
	@Test
	public void verifyTitle() {
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
				
		driver.get("http://www.google.com");
		
		String expectedResult="Google";
		String actualResult=driver.getTitle();
		
		Assert.assertEquals(actualResult, expectedResult);
		
	}
	
	@Test
	public void verifyCurrentUrl() {
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();

		driver.get("http://www.google.com");
		
		String expectedResult="https://www.google.com/?gws_rd=ssl";
		String actualResult=driver.getCurrentUrl();
		
		Assert.assertEquals(actualResult, expectedResult);
		
	}
	

}
