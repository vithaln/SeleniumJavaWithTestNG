package com.selenium.code.TestNGDemo.crossBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class CrossBrowseDemo {

	
	//launch Browser
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browserName")
	public void launchBrowsers(String browserName) {
		
		switch(browserName.toLowerCase()) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		default: 
			driver=null;
			break;
		
		}
	}
	
	@Test
	public void veriFyTitle() {
		
		driver.get("https://www.google.com");
		
		/*
		 * String actualTitle = driver.getTitle(); String expectedTitle="Google";
		 * 
		 * Assert.assertEquals(actualTitle, expectedTitle);
		 */
		System.out.println("Title of the Web page: "+driver.getTitle());
		System.out.println("URL of the Web page: "+driver.getCurrentUrl());

	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	
}
