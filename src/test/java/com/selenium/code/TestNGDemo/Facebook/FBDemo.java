package com.selenium.code.TestNGDemo.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBDemo {

	WebDriver driver;
	ReadConfigFile config;
	
	// setup method
	@BeforeMethod
	public void setUpSystem() {

		// launch chrome browser
		WebDriverManager.firefoxdriver().setup();
		// open web page
		driver = new FirefoxDriver();
		config =new ReadConfigFile();
		driver.get(config.getBaseURL());//fb website
		driver.manage().window().maximize();

	}

	// close browser after work is done.
	@AfterMethod
	public void stopSystem() {
		//String title = driver.getTitle();
		//System.out.println("Title of Shvintech web page:  " + title);
		//String url = driver.getCurrentUrl();
		//System.out.println("URL of Shvintech web page:  " + url);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

	@Test
	public void loginFaceBook() throws InterruptedException {

		config=new ReadConfigFile();
		
		// find element By Id for username.
		driver.findElement(By.id("email")).sendKeys(config.getUsename());
//		find element By Id for password
		driver.findElement(By.id("pass")).sendKeys(config.getPassword());

		// find element for login
		driver.findElement(By.name("login")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// switch to fb page
//		String windowHandle = driver.getWindowHandle();
//		driver.switchTo().window(windowHandle);
		driver.findElement(By.xpath("//input[@type='search']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("shvintech", Keys.ENTER);

		Thread.sleep(5000);
		// navigate to home page
		driver.navigate().to(config.getBaseURL());
		Thread.sleep(3000);
		// click on profile
		driver.findElement(
				By.xpath("//*[name()='g' and contains(@mask,'url(#:R3ab')]//*[name()='image' and contains(@x,'0')]"))
				.click();
		Thread.sleep(3000);
		// click on logout
		driver.findElement(By.xpath("//span[normalize-space()='Log Out']")).click();
		Thread.sleep(3000);

		/*
		 * String title = driver.getTitle();
		 * System.out.println("Title of Shvintech web page:  "+title); String url =
		 * driver.getCurrentUrl();
		 * System.out.println("URL of Shvintech web page:  "+url);
		 * 
		 * 
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 * JavascriptExecutor excutor=(JavascriptExecutor)driver;
		 * excutor.executeScript("window.scrollBy(0,500)");
		 */
	}
}
