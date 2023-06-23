package com.selenium.code.TestNGDemo.ReadPropertiesfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestExample {

	
	@Test
	public void test1() {
		
		ReadConfigFile cg=new ReadConfigFile();
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get(cg.getURL());
		driver.findElement(By.id("user-name")).sendKeys(cg.getUsename());
		driver.findElement(By.id("password")).sendKeys(cg.getPassword());
		driver.findElement(By.id("login-button")).click();
	}
}
