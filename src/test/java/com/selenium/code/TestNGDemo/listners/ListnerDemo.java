package com.selenium.code.TestNGDemo.listners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//there's two ways to integrate with Listenres on is annotation based and xml based in tesng.xml.


//@Listeners(com.selenium.code.TestNGDemo.listners.ListnerClass.class)
public class ListnerDemo {

	// https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

	@Test
	public void verifyTitle() {
		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		
		//instanciate Webdriver
		WebDriver driver=new ChromeDriver();
		
		//open web page 
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//find username
		driver.findElement(By.name("username")).sendKeys("student");
		
		//find password
		driver.findElement(By.name("password")).sendKeys("Password123");;
		
		//find login and click.
		driver.findElement(By.id("submit")).click();
		
		
		
		
		//find actual title
		String actualTitle = driver.getTitle();
		//expected Title
		String expectedTitle="Logged In Successfully | Practice Test Automation";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Verifyied title");
	}
	
	@Test
	public void tetsfail() {
		
		System.out.println("Test case failed..");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testSkipped() {
		System.out.println("Test case skipped");
		
		throw new SkipException("test skipped exception thrown" );
	}

}
