package com.selenium.code.TestNGDemo.BrowserHeadless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxHeadless {

	public void headLess() {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions firefoxOptions=new FirefoxOptions();
		firefoxOptions.setHeadless(true);
		WebDriver driver=new FirefoxDriver(firefoxOptions);
		driver.get("https://www.google.com");
	
		String title = driver.getTitle();
		System.out.println(title);
	}
}
