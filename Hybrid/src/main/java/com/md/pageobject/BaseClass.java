package com.md.pageobject;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.md.reusablecomp.BrowseFC;
import com.md.utilities.ExcelClass;
import com.md.utilities.ReadPropertyFile;
import com.md.utilities.ScreenShot;

public class BaseClass {
	
	public WebDriver driver;
	
	public ExcelClass excel;
	public ReadPropertyFile read;
	public ExtentTest logger;
	public ExtentReports report;
	public ExtentHtmlReporter extent;
	
	 
	@BeforeSuite
	public void setUpSuit() {
		 Reporter.log("Setting up report ---- test is getting ready",true);
		 excel=new ExcelClass();
		 extent=new ExtentHtmlReporter(new File("./Reports/"+ScreenShot.getcurrentDateTime()+".html"));
		 report=new ExtentReports();
		 Reporter.log("Setting done ---- Test can be started",true);
	}
	
	@BeforeClass
	public void setUp() throws InterruptedException, IOException {
		
		
		
		 report.attachReporter(extent);
		excel=new ExcelClass();
		
		read=new ReadPropertyFile();
		
		driver=BrowseFC.startApplication(driver,read.getBrowser(),read.getUrl(),read.getDriver());
		System.out.println(driver.getTitle());
		HomePg home=new HomePg(driver);
		home.clickOnAdmin();
		home.clickOnLogin();
		LoginPg login=new LoginPg(driver);
		login.sEmail(excel.getStringData("Sheet1", 0, 0));
		login.sPass(excel.getStringData("Sheet1", 1, 0));
		login.clkOnSubmit();
	}
	
	@AfterClass
	public void tearDown() {
		BrowseFC.quitBroswer(driver);
	}
	
	@AfterMethod
	public void tearDownM(ITestResult result) throws IOException {
		
		Reporter.log("Test is about to end",true);
		if(result.getStatus()==ITestResult.FAILURE)
		{
			ScreenShot.takeScreenShot(driver);
			logger.fail("Test Failed",MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.takeScreenShot(driver)).build());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			ScreenShot.takeScreenShot(driver);
			logger.pass("Test Pass",MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot.takeScreenShot(driver)).build());
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			
			logger.skip("Test Skipped");
		}
		report.flush();
		Reporter.log("Test completed  -------  Report generated",true);
	}
	
}


