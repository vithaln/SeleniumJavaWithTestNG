package com.selenium.code.TestNGDemo.BrowserHeadless;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowserHeadlessTesting {

@Test
public void testChromeBrowserHeadless() {
	
//	for achieving browser headless we need to add tw dependancies 
//	1:HtmlUnitDriver 2:HtmlUnitDriver-dependancy
	
	
	//headless/browser-less scripts
	ChromeOptions chromeOptions=new ChromeOptions();
	chromeOptions.setHeadless(true);
//	chromeOptions.addArguments("--disableHeadless");
	WebDriverManager.chromedriver().setup();
//	WebDriver driver=new ChromeDriver();
	WebDriver driver=new ChromeDriver(chromeOptions);
	driver.get("https://www.google.com");
	System.out.println("BEFORE TITLE: "+driver.getTitle());
	System.out.println("BEFORE URL: "+driver.getCurrentUrl());
	WebElement searchBox = driver.findElement(By.name("q"));
	searchBox.sendKeys("shvintech india");
	searchBox.sendKeys(Keys.ENTER);
	System.out.println();
	System.out.println("AFTER TITLE: "+driver.getTitle());
	System.out.println("AFTER URL: "+driver.getCurrentUrl());

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	driver.close();
	
	
}

}
