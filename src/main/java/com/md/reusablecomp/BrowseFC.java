package com.md.reusablecomp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseFC {
	
	
	public static WebDriver startApplication(WebDriver driver,String bwName,String appUrl,String bwPath ) {
		if(bwName.equals("Chrome")) {
			try {
				System.setProperty("webdriver.chrome.driver",bwPath);
				driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			} catch (Exception e) {
				//Log.error("webDriver can not be found");				
			}
		}
		else {
			System.out.println("We do not support Browser");
		}
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
	}
	
	public static void quitBroswer(WebDriver driver) {
		driver.quit();
	}

}
