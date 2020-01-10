package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class NopCommerce_CheckOut_Page extends BaseTest {

	public Actions action;

	@FindBy(xpath="//h1[contains(text(),'Welcome, Please Sign In!')]")
	WebElement signInMessage;

	@FindBy(xpath="//input[@class='button-1 checkout-as-guest-button']")
	WebElement ceckoutasguestbutton;

	@FindBy(id="BillingNewAddress_FirstName")
	WebElement firstname;
	
	@FindBy(id="BillingNewAddress_LastName")
	WebElement lastname;
	
	@FindBy(id="BillingNewAddress_Email")
	WebElement email;
	
	@FindBy(id="BillingNewAddress_CountryId")
	WebElement country;
	
	@FindBy(xpath="//option[text()='India']")
	WebElement countryindia;
	
	@FindBy(id="BillingNewAddress_City")
	WebElement city;

	@FindBy(id="BillingNewAddress_Address1")
	WebElement address;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	WebElement zipcode;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	WebElement phonenumber;
	
	@FindBy(xpath="//input[@onclick='Billing.save()']")
	WebElement detailscontinuebutton;
	
	@FindBy(xpath="//input[@class='button-1 shipping-method-next-step-button']")
	WebElement shippingmethodbutton;
	
	@FindBy(xpath="//input[@class='button-1 payment-method-next-step-button']")
	WebElement paymentmethodbutton;
	
	@FindBy(xpath="//input[@class='button-1 payment-info-next-step-button']")
	WebElement paymentinfobutton;
	
	@FindBy(xpath="//input[@class='button-1 confirm-order-next-step-button']")
	WebElement confirmorderbutton;
	
	@FindBy(xpath="//strong[contains(text(),'Your order has been successfully processed!')]")
	WebElement ordersuccessfulmessage;
	
	public NopCommerce_CheckOut_Page()
	{
		PageFactory.initElements(driver, this);
	}

	//Verifying Sign In Page
	public void verifySignInPage(){
		String actualMessage = signInMessage.getText();
		String expectedMessage = "Welcome, Please Sign In!";
		Assert.assertEquals(actualMessage, expectedMessage);
	}

	// Clicking on Check Out As Guest Button
	public void checkOutAsGuestButton(){
		ceckoutasguestbutton.click();
		String expTitle = "nopCommerce demo store. Checkout";
		String actTilte = driver.getTitle();
		System.out.println("current page title: " +actTilte);
		//validating the title of Check Out page
		Assert.assertEquals(actTilte, expTitle);
	}
	
	public void fillingDetails() throws InterruptedException{
		Webgenericutility.sendKeyValue(driver, firstname, 2, "hamsa");
		Webgenericutility.sendKeyValue(driver, lastname, 2, "M");
		Webgenericutility.sendKeyValue(driver, email, 2, "shamsa@hcl.com");
		Webgenericutility.selectByVissibletext(country, "India");
		Webgenericutility.sendKeyValue(driver, city, 2, "Bangalore");
		Webgenericutility.sendKeyValue(driver, address, 2, "Bangalore hulimavu");
		Webgenericutility.sendKeyValue(driver, zipcode, 2, "560067");
		Webgenericutility.sendKeyValue(driver, phonenumber, 2, "123456789");
		detailscontinuebutton.click();
		Thread.sleep(2000);
		shippingmethodbutton.click();
		Thread.sleep(2000);
		paymentmethodbutton.click();
		Thread.sleep(2000);
		paymentinfobutton.click();
		Thread.sleep(2000);
		confirmorderbutton.click();
		Thread.sleep(2000);
	}
	
	public void verifyingOrderPage(){
		String expectedordermessage = ordersuccessfulmessage.getText();
		String actualordermessage = "Your order has been successfully processed!";
		Assert.assertEquals(actualordermessage, expectedordermessage);
	}

}