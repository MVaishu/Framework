package com.md.runner;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.md.pageobject.BBPg;
import com.md.pageobject.BarCabPg;
import com.md.pageobject.BaseClass;
import com.md.pageobject.GiftPg;
import com.md.pageobject.MenuPg;
import com.md.pageobject.StudyCPg;
import com.md.pageobject.TvUnitPg;

public class TestC extends BaseClass{
	@Test(priority=1)
	public void test1() throws InterruptedException {
		logger=report.createTest("Study chair");
		logger.info("Test case to check whether Study chair add in wishlist");
		MenuPg menu=new MenuPg(driver);
		menu.clickOnStudy();
		menu.clickOnStudyChair();
		StudyCPg chair=new StudyCPg(driver);
		chair.AddWish();
		logger.pass("Study Chair Added into wishlist successfully");
	}
	
	@Test(priority=2)
	public void test2() throws InterruptedException {
		
		logger=report.createTest("Sofas");
		logger.info("Test Case to check whether Sofas title find or not");
		MenuPg menu=new MenuPg(driver);
		menu.clickOnDeal();
		menu.clickOnSofas();
		Assert.assertEquals(menu.getSofasTitle(),"Sofas");
		logger.pass("Sofas assert successfully");
	}
	
	@Test(priority=3)
	public void test3() throws InterruptedException {
		logger=report.createTest("Bean Bags");
		logger.info("Test Case to check whether user able to click on Bean Bags or not");
		MenuPg menu=new MenuPg(driver);
		menu.clkOnLiving();
		menu.clkOnBean();
		BBPg bag=new BBPg(driver);
		Assert.assertTrue(bag.getbeanBagTitle().equals("Bean Bags"),"not Found");
		logger.pass("Successfully Clicked on Bean bags");
	}
	
	@Test(priority=4)
	public void test4() throws InterruptedException {
		logger=report.createTest("Tv Unit");
		logger.info("Test Case to check whether click on TV Unit");
		MenuPg menu=new MenuPg(driver);
		menu.clkOnLiving();
		menu.clickOnTvUnit();
		TvUnitPg tv=new TvUnitPg(driver);
		Assert.assertTrue(tv.getTvUnitTitle().equals("TV Units"),"Not Found");
		logger.pass("Click on Tv Unit successfully");
		
	}
	
	@Test(priority=5)
	public void test5() throws InterruptedException {
		logger=report.createTest("Bar Cabinets");
		logger.info("Starting Test to check whether click on Bar Cabinets");
		MenuPg menu=new MenuPg(driver);
		menu.clickOnDinning();
		menu.clickOnCabinet();
		BarCabPg cabinet=new BarCabPg(driver);
		Assert.assertTrue(cabinet.getBarCabinetTitle().equals("Bar Cabinets"),"Not Found");
		logger.pass("Click on Bar Cabinets successfully");
		
		
	}
	
	@Test(priority=6)
	public void test6() throws InterruptedException {
		logger=report.createTest("Gift");
		logger.info("Starting Test to check whether click on Gift");
		MenuPg menu=new MenuPg(driver);
		menu.clickOnGift();
		GiftPg gift=new GiftPg(driver);
		System.out.println(gift.get());
		driver.navigate().back();
		logger.pass("Click on Gift successfully");

	}
	
	@Test(priority=7)
	public void test7() throws InterruptedException {
		logger=report.createTest("study table");
		logger.info("Starting Test to check whether click on study tables");
		MenuPg menu=new MenuPg(driver);
		menu.clickOnDeal();
		menu.clickOnstudyTable();
		Assert.assertTrue(menu.getStudyTableTitle().equals("Study Tables"),"not Found");
		logger.pass("Click on Study table successfully");
	}
	
	@Test(priority=8)
	public void test8() throws InterruptedException {
		logger=report.createTest("Decor");
		logger.info("Starting Test to check whether click on wall");
		MenuPg menu=new MenuPg(driver);
		menu.clickOnDecor();
		menu.clickOnWall();
		logger.pass("Click on wall successfully");
	} 
	@Test(priority=9)
	public void test9() throws InterruptedException {
		
		logger=report.createTest("Track order");
		logger.info("Starting Test to check whether click on track order");
		MenuPg menu=new MenuPg(driver);
		menu.clickOntrackOrder();
		logger.pass("Click on track order successfully");
		
		
	}

}
