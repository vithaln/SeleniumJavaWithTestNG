package com.selenium.code.liberty;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_1 {

	@Test
	public void test() throws InterruptedException, IOException {
		ReadCredentials credentials=new ReadCredentials();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(credentials.getLoginURL());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='p-button-label p-c']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("loginForm:username")).sendKeys(credentials.getUserName());
		driver.findElement(By.id("loginForm:password")).sendKeys(credentials.getPassword());
		Thread.sleep(4000);
		driver.findElement(By.id("loginForm:loginButton")).click();
	}
}
