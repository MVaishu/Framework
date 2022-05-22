package com.md.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	public static String takeScreenShot(WebDriver driver) {
		TakesScreenshot takeS=(TakesScreenshot) driver;
		File srcFile=takeS.getScreenshotAs(OutputType.FILE);
		
		String ss=System.getProperty("user.dir")+"/Screenshots/ulss"+getcurrentDateTime()+".png";
		File destFile=new File(ss);
		try {
			FileHandler.copy(srcFile, destFile);
		} catch (IOException e) {
			
		   
		   System.out.println("Unable to capture Screenshot");
		}
		return ss;
	}

	public static String getcurrentDateTime() {
		SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		Date d=new Date();
		String dt=sf.format(d);
		return dt;
	}

}
