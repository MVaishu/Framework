package com.md.pageobject;

import org.openqa.selenium.WebDriver;

import com.md.reusablecomp.HelperC;
import com.md.uistore.GiftUi;


public class GiftPg {

	WebDriver driver;
	HelperC wdhelper;
	GiftUi gpui;
	
	public GiftPg(WebDriver driver) {
		this.driver=driver;
		wdhelper=new HelperC();
		gpui=new GiftUi();
	}
	
	public String get() {
		String data=wdhelper.getText(gpui.gift,driver);
		return data;
	}
}
