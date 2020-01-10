package com.qa.test;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.basetest.BaseTest;
import com.qa.pages.NopCommerce_CartPage;
import com.qa.pages.NopCommerce_CellPhone_LowestPrice;
import com.qa.pages.NopCommerce_Checkout;
import com.qa.pages.NopCommerce_HomePage;
import com.qa.pages.NopCommerce_Jewelry_Page;
import com.qa.pages.NopCommerce_WelcomeSignIn;



public class nopCommerce_Test  extends  BaseTest{

	public NopCommerce_HomePage cellPhonePageVerify;
	public NopCommerce_CellPhone_LowestPrice CellPhone_AddToCarts;
	public NopCommerce_Jewelry_Page jewelryPageVerify;
	public NopCommerce_CartPage jewelryItem;
	public NopCommerce_CartPage  item1Verify;
	public NopCommerce_WelcomeSignIn signin;
	public NopCommerce_Checkout neccessary_deatils;
	Logger log = Logger.getLogger("validating cellphone page");


	@Test(priority = 1)
	public void CellPhoneAddTocart() throws IOException, InterruptedException
	{
		//validate the title of cell phone page

		cellPhonePageVerify = new NopCommerce_HomePage();
		cellPhonePageVerify.clickCellphonelink();

		//validate  lowest cell phone is sucessfuly added to cart
		CellPhone_AddToCarts = new NopCommerce_CellPhone_LowestPrice();
		CellPhone_AddToCarts.CellPhone_AddToCarts();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	//validate highest jewelry add to cart

	public void JewelryAddToCart() throws InterruptedException{
		jewelryPageVerify = new NopCommerce_Jewelry_Page();
		jewelryPageVerify.Jewelry_AddToCarts();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	
	//validate jewelry item in cart
	
	public void JewelryItemUpdate() throws InterruptedException{
		jewelryItem = new NopCommerce_CartPage();
		jewelryItem.clickOnShoppingCart();
		jewelryItem.updateJewelryCart();
		jewelryItem.verifySubtotal();
		jewelryItem.verifyTermsAndServicePopup();
		jewelryItem.clickCheckOut();
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	// validate welcomeSignInpage
	
	public void WelcomeSignIn() throws InterruptedException {
		signin=new NopCommerce_WelcomeSignIn();
		signin.verifySignInPage();
		signin.checkOutAsGuestButton();
		
	}
	
	@Test(priority=5)
	// validate checkout page by filling necessary information: billing, shipping address etc
	
	public void CommerceNeccesaryDetails() throws InterruptedException {
		neccessary_deatils=new NopCommerce_Checkout();
		neccessary_deatils.BillingDetails();
		neccessary_deatils.verifyingOrderPage();

		
	}
	
	
	
	
   
	
  
	  
 }
	
	
	
	
	
