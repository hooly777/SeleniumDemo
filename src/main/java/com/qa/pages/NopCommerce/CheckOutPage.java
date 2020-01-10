package com.qa.pages.NopCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

import junit.framework.Assert;

public class CheckOutPage extends BaseTest {
	
	
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
	
	@FindBy(xpath = "//*[contains(text(),' successfully processed!')]")
	WebElement OrderSuccesfulMsg;
	
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public void fillCheckOutForm() throws Exception{
		firstName.sendKeys("sharoonroja");
		lastName.sendKeys("gaddam");
		email.sendKeys("sharoonroja0912@gmail.com");
		Webgenericutility.selectByValue(selectCountry, "133");
		city.sendKeys("bangalore");
		address1.sendKeys("Btm 2nd Stage");
		zipCode.sendKeys("560076");
		phoneNumber.sendKeys(" 9006580790");
		continueBtn.click();
		Thread.sleep(1000);
		shippingcontinueBtn.click();
		Thread.sleep(1000);
		paymentcontinueBtn.click();
		Thread.sleep(1000);
		paymentInfocontinueBtn.click();
		Thread.sleep(1000);
		confirmOrderBtn.click();
	}
	public void verifyOrderSuccessfulPage(){
		String Expected="Your order has been successfully processed!";
		String Actual=OrderSuccesfulMsg.getText();
		Assert.assertEquals(Expected, Actual);
		System.out.println(" verified order successful page");
	}
}
