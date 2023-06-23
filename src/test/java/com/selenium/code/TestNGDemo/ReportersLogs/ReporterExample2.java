package com.selenium.code.TestNGDemo.ReportersLogs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReporterExample2 {

	@Test
	public void setUp() {
		Reporter.log("Before launching chrome browser");
		WebDriverManager.chromedriver().setup();
		Reporter.log("After launching chrome browser");

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		Reporter.log("after open google web page");

		WebElement searchBox = driver.findElement(By.name("q"));
		Reporter.log("find the searchBox element");

		searchBox.sendKeys("India Gate");
		Reporter.log("Enter the India Gate");

		searchBox.sendKeys(Keys.ENTER);
		Reporter.log("Enter the Key-Enter");
		Reporter.log("Before quit the browser");
		driver.quit();

	}

}
