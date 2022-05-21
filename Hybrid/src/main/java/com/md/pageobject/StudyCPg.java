package com.md.pageobject;

import org.openqa.selenium.WebDriver;

import com.md.reusablecomp.HelperC;
import com.md.uistore.StudyCUi;

public class StudyCPg {

	WebDriver driver;
	HelperC helper;
	StudyCUi ui;
	
	public StudyCPg(WebDriver driver) {
		this.driver=driver;
		helper=new HelperC();
		ui=new StudyCUi();
	}
	
	public void AddWish() {
		helper.clickOn(ui.studyChairAddUi,driver);
		System.out.println("Successfully added in wishlist");
	}
}
