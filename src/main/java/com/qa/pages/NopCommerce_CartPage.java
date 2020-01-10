package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class NopCommerce_CartPage extends BaseTest {

	public Actions action;
	//Shopping Cart
	@FindBy(xpath="//li[@id='topcartlink']")
	WebElement shoppingcart;

	@FindBy(xpath="//input[@class='button-1 cart-button']")
	WebElement gotocart;

	@FindBy(xpath="//div[@class='table-wrapper']//tr[3]//td[6]//input[@class='qty-input']")
	WebElement updateCartValue;

	@FindBy(xpath="//input[@name='updatecart']")
	WebElement updatecartButton;

	@FindBy(xpath="//a[@class='product-name']")
	WebElement productname;

	@FindBy(xpath="//tr[@class='order-total']//span[@class='value-summary']//strong")
	WebElement subTotal;

	@FindBy(xpath="//tr[@class='order-subtotal']//span[@class='value-summary']")
	WebElement totalvalue;

	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkoutbutton;

	@FindBy(xpath="//div[@id='terms-of-service-warning-box']//p")
	WebElement popmessage;

	@FindBy(xpath="//button[@title='Close']")
	WebElement popupclose;

	@FindBy(xpath="//input[@id='termsofservice']")
	WebElement termofservicecheckbox;

	@FindBy(xpath="//h1[contains(text(),'Welcome, Please Sign In!')]")
	WebElement signInMessage;

	@FindBy(xpath="//input[@class='button-1 checkout-as-guest-button']")
	WebElement ceckoutasguestbutton;

	public NopCommerce_CartPage()
	{
		PageFactory.initElements(driver, this);
	}

	// Entering to Cell Phone page
	public void clickOnShoppingCart() throws InterruptedException{
		Thread.sleep(4000);
		Webgenericutility.mouseOver(shoppingcart);
		gotocart.click();
	}

	// Update Jewelry Quantity
	public void updateJewelryCart(){
		System.out.println(updateCartValue.getText());
		updateCartValue.clear();
		Webgenericutility.sendKeyValue(driver, updateCartValue, 2, "3");
		updatecartButton.click();
	}

	//Verifying Total
	public void verifyShoppingCart(){
		String subtotal = subTotal.getText();
		String total = totalvalue.getText();
		System.out.println(subtotal);
		Assert.assertEquals(subtotal, total);
	}

	// Verifying Pop Up
	public void verifyTermsAndServicePopup(){
		checkoutbutton.click();
		String actualmessage = popmessage.getText();
		String expectedMessage = "Please accept the terms of service before the next step.";
		Assert.assertEquals(actualmessage, expectedMessage);
		popupclose.click();
	}

	// Clicking on Check Box of Terms and Service and entering Sign In page
	public void clickCheckOutButton(){
		termofservicecheckbox.click();
		checkoutbutton.click();
	}

	// Verify Sign In page
	public void verifySignInPage(){
		String actualMessage = signInMessage.getText();
		String expectedMessage = "Welcome, Please Sign In!";
		Assert.assertEquals(actualMessage, expectedMessage);
	}

	// Click on Check Out As Guest button
	public void checkOutAsGuestButton(){
		ceckoutasguestbutton.click();
	}

}