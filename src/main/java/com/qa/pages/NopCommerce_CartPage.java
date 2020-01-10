package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

import junit.framework.Assert;

public class NopCommerce_CartPage extends BaseTest {

	public Actions action;
	//Shopping Cart
	@FindBy(xpath="//li[@id='topcartlink']")
	WebElement shoppingcart;

	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkoutbutton;

	@FindBy(xpath="//div[@id='terms-of-service-warning-box']//p")
	WebElement popmessage;

	@FindBy(xpath="//button[@title='Close']")
	WebElement popupclose;

	@FindBy(xpath="//input[@class='button-1 cart-button']")
	WebElement gotocart;

	@FindBy(xpath="//input[@name='updatecart']")
	WebElement updatecartButton;

	@FindBy(xpath="//div[@class='table-wrapper']//tr[3]//td[6]//input[@class='qty-input']")
	WebElement updateCartValue;

	//tr[@class='order-subtotal']//span[@class='value-summary']



	@FindBy(xpath="//tr[@class='order-subtotal']//span[@class='value-summary']")
	WebElement Subtotal;

	@FindBy(xpath="//tr[@class='order-total']//span[@class='value-summary']")
	WebElement total;

	@FindBy(xpath="//input[@id='termsofservice']")
	WebElement termsofservice;


	@FindBy(xpath="//h1[contains(text(),'Welcome, Please Sign In!')]")
	WebElement signInMessage;




	public NopCommerce_CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	//this method moves to shopping cart and clicks 
	public void clickOnShoppingCart() throws InterruptedException{
		Thread.sleep(4000);
		Webgenericutility.mouseHover(shoppingcart);
		gotocart.click();
	}

	//this method updates the cart item value
	public void updateJewelryCart(){

		Webgenericutility.sendKeyValue(driver, updateCartValue, 2, "3");
		updatecartButton.click();

	}


	public void verifySubTotal(){

		String sub1=Subtotal.getText();
		String Sub2=total.getText();
		Assert.assertEquals(Sub2, sub1);

	}

	//this method clicks on pop up

	public void verifyTermsAndServicePopup(){
		checkoutbutton.click();
		String actualmessage = popmessage.getText();
		String expectedMessage = "Please accept the terms of service before the next step.";
		Assert.assertEquals(actualmessage, expectedMessage);
		popupclose.click();


	}

	//this method clicks on terms and service check box and clicks on check out as guest

	public void clickCheckOutButton(){
		termsofservice.click();
		checkoutbutton.click();
	}

	//This method verify if the the text "welcome Welcome, Please Sign In!" 
	public void verifySignInPage(){
		String actualMessage = signInMessage.getText();
		String expectedMessage = "Welcome, Please Sign In!";
		Assert.assertEquals(actualMessage, expectedMessage);
	}
}