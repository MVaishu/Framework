package com.md.pageobject;

import org.openqa.selenium.WebDriver;

import com.md.reusablecomp.HelperC;
import com.md.uistore.BB;


public class BBPg {

	WebDriver driver;
	HelperC helper;
	BB ui;
	
	public BBPg(WebDriver driver) {
		this.driver=driver;
		helper=new HelperC();
		ui=new BB();
	}
	
	public String getbeanBagTitle() {
		String data=helper.getText(ui.beanBagTitle,driver);
		return data;
	}
}
