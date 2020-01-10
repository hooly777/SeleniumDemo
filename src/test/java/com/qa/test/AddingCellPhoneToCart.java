package com.qa.test;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.qa.Utility.ExcellUtility;
import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;
import com.qa.basetest.BaseTest; 
import com.qa.pages.CellPhonesPageNOP;
import com.qa.pages.CheckoutPage;
import com.qa.pages.ElectronicsPageNOP;
import com.qa.pages.HomePageNOP;
import com.qa.pages.JewelleryPageNOP;
import com.qa.pages.Shoppingcart;
import com.relevantcodes.extentreports.LogStatus;

public class AddingCellPhoneToCart extends BaseTest {
	private final static Logger log = Logger.getLogger(AddingCellPhoneToCart.class);
	@Test(priority=1)
	public void AddingCellPhoneToCart() throws InterruptedException {
		Thread.sleep(3000);
		log.info("start of test case");
		HomePageNOP homePage = new HomePageNOP(driver);
		ElectronicsPageNOP electronicsPage = new ElectronicsPageNOP(driver);
		CellPhonesPageNOP cellPhonesPage = new CellPhonesPageNOP(driver);
		homePage.electronicsClick();
		waitForLoad(driver);
		electronicsPage.cellPhonesClick();
		waitForLoad(driver);
		cellPhonesPage.selectLPCellphone();
		cellPhonesPage.ProductPrice();
		cellPhonesPage.sortPrice();
		cellPhonesPage.AddToCart();
		log.info("end  of test case");
	}
	@Test(priority=2)
	public void ValidatingShoppingCart() throws InterruptedException {
		log.info("start of test case");
		HomePageNOP homePage = new HomePageNOP(driver);
		JewelleryPageNOP jewelryPage = new JewelleryPageNOP(driver);
		Shoppingcart  Shoppcart = new Shoppingcart(driver);
		waitForLoad(driver);
		Shoppcart.NavigateToShoppingCart();
		waitForLoad(driver);
	    Shoppcart.UpdateingShoppingCart("2");
//	    Shoppcart.Validatingprice();
	    Shoppcart.checkout();
	    Shoppcart.CheckoutAsGuests();
	    
	}
	@Test(priority=3)
	private void OrderCheckoutcart() throws InterruptedException {
		log.info("start of test case");
		HomePageNOP homePage = new HomePageNOP(driver);
		JewelleryPageNOP jewelryPage = new JewelleryPageNOP(driver);
		Shoppingcart  Shoppcart = new Shoppingcart(driver);
		CheckoutPage   CPcart     = new CheckoutPage(driver);
		waitForLoad(driver);
		CPcart.OrderCheckout("Selenium","Selenium@gmail.om");

	}



}
