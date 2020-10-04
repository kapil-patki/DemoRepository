package com.SeleniumTests;

import com.relevantcodes.extentreports.ExtentReports;

public class extentFactory  {
	public static ExtentReports getInstance()
	{
		ExtentReports exreports;
		String path = "D:/desktop/kapil/j/workspace/SelePro/ExtentReport/reports2.html";
		exreports = new ExtentReports(path, false);		
		return exreports;
	}	
}
