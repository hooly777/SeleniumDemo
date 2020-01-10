package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

import junit.framework.Assert;

public class SignInpage extends BaseTest {
	
	public SignInpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id ="BillingNewAddress_FirstName")
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

	public void SignInPage() {
		
		firstName.sendKeys("Chetana");
		lastName.sendKeys("Rotti");
		email.sendKeys("chetanabpatil@gmail.com");
		Webgenericutility.selectDropdownByText(selectCountry, "India", 20);
		city.sendKeys("Bangalore");
		address1.sendKeys("jp Nagar");
		zipCode.sendKeys("560008");
		phoneNumber.sendKeys("9886714012");
		
		continueBtn.click();
		shippingcontinueBtn.click();
		paymentcontinueBtn.click();
		paymentInfocontinueBtn.click();
		confirmOrderBtn.click();
		
		
		
		
	}
}