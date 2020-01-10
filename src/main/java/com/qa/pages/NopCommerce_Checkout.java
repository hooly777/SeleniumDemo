package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.Webgenericutility;

public class NopCommerce_Checkout {
	
	@FindBy(xpath="//li[@id='opc-billing']//div[@class='step-title']")
	public static WebElement billingAddressclick;
	

	@FindBy(name="BillingNewAddress.FirstName")
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
	public static WebElement billingAdressBtn;
	
	@FindBy(css="div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page div.page-body.checkout-data ol.opc li.tab-section.allow.active:nth-child(3) div.step.a-item form:nth-child(1) div.buttons:nth-child(2) > input.button-1.shipping-method-next-step-button")
	public static WebElement continueButton2;
	
	

	@FindBy(xpath="//input[@class='button-1 payment-method-next-step-button']")
	public static WebElement continueButton3;
	
	@FindBy(xpath="//input[@class='button-1 payment-info-next-step-button']")
	public static WebElement continueButton4;
	
	@FindBy(xpath="//input[@class='button-1 confirm-order-next-step-button']")
	public static WebElement continueButton5;


public NopCommerce_Checkout(WebDriver driver){



	//This initElements method will create all WebElements

	PageFactory.initElements(driver, this);

}


public void billingAddressclick(){
	
	Webgenericutility.clickOn(billingAddressclick, 10);
}

public void enterFirstname(String fname){
	
	firstName.sendKeys(fname);
	//Webgenericutility.sendKeyValue(firstName, 0, fname);
	
}

public void enterLastname(String lname){
	
	lastName.sendKeys(lname);
	
}

public void enterEmailID(String emailid){
	
	email.sendKeys(emailid);
}
public void enterCountry(String country1){
	
	country.sendKeys(country1);
}

public void enterCity(String city1){
	city.sendKeys(city1);
}
public void enterAddress1(String address){
	
	address1.sendKeys(address);
}

public void enterZipCode(String zippostal){
	zipPostCode.sendKeys(zippostal);
}

public void enterPhoneNumber(String phonenumber){
	
	phoneNumber.sendKeys(phonenumber);
}

public void billingAddresscontinueclick(){
	billingAdressBtn.click();
	//Webgenericutility.clickOn(continueButton1, 10);
}

public void shippingContinueClick(){
	
	continueButton2.click();
	System.out.println("Shipping method continue clicked");
}
public void paymentContinueClick(){
	
	continueButton3.click();
}
public void paymentinformationContinueClick(){
	
	continueButton4.click();
}
public void confirmButtonClick(){
	continueButton5.click();
	//Webgenericutility.clickOn(continueButton5, 10);
}
}
