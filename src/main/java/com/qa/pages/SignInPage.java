package com.qa.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class SignInPage extends BaseTest
{
	@FindBy(className = "checkout-as-guest-button")
	WebElement checkOutAsGuestBtn;

	@FindBy(id = "BillingNewAddress_FirstName")
	WebElement firstName;

	@FindBy(id = "BillingNewAddress_LastName")
	WebElement lastName;

	@FindBy(id = "BillingNewAddress_Email")
	WebElement email;

	@FindBy(id = "BillingNewAddress_CountryId")
	WebElement selectCountry;

	@FindBy(id = "BillingNewAddress_City")
	WebElement city;

	@FindBy(id = "BillingNewAddress_Address1")
	WebElement address1;

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	WebElement zipCode;

	@FindBy(id = "BillingNewAddress_PhoneNumber")
	WebElement phoneNumber;

	@FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/input")
	WebElement continueBtn;

	@FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/input")
	WebElement shippingcontinueBtn;

	@FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/input")
	WebElement paymentcontinueBtn;

	@FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/input")
	WebElement paymentInfocontinueBtn;

	@FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/input")
	WebElement confirmOrderBtn;
	
	@FindBy(xpath="(//div[@class='title'])[1]")
	WebElement orderConfirmationMessage;

	public SignInPage(){
		PageFactory.initElements(driver, this);
	}

	public void verifySignInPage(){
		String title = driver.getTitle();
		//assertEquals(title, "Welcome, Please Sign In!");
		System.out.println(title);
	}
	public void checkOutAsGuest(){
		checkOutAsGuestBtn.click();
	}
	public void startFillData() throws InterruptedException{
		firstName.sendKeys("Soni");
		lastName.sendKeys("Kumari");
		email.sendKeys("soni-kumari@hcl.com");
		Thread.sleep(1000);
		Webgenericutility.selectFromDropdownByVisibleText(selectCountry, "India");
		city.sendKeys("Bangalore");
		address1.sendKeys("Doddanekundi");
		zipCode.sendKeys("560037");
		phoneNumber.sendKeys("1234567890");
		continueBtn.click();
		Thread.sleep(1000);
		shippingcontinueBtn.click();
		Thread.sleep(1000);
		paymentcontinueBtn.click();
		Thread.sleep(1000);
		paymentInfocontinueBtn.click();
		Thread.sleep(1000);
		confirmOrderBtn.click();
		String text = orderConfirmationMessage.getText();
		assertEquals(text, "Your order has been successfully processed!");

	}
}
