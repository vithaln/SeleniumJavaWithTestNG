package com.selenium.code.TestNGDemo.listnersWithExtentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestExample {

	WebDriver driver;
/**
	@Test
	public void verifyTitle() {
		// launch chrome browser
		WebDriverManager.chromedriver().setup();

		// instanciate Webdriver
		driver = new ChromeDriver();

		// open web page
		driver.get("https://practicetestautomation.com/practice-test-login/");

		// find username
		driver.findElement(By.name("username")).sendKeys("student");

		// find password
		driver.findElement(By.name("password")).sendKeys("Password123");
		;

		// find login and click.
		driver.findElement(By.id("submit")).click();

		// find actual title
		String actualTitle = driver.getTitle();
		// expected Title
		String expectedTitle = "Logged In Successfully | Practice Test Automation";

		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Verifyied title");
	}
*/
	@Test
	public void tetsfail() {

		System.out.println("Test case failed..");
		Assert.assertTrue(false);
	}

	@Test
	public void testSkipped() {
		System.out.println("Test case skipped");

		throw new SkipException("test skipped exception thrown");
	}

	@Test
	public void TestExamples() {
		System.out.println("sample Testing");
	}

	@Test
	public void TestExamples1() {
		System.out.println("sample Testing-2");
	}

	@AfterClass
	public void stop() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

	

}
