package com.md.utilities;

import java.io.FileInputStream;

import java.util.Properties;

public class ReadPropertyFile {
	
	static Properties config;
	
	public ReadPropertyFile() {
		config=new Properties();
		FileInputStream fis;
	    try {
			fis=new FileInputStream("./TestData/config.properties");
			config.load(fis);
		} 
	    catch (Exception e) {
			System.out.println("File not Found"+e.getMessage());
		}
	}
	
	public String getDriver() {
		String cDPath=config.getProperty("ChromeDr");
		if(cDPath!=null) {
			return cDPath;
		}
		else {
			throw new RuntimeException("Chrome driver not specified");
		}
	}
	
	public String getUrl() {
		String gurl=config.getProperty("URL");
		if(gurl !=null) {
			return gurl;
		}
		else {
			throw new RuntimeException("URL not specified");
		}
	}
	
	public String getExtentReportPath() {
		String extentReportPath=config.getProperty("ERPath");
		if(extentReportPath !=null) {
			return extentReportPath;
		}
		else {
			throw new RuntimeException("extentReportPath not specified");
		}
	}

	public String getBrowser() {
		String browser=config.getProperty("BrowserName");
		if(browser !=null) {
			System.out.println(browser);
			return browser;
		}
		else {
			throw new RuntimeException("browser not specified");
		}
	}

}
