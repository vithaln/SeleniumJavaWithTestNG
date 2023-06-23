package com.selenium.code.TestNGDemo.dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {

	
	//Test Scenario...
	/*
	 * // search keyword combination eg:
	 *1: Maharashtra Mumbai
	 *2: Karanatak  Banglore
	 *3: Talengan hyderbad
	 */
	@DataProvider(name = "dataProvider")
	public Object[][] dataProviderMethod(){
		
		Object[][] keywords=new Object[3][2];
		keywords[0][0]="Maharashtra";
		keywords[0][1]="Mumbai";
		
		keywords[1][0]="Karnatak";
		keywords[1][1]="Banglore";
		
		keywords[2][0]="Telangana";
		keywords[2][1]="Hyderabad";
		
		return keywords;
		
	}
	
	
	@Test(dataProvider = "dataProvider")
	public void doGoogleSearch(String state, String capital) {
		
		//launch firefox browser
		WebDriverManager.firefoxdriver().setup();
		
		//open web page
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		
		//find searchbox element
		WebElement searchBox = driver.findElement(By.name("q"));
		//put value on searchBox
		searchBox.sendKeys(state+" "+capital);
		//click Google Search.
		driver.findElement(By.name("btnK")).submit();
		
	}
	
	
	
	
}
