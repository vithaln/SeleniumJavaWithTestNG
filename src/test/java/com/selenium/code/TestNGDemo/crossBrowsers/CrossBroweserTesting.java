package com.selenium.code.TestNGDemo.crossBrowsers;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBroweserTesting {

	// declare Webdriver
	WebDriver driver;

	// this method will execute just before each test methods executes

	@BeforeMethod
	@Parameters("browserName")
	public void launchBrowsers(String browser) {

		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "ms-edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;

		}

	}
	@Test
	public void loginPage() {
		
		//open greayHR web page...
		driver.get("http://www.saucedemo.com");
		
		//find LoginId element and enter your ID
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		//find password element and enter password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//find element by using By.xpath
		driver.findElement(By.id("login-button")).click();
		
		
	}

	@AfterMethod
	public void closeBrowser() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//close current TAB.
		driver.close();
	}
}
