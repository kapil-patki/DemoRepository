package com.SeleniumTests;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTestBase {
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;

	@BeforeSuite
	public void setup()
	{		
		htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtentReportMultiple.html");
		extentReports = new ExtentReports();
		extentReports.attachReporter(htmlreporter);	
	}
	
	@AfterMethod
	public void getResult(ITestResult result)
	{
		System.out.println("Inside aftertest method");
		if(result.getStatus() == ITestResult.FAILURE)
		{
			extentTest.fail(MarkupHelper.createLabel(result.getName()+" Test Case Failed", ExtentColor.RED));
			extentTest.fail(result.getThrowable());
		}
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			extentTest.pass(MarkupHelper.createLabel(result.getName()+" Test Case Passed", ExtentColor.GREEN));
		}
		else
		{
			extentTest.skip(MarkupHelper.createLabel(result.getName()+" Test Case Skipped", ExtentColor.YELLOW));
			extentTest.skip(result.getThrowable());
		}		
	}
	
	@AfterSuite
	public void tearDown()
	{
		extentReports.flush();
	}	
}