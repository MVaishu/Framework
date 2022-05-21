package com.md.pageobject;

import org.openqa.selenium.WebDriver;

import com.md.reusablecomp.HelperC;
import com.md.uistore.MenuPgUi;

public class MenuPg {
	
	WebDriver driver;
	HelperC helper;
	MenuPgUi mpui;
	
	public MenuPg(WebDriver driver) {
		this.driver=driver;
		helper=new HelperC();
		mpui=new MenuPgUi();
	}
	
	public void clickOnStudyChair() {
		helper.clickOn(mpui.stdChair,driver);
		System.out.println("Successfully clicked on study chair");
	}
	
	public void clickOnSofas() throws InterruptedException {
		helper.clickOn(mpui.sofas,driver);
		System.out.println("Successfully clicked on sofas");
	}
	
	public String getSofasTitle() {
		String data=helper.getText(mpui.SofasT,driver);
		return data;
	}
	
	public void clkOnBean() {
		helper.clickOn(mpui.beanBag,driver);
		System.out.println("Successfully clicked on bean bag");
	}
	
	public void clickOnTvUnit() {
		helper.clickOn(mpui.tvUnit,driver);
		System.out.println("Successfully clicked on TV Unit");
	}
	
	
	public void clickOnCabinet() {
		helper.clickOn(mpui.cabinets,driver);
		System.out.println("Successfully clicked on cabinets");
	}
	
	public void clickOnstudyTable() {
		helper.clickOn(mpui.studyT,driver);
		System.out.println("Successfully clicked on study table");
	}
	
	public String getStudyTableTitle() {
		String data=helper.getText(mpui.studyTblT,driver);
		return data;
	}
	public void clickOnDeal() throws InterruptedException {
		helper.clickOn(mpui.topDls,driver);
		System.out.println("Successfully clicked on deals");
	}
	public void clkOnLiving() {
		helper.clickOn(mpui.livingUi,driver);
		System.out.println("Successfully clicked on living");
	}

	public void clickOnWish() {
		helper.clickOn(mpui.wishUi,driver);
		System.out.println("Successfully clicked on Wish list");
	}
	
	public void clickOnDinning() {
		helper.clickOn(mpui.dinningUi,driver);
		System.out.println("Successfully clicked on dining");
	}
	
	
	
	public void clickOnGift() {
		helper.clickOn(mpui.gift,driver);
		System.out.println("Successfully clicked on gift");
	}
	
	public void clickOnStudy() {
		helper.clickOn(mpui.study,driver);
		System.out.println("Successfully clicked on study");
	}
	
	public void clickOnDecor() {
		helper.clickOn(mpui.decorUi,driver);
		System.out.println("Successfully clicked on decor");
	}
	
	public void clickOnWall() {
		helper.clickOn(mpui.wallMirrorUi,driver);
		System.out.println("Successfully clicked on wall Mirror");
	}
	
	public void clickOntrackOrder() {
		helper.clickOn(mpui.trackOrder,driver);
		System.out.println("Successfully clicked on track order");
	}
}
