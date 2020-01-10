package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.basetest.BaseTest;
import com.qa.pages.CellphonePage;
import com.qa.pages.CheckOutPage;
import com.qa.pages.JewelryPage;
import com.qa.pages.NopcommercePage;
import com.qa.pages.ShoppingCartPage;


public class NopcommerceScript extends BaseTest {			
			
	@Test(priority=1)
	public void ElectronicsPurcase() throws InterruptedException{
		//Object for Landing Page
		NopcommercePage NP = new NopcommercePage(driver);
		NP.mouseHoverClick();
		NP.CellphoneElement().click();
	}
	
	@Test(priority=2)
	public void AddPhoneToCart() throws InterruptedException{
		//Object of Cellphone page
		CellphonePage CellPhone =new CellphonePage(driver);
		
		//Code for Sorting Cellphones by Lowest price
		CellPhone.SortPhoneByPrice();
		
		//Code for Adding Cellphones to Cart
		CellPhone.AddToCartFirstElement().click();
		Thread.sleep(7000);
		CellPhone.AddToCartSecondElement().click();
		
		//Code for Clicking Jewelry Tab
		CellPhone.JewelryElement().click();
	}
	
	@Test(priority=3)
	public void AddJewelryToCart() throws InterruptedException{
		//Object of Jewelry page
		JewelryPage Jewelry = new JewelryPage(driver);
		
		//Code for Sorting Jewelry by Highest price 
		Jewelry.SortJewelryByHighPrice();
		
		//Adding Highest priced Jewelry to Cart
		Jewelry.AddToCartJwlryElement().click();
		
		//Verifying Addition of items to Cart
		String ConfirmMsg = Jewelry.ConfirmationMsg().getText();
		System.out.println(ConfirmMsg);
		Assert.assertEquals("The product has been added to your shopping cart", ConfirmMsg);
	}
	
	@Test(priority=4)
	public void VerifyShoppingCart() throws InterruptedException{
		//Object for ShoppingCartPage.java
		ShoppingCartPage ShopCart = new ShoppingCartPage(driver);
		//Object of Jewelry page
		JewelryPage Jewelry = new JewelryPage(driver);
				
		//Verifying Shopping Cart Hyper link
		Thread.sleep(4000);
		Jewelry.ShoppingCart();
		
		//Verifying Opening of Go To Cart landing page
		Jewelry.GoToCart();
		
		//Verifying Shopping cart Heading text
		String ShoppingCartText= ShopCart.ShoppingCartLabelElement().getText();
		System.out.println(ShoppingCartText);
		Assert.assertEquals("Shopping cart", ShoppingCartText);
		
		//Verifying Sub Total of Shopping cart
		String SubTotalText = ShopCart.ShoppingCartSubTotalLabelElement().getText();
		System.out.println(SubTotalText);
		Assert.assertEquals("Sub-Total:", SubTotalText);
	}
	
	@Test(priority=5)	
	public void UpdateShoppingCart() throws InterruptedException{
		//Object for ShoppingCartPage.java
		ShoppingCartPage ShopCart = new ShoppingCartPage(driver);
		
		//Updating Jewelry Quantity in Shopping cart
		ShopCart.JewelryQuantityElement().clear();
		ShopCart.JewelryQuantityElement().sendKeys("3");
		ShopCart.UpdateShoppingCartElement().click();
		ShopCart.EULAElement().click();
		ShopCart.CheckoutElement().click();
	}
	
	@Test(priority=6)
	public void VerifyCheckoutLandingPageHeading() throws InterruptedException{
		//Object for ShoppingCartPage.java
		CheckOutPage Checkout = new CheckOutPage(driver);
		
		//Verifying Checkout page heading text
		String CheckOutPageHeadingText=Checkout	.CheckoutPageHeadingElement().getText();
		System.out.println(CheckOutPageHeadingText);
		Assert.assertEquals("Welcome, Please Sign In!", CheckOutPageHeadingText);
		
		//Clicking Checkout As Guest
		
		Checkout.CheckoutAsGuestBtnElement().click();
	}
	
	@Test(priority=7)
	public void CheckOutGuest() throws InterruptedException{
		//Object for ShoppingCartPage.java
		CheckOutPage Checkout = new CheckOutPage(driver);
		Checkout.FirstNameInputBoxElement().clear();
		Checkout.FirstNameInputBoxElement().sendKeys("TestFName");
		
		Checkout.LastNameInputBoxElement().clear();
		Checkout.LastNameInputBoxElement().sendKeys("TestLName");
		
		Checkout.EmailBoxElement().clear();
		Checkout.EmailBoxElement().sendKeys("TestEmail@gmail.com");
		
		Checkout.CompanyInputBoxElement().clear();
		Checkout.CompanyInputBoxElement().sendKeys("TestCompany");
		
		Checkout.SelectCountry();
		
		Checkout.CityBoxElement().clear();
		Checkout.CityBoxElement().sendKeys("TestCity");
		
		Checkout.Address1InputBoxElement().clear();
		Checkout.Address1InputBoxElement().sendKeys("TestAddress1");
		
		Checkout.Address2InputBoxElement().clear();
		Checkout.Address2InputBoxElement().sendKeys("TestAddress2");
		
		Checkout.ZipInputBoxElement().clear();
		Checkout.ZipInputBoxElement().sendKeys("123456");
		
		Checkout.PhoneInputBoxElement().sendKeys("999999999");
		
		Checkout.FaxInputBoxElement().sendKeys("080-123456");
		
		Checkout.ContinueBtnElement().click();
		
	}
}
