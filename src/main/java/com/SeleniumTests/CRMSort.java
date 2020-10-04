package com.SeleniumTests;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CRMSort 
{
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:/desktop/kapil/chromedriver2.35/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Inside setup");
	}
	
	@Test
	public void test1()
	{				
	    List<WebElement> webList =  driver.findElements(By.xpath("//table[contains(@class,'sortable striped table')]//tbody//tr"));
	    ArrayList<String> arrList = new ArrayList<String>();
		for(int i=0; i < webList.size(); i++)
		{
			String str = driver.findElements(By.xpath("//table[contains(@class,'sortable striped table')]//tbody//tr[i+1]//td[5]")).get(0).getText();
			System.out.println("String: "+str);
			arrList.add(str);			
		}
		System.out.println("arrList: "+arrList);
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("sorted");
	}
}
