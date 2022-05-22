package com.md.pageobject;

import org.openqa.selenium.WebDriver;

import com.md.reusablecomp.HelperC;
import com.md.uistore.HomePgUi;

public class HomePg {
	
	WebDriver driver;
	HelperC helper;
	HomePgUi ui;
	
	public HomePg(WebDriver driver) {
		this.driver=driver;
		helper=new HelperC();
		ui=new HomePgUi();
	}
	
	public void clickOnAdmin() {
		helper.clickOn(ui.adminUi,driver);
		System.out.println("Successfully click");
	}
	
	public void clickOnLogin() {
		helper.clickOn(ui.LogIn,driver);
		System.out.println("Successfully click on login");
	}

}
