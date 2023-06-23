package com.selenium.code.TestNGDemo.parrellelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ParallelTest2 {
	
	WebDriver driver;
	
	@Test
	public void verifyLogo() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
				
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		WebElement logo = driver.findElement(By.xpath("//div[@class='app_logo']"));
		Assert.assertTrue(logo.isDisplayed());
		
	}
	
	@Test
	public void verifyCurrentUrl() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		
		String expectedResult="https://www.saucedemo.com/";
		String actualResult=driver.getCurrentUrl();
		
		Assert.assertEquals(actualResult, expectedResult);
		
	}
	

}
