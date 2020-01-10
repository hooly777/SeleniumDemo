package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.Utility.Webgenericutility;

public class NopCommerce_Checkout {
	
	@FindBy(xpath="//li[@id='opc-billing']//div[@class='step-title']")
	public static WebElement billingAddressclick;
	

	@FindBy(xpath="//*[@name='BillingNewAddress.FirstName']")
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


public NopCommerce_Checkout(WebDriver driver){



	//This initElements method will create all WebElements

	PageFactory.initElements(driver, this);

}


public void billingAddressclick(){
	
	Webgenericutility.clickOn(billingAddressclick);
}

public void enterFirstname(String fname){
	
	firstName.sendKeys(fname);
	
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
	
	Webgenericutility.clickOn(continueButton1);
}

public void shippingContinueClick(){
	
	Webgenericutility.clickOn(continueButton2);
}
public void paymentContinueClick(){
	
	Webgenericutility.clickOn(continueButton3);
}
public void paymentinformationContinueClick(){
	
	Webgenericutility.clickOn(continueButton4);
}
public void confirmButtonClick(){
	
	Webgenericutility.clickOn(continueButton5);
}
}
