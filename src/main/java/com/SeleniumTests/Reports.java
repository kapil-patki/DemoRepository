package com.SeleniumTests;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reports extends ExtentReportTestBase {

	WebDriver driver;
	@Test
	public void Test() throws InterruptedException
	{
		extentTest = extentReports.createTest("Test");
		System.setProperty("webdriver.chrome.driver", "D:/desktop/kapil/chromedriver2.35/chromedriver.exe");
		driver=new ChromeDriver();		
		driver.get("https://www.techonthenet.com/html/elements/marquee_tag.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Inside setup");
        
		Thread.sleep(10000);
		System.out.println("Testreport object: "+extentReports.toString());								
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[1]/div[4]/pre[2]/iframe")));
				
		Assert.assertEquals("Scrolling text", driver.findElement(By.xpath("/html/body/marquee")).getText());		
		System.out.println("Reports Done");
	}
}
