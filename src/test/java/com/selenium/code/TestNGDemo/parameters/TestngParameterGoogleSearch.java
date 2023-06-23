package com.selenium.code.TestNGDemo.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngParameterGoogleSearch {

	@Test
	@Parameters({"keyword"})
	public void doGoogleSearch(String searchData) {
		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		
		//create webdriver object
		WebDriver driver=new ChromeDriver();
		
		//open web page 
		driver.get("https://www.google.com");
		
		//find search box element
		WebElement searchBox = driver.findElement(By.id("APjFqb"));
		
		//send data to the search box
		searchBox.sendKeys(searchData);
		String actualResult = searchBox.getAttribute("value");
		String expectedResult=searchData;
		
		Assert.assertEquals(actualResult, expectedResult);
		//driver.quit();
		
		
		
	}
}
