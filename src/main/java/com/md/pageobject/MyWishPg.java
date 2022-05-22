package com.md.pageobject;

import org.openqa.selenium.WebDriver;

import com.md.reusablecomp.HelperC;
import com.md.uistore.MyWishUi;


public class MyWishPg {
	
	WebDriver driver;
	HelperC helper;
	MyWishUi ui;
	
	public MyWishPg(WebDriver driver) {
		this.driver=driver;
		helper=new HelperC();
		ui=new MyWishUi();
	}
	
	public String getMyWish() {
		String data=helper.getText(ui.myWish,driver);
		return data;
	}

}
