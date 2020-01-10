package com.qa.test.NopCommerce;

import org.testng.annotations.Test;

import com.qa.basetest.BaseTest;
import com.qa.pages.NopCommerce.CartNOPpage;
import com.qa.pages.NopCommerce.CellPhonesPageNOP;
import com.qa.pages.NopCommerce.CheckOutPage;
import com.qa.pages.NopCommerce.HomePageNOP;
import com.qa.pages.NopCommerce.JewelleryPageNOP;

public class NopCommerceTest extends BaseTest {
	public HomePageNOP homepg;
	public CellPhonesPageNOP cellPage;
	public JewelleryPageNOP JewelryPage;
	public CartNOPpage cartPage;
	public CheckOutPage checkoutPage;

	@Test(priority = 1)
	public void TC001() {
		homepg = new HomePageNOP(driver);
		homepg.mouseHoverElectronics();
		homepg.clickCellPhonesSubMenu();
	}

	@Test(priority = 2)
	public void TC002() throws Exception {
		cellPage = new CellPhonesPageNOP(driver);
		cellPage.sortPhonePriceLowToHigh();
		cellPage.AddTwoLPMobilesToCart();
		//cellPage.closepopUp();
		Thread.sleep(6000);
		cellPage.clickJewelryLink();
	}

	@Test(priority = 3)
	public void TC003() throws Exception {
		JewelryPage= new JewelleryPageNOP(driver);		
		JewelryPage.sortJewelryPriceHighToLow();
		JewelryPage.AddHPJewelryToCart();
		
	}
	@Test(priority=4)
	public void TC004(){
		JewelryPage= new JewelleryPageNOP(driver);
		JewelryPage.verifyNotification();
	}
	
	@Test(priority=5)
	public void TC005() throws Exception{
		JewelryPage= new JewelleryPageNOP(driver);
		Thread.sleep(6000);
		JewelryPage.mouseHoverShoppingCart();
		JewelryPage.clickGoToCart();
	}
	@Test(priority=6)
	public void TC006(){
		cartPage= new CartNOPpage(driver);
		cartPage.verifyShoppingCartItems();
		cartPage.verifyShoppingCartItemsPrice();
		cartPage.verifySubTotal();
	}
	@Test(priority=7)
	public void TC007(){
		cartPage= new CartNOPpage(driver);
		cartPage.modifyJewelryUpdateShoppingCart();
		cartPage.UpdateShoppingCart();
	}
	@Test(priority=8)
	public void TC008(){
		cartPage= new CartNOPpage(driver);
		cartPage.clickCheckout();
		cartPage.verifyTermsOfService();
		cartPage.closePopUp();
	}
	@Test(priority=9)
	public void TC009(){
		cartPage= new CartNOPpage(driver);
		cartPage.clickAgreeTermsAndConditions();
		cartPage.clickCheckout();
		cartPage.verifySignIn();
		cartPage.clickCheckOutAsGuest();
	}
	@Test(priority=10)
	public void TC010() throws Exception{
		checkoutPage= new CheckOutPage(driver);
		checkoutPage.fillCheckOutForm();
		checkoutPage.verifyOrderSuccessfulPage();
	}
}
