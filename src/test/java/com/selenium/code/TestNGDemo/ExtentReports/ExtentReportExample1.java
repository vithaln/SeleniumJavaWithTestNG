package com.selenium.code.TestNGDemo.ExtentReports;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportExample1 {

	//ExtentRepport is open-source HTML Reporting library useful for test automation.
	//fo achieving this we need add to one dependancy extentreports.
	
	ExtentSparkReporter htmlReports;
	ExtentReports reports;
	ExtentTest test;

	@BeforeTest
	//report configurations
	public void startReport() {
		htmlReports=new ExtentSparkReporter("extentReportersDemo12.html");
		reports=new ExtentReports();
		reports.attachReporter(htmlReports);

		//add environment details
		reports.setSystemInfo("machine", "DELL");
		reports.setSystemInfo("OS", "Window-11");
		reports.setSystemInfo("USER", "Vithal");
		reports.setSystemInfo("Browser", "Chrome");

		//configuration to change look and feel...
		htmlReports.config().setDocumentTitle("Extent Report Demo");
		htmlReports.config().setReportName("Test Report");
		htmlReports.config().setTheme(Theme.STANDARD);
		htmlReports.config().setTimeStampFormat("EEEE,MMMM,dd,yyyy,hh:mm a '('zzzz')'");

	}
	//create some test cases
	@Test
	public void launchBrowser() {
		test=reports.createTest("launch the browser successfully...");

	}
	@Test
	public void verifyTitle() {
		test=reports.createTest("Verified title ...");
		Assert.assertTrue(true);
	}
	@Test
	public void verifyURL() {
		test=	reports.createTest("Verified URL ...");
		Assert.assertTrue(false);
	}
	@Test
	public void verifyLogo() {
		test=reports.createTest("verifyied log ...");
		Assert.assertTrue(true);

	}
	@Test
	public void verifyEmail() {
		test=reports.createTest("verifyied emial ...");
		throw new SkipException("Skipped test case....with an exception..");

	}
	@Test
	public void verifyUsername() {
		test=reports.createTest("verifyied username ...");
		Assert.assertTrue(false);

	}

	//create one method will execute after each test case
	@AfterMethod
	public void getResults(ITestResult result) {

		if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS,MarkupHelper.createLabel(result.getName()+ "SUCCESS", ExtentColor.GREEN));

			
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+ "FAIL", ExtentColor.RED));
			
			//more details of faillure test cases
			test.fail(result.getThrowable());

		}
		else if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP,MarkupHelper.createLabel(result.getName()+ "SKIPP", ExtentColor.ORANGE));

			//more information about the test case
			test.skip(result.getThrowable());
		}
		
	
	}
	//madatory method to write all logs here
	@AfterTest
	public void tearDown() {
		reports.flush();
	}

}
