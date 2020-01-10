package com.qa.test;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.basetest.BaseTest;
import com.qa.pages.NopCommerceElectronics_Page;
import com.qa.pages.NopCommerce_CellPhone_Page;
import com.qa.pages.NopCommerce_Jewelry_Page;
import com.qa.pages.NopCommerce_CartPage;
import com.qa.pages.NopCommerce_CheckOut_Page;

public class NopCommerceElectronicsTest  extends  BaseTest{

	public NopCommerceElectronics_Page cellPhonePageVerify;
	public NopCommerce_CellPhone_Page CellPhone_AddToCarts;
	public NopCommerce_Jewelry_Page Jewelry_AddToCarts;
	public NopCommerce_CheckOut_Page CheckOutPage;
	NopCommerce_CartPage CartPage;

	// Validating Cell Phone Page
	@Test(priority = 0)
	public void ValidateCellphonePage() throws IOException, InterruptedException
	{
		cellPhonePageVerify = new NopCommerceElectronics_Page();
		cellPhonePageVerify.clickCellPhoneLink();
	}

	//Adding Cell Phone to the Cart
	@Test(priority = 1)
	public void AddingCellPhoneToCart() throws InterruptedException{
		CellPhone_AddToCarts = new NopCommerce_CellPhone_Page();
		CellPhone_AddToCarts.CellPhone_AddToCarts();
		Thread.sleep(2000);
	}

	//Adding Jewelry To Cart  and verifying notification
	@Test(priority = 2)
	public void AddingJewelryToCart() throws InterruptedException{
		Jewelry_AddToCarts = new NopCommerce_Jewelry_Page();
		Jewelry_AddToCarts.Jewelry_AddToCarts();
		Thread.sleep(2000);
	}

	//Enetring to Shopping Cart page
	@Test(priority = 3)
	public void nopCommerce_ClickOnShoppingCart() throws InterruptedException{
		CartPage = new NopCommerce_CartPage();
		CartPage.clickOnShoppingCart();
		Thread.sleep(2000);
		CartPage.verifyShoppingCart();
		CartPage.updateJewelryCart();
		CartPage.verifyTermsAndServicePopup();
	}

	//Verifying Shopping Cart page
	@Test(priority = 4)
	public void nopCommerce_VerifyShoppinfCart() throws InterruptedException{
		CartPage = new NopCommerce_CartPage();
		Thread.sleep(2000);
		CartPage.verifyShoppingCart();
	}

	// Updating Jewelry quantity
	@Test(priority = 5)
	public void nopCommerce_UpdateJewelryQuantity() throws InterruptedException{
		CartPage = new NopCommerce_CartPage();
		CartPage.updateJewelryCart();
	}

	// verifying TermsAndServicePopup
	@Test(priority = 6)
	public void nopCommerce_verifyTermsAndServicePopup() throws InterruptedException{
		CartPage = new NopCommerce_CartPage();
		CartPage.verifyTermsAndServicePopup();
	}

	// Clicking on Check Box of Term and Service
	// Entering Sign In Button
	// Click on Check Out As Guest Button
	@Test(priority = 7)
	public void check_TermsAndService() throws InterruptedException{
		CartPage = new NopCommerce_CartPage();
		CheckOutPage = new NopCommerce_CheckOut_Page();
		Thread.sleep(2000);
		CartPage.clickCheckOutButton();
		CheckOutPage.verifySignInPage();
		CheckOutPage.checkOutAsGuestButton();
	}
}