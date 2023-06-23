package com.selenium.code.TestNGDemo.assertations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertAndHardClassDemo {

	// softAssert -> if any test methods fail it'll not throw error/and stop over
	// code directly.
//hard Assert->if any test case fails it will terminated over there.

	@Test
	public void verifyTests() {
		// launch chrome browser
		WebDriverManager.chromedriver().setup();
		// instancite webdriver
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.testyou.in/Login.aspx");

		String expectedTitle = "Login Page | Test Creator - TestYoud";

		String actualTitle = driver.getTitle();

		SoftAssert softAssert = new SoftAssert();

		// hard Assert
		System.out.println("verifying Title");

		// Assert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertEquals(actualTitle, expectedTitle);
		// 2nd case
		String currentUrl = driver.getCurrentUrl();
		String expectedURL = "http://www.testyou.in/Login.aspx";

		// hard assert
		// Assert.assertEquals(currentUrl, expectedURL);

//		softAssert
		System.out.println("verifying URL");
		softAssert.assertEquals(currentUrl, expectedURL);

		// report all failures tests compulsary to use it.
		softAssert.assertAll();

	}
}
