package com.SeleniumTests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class Reports1 extends ExtentReportTestBase {

	ChromeDriver driver;
		
	@Test
	public void Test1()
	{	
		extentTest = extentReports.createTest("Test1");
		System.setProperty("webdriver.chrome.driver", "D:/desktop/kapil/chromedriver2.35/chromedriver.exe");
		driver=new ChromeDriver();		
		driver.get("https://www.techonthenet.com/html/elements/marquee_tag.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();                										
		driver.findElement(By.xpath("//*[@id=\"collapsible_filter\"]")).sendKeys("tody");		
		System.out.println("Text: "+driver.findElement(By.xpath("//*[@id=\"collapsible\"]/div[1]/h3")).getText());		
		Assert.assertEquals("HTML ELEMENTS", driver.findElement(By.xpath("//*[@id=\"collapsible\"]/div[1]/h3")).getText());
		System.out.println("report1 Done");
	}
}
