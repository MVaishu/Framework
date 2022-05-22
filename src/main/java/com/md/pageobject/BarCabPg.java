package com.md.pageobject;

import org.openqa.selenium.WebDriver;

import com.md.reusablecomp.HelperC;
import com.md.uistore.BarCabUi;

public class BarCabPg {
	
	WebDriver driver;
	HelperC wdhelper;
	BarCabUi bUi;
	
	public BarCabPg(WebDriver driver) {
		this.driver=driver;
		wdhelper=new HelperC();
		bUi=new BarCabUi() ;
	}
	
	public String getBarCabinetTitle() {
		String data=wdhelper.getText(bUi.barCabinetTitle,driver);
		return data;
	}

}
