package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {
	
	@FindBy(xpath="//li[@id='opc-billing']//div[@class='step-title']")
	public static WebElement billingAddressclick;
	

	@FindBy(id="BillingNewAddress_FirstName")
	public static WebElement firstName;
	
	@FindBy(id="BillingNewAddress_LastName")
	public static WebElement lastName;
	
	@FindBy(id="BillingNewAddress_Email")
	public static WebElement email;
	
	@FindBy(id="BillingNewAddress_CountryId")
	public static WebElement country;
	
	@FindBy(id="BillingNewAddress_City")
	public static WebElement city;
	
	@FindBy(id="BillingNewAddress_Address1")
	public static WebElement address1;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	public static WebElement zipPostCode;
	

	@FindBy(id="BillingNewAddress_PhoneNumber")
	public static WebElement phoneNumber;
	
	@FindBy(xpath="//div[@id='billing-buttons-container']//input[@class='button-1 new-address-next-step-button']")
	public static WebElement continueButton1;
	
	@FindBy(xpath="//input[@class='button-1 shipping-method-next-step-button']")
	public static WebElement continueButton2;
	

	@FindBy(xpath="//input[@class='button-1 payment-method-next-step-button']")
	public static WebElement continueButton3;
	
	@FindBy(xpath="//input[@class='button-1 payment-info-next-step-button']")
	public static WebElement continueButton4;
	
	@FindBy(xpath="//input[@class='button-1 confirm-order-next-step-button']")
	public static WebElement continueButton5;


	
	

}
