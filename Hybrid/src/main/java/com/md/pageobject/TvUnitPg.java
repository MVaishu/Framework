package com.md.pageobject;

import org.openqa.selenium.WebDriver;

import com.md.reusablecomp.HelperC;
import com.md.uistore.TvUnitUi;

public class TvUnitPg {
	
	WebDriver driver;
	HelperC helper;
	TvUnitUi ui;
	
	public TvUnitPg(WebDriver driver) {
		this.driver=driver;
		helper=new HelperC();
		ui=new TvUnitUi();
	}
	
	public String getTvUnitTitle() {
		String data=helper.getText(ui.TvUnitTitle,driver);
		return data;
	}

}
