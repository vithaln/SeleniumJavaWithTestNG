package com.selenium.code.TestNGDemo.listnersWithExtentReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListner implements ITestListener {

	//ExtentRepport is open-source HTML Reporting library useful for test automation.
	//fo achieving this we need add to one dependancy extentreports.
	
	ExtentSparkReporter htmlReports;
	ExtentReports reports;
	ExtentTest test;

	@BeforeTest
	//report configurations
	public void startReport() {
		htmlReports=new ExtentSparkReporter("extentReportersListners.html");
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

	
	//first time will execute like class level
	//before test case start method call it call only once.
	public void onStart(ITestContext context) {
		startReport();
		System.out.println("on Start method called==first ");
	}
	
	
//on test finish after finishing all test cases
	public void onFinish(ITestContext context) {
		System.out.println("On finish method called====last");
	}
	
	//on start will execute..each test case start
//	when test case get start ,this method will called
	public void onTestStart(ITestResult result) {
		
		System.out.println("On Test Start method called...");
		}
	
	
	//when test case success, this method will execute after test case passed
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("On Test successfull method called..==>"+result.getName());
		test=reports.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Pass" + result.getName(), ExtentColor.GREEN));
	}
	//on test failure will execute after test fails
	//when test case get failed,this method will called
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure method called==> "+result.getName());
	
		test=reports.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("failled" + result.getName(), ExtentColor.RED));
	}
	//when test skipped will execute after test skipped.
	public void onTestSkipped(ITestResult result) {
		System.out.println("on Test Skipped method called==> "+result.getName());
		test=reports.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Skipped" + result.getName(), ExtentColor.ORANGE));
	}

	// madatory method to write all logs here
		@AfterTest
		public void tearDown() {
			reports.flush();
		}
	

}
