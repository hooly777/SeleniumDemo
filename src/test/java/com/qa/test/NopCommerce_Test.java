package com.qa.test;

import org.testng.annotations.Test;

import com.qa.basetest.BaseTest;
import com.qa.pages.NopCommerce_Cellphones;
import com.qa.pages.NopCommerce_Checkout;
import com.qa.pages.NopCommerce_HomePage;
import com.qa.pages.NopCommerce_Jewelry;
import com.qa.pages.NopCommerce_ShoppingCart;
import com.qa.pages.NopCommerce_Signin;
import com.qa.pages.NopCommerce_Successfulorder;

public class NopCommerce_Test extends BaseTest {
	
	NopCommerce_Cellphones obj_NopCommerce_Cellphones;
	NopCommerce_Checkout obj_NopCommerce_Checkout;
	NopCommerce_HomePage obj_NopCommerce_HomePage;
	NopCommerce_Jewelry obj_NopCommerce_Jewelry;
	NopCommerce_ShoppingCart obj_NopCommerce_ShoppingCart;
	NopCommerce_Signin obj_NopCommerce_Signin;
	NopCommerce_Successfulorder obj_NopCommerce_Successfulorder;

	
	

	@Test
	public void TC_001() throws InterruptedException{
		
		obj_NopCommerce_HomePage=new NopCommerce_HomePage(driver);
		obj_NopCommerce_HomePage.hoverToElectronics();
		obj_NopCommerce_HomePage.clickOnCellPhonesLink();
		
		obj_NopCommerce_Cellphones = new NopCommerce_Cellphones(driver);
		
		obj_NopCommerce_Cellphones.sort_dropdown_L2H();
		
		obj_NopCommerce_Cellphones.addToCart1();
		
		obj_NopCommerce_Cellphones.addToCart2();
	
		obj_NopCommerce_Cellphones.jewellry_click();	
		
		
		
		obj_NopCommerce_Jewelry=new NopCommerce_Jewelry(driver);
		obj_NopCommerce_Jewelry.JewelryHighestPrice();
		obj_NopCommerce_Jewelry.JewelryAddToCart();
		obj_NopCommerce_Jewelry.JewelryMouseHoverShoppingCart();
		obj_NopCommerce_Jewelry.JewelryShoppingCart();
		
		
		obj_NopCommerce_ShoppingCart=new NopCommerce_ShoppingCart(driver);
		obj_NopCommerce_ShoppingCart.updateJewelleryCount("3");
		obj_NopCommerce_ShoppingCart.clickUpdateShoppingCart();
		obj_NopCommerce_ShoppingCart.clickCheckOutBtn();
		obj_NopCommerce_ShoppingCart.closePopUp();
		obj_NopCommerce_ShoppingCart.acceptTerms();
		obj_NopCommerce_ShoppingCart.clickCheckOutBtn();
		
		obj_NopCommerce_Signin=new NopCommerce_Signin(driver);
		obj_NopCommerce_Signin.checkoutAsGuest();
		
		obj_NopCommerce_Checkout=new NopCommerce_Checkout(driver);
		Thread.sleep(3000);
		
		obj_NopCommerce_Checkout.billingAddressclick();
	
	
		obj_NopCommerce_Checkout.enterFirstname("Ramya");
		obj_NopCommerce_Checkout.enterLastname("Mallikarjun");
		obj_NopCommerce_Checkout.enterEmailID("malli_143@gmail.com");
		obj_NopCommerce_Checkout.enterCountry("India");
		obj_NopCommerce_Checkout.enterCity("Bangalore");
		obj_NopCommerce_Checkout.enterAddress1("First Street");
		obj_NopCommerce_Checkout.enterZipCode("560100");
		obj_NopCommerce_Checkout.enterPhoneNumber("9783673256");
		Thread.sleep(3000);
		
		obj_NopCommerce_Checkout.billingAddresscontinueclick();
		obj_NopCommerce_Checkout.shippingContinueClick();
		Thread.sleep(3000);
		obj_NopCommerce_Checkout.paymentContinueClick();
		Thread.sleep(3000);
		obj_NopCommerce_Checkout.paymentinformationContinueClick();
		Thread.sleep(3000);
		obj_NopCommerce_Checkout.confirmButtonClick();
		
		obj_NopCommerce_Successfulorder=new NopCommerce_Successfulorder(driver);
		obj_NopCommerce_Successfulorder.successfullOrder("Your order has been successfully processed!");
		
	}

}
