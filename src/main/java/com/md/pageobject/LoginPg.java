package com.md.pageobject;

import org.openqa.selenium.WebDriver;

import com.md.reusablecomp.HelperC;
import com.md.uistore.LoginPgUi;

public class LoginPg {
	
	WebDriver driver;
	HelperC hC;
	LoginPgUi lPgui;
	
	public LoginPg(WebDriver driver) {
		this.driver=driver;
		hC=new HelperC();
		lPgui=new LoginPgUi();
	}
	
	public void sEmail(String data) throws InterruptedException {
		hC.sendKey(lPgui.emailUi,driver,data);
		System.out.println("Successfully entered Email");
	}
	
	public void sPass(String data) throws InterruptedException {
		hC.sendKey(lPgui.passUi,driver,data);
		System.out.println("Successfully enetered Password");
	}
	
	public void clkOnSubmit() throws InterruptedException {
		hC.clickOn(lPgui.submitUi,driver);
		System.out.println("Successfully Clicked on Submit Button ");
	}

}
