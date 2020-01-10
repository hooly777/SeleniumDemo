package com.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class NopCommerce_Checkout extends BaseTest {
	
	
	
	@FindBy(id="BillingNewAddress_FirstName")
	WebElement FirstName;
	@FindBy(id="BillingNewAddress_LastName")
	WebElement LastName;
	@FindBy(id="BillingNewAddress_Email")
	WebElement Email;
	@FindBy(id="BillingNewAddress_Company")
	WebElement Company;
	@FindBy(id="BillingNewAddress_CountryId")
	WebElement Country;
	@FindBy(id="BillingNewAddress_StateProvinceId")
	WebElement State_province;
	@FindBy(id="BillingNewAddress_City")
	WebElement City;
	@FindBy(id="BillingNewAddress_Address1")
	WebElement Address1;
	@FindBy(id="BillingNewAddress_Address2")
	WebElement Address2;
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	WebElement Zip;
	@FindBy(id="BillingNewAddress_PhoneNumber")
	WebElement Phone_number;
	@FindBy(id="BillingNewAddress_FaxNumber")
	WebElement Fax_number;
	@FindBy(xpath="(//div[@class='buttons']//input[@title='Continue'])[1]")
	WebElement continuebtn;
	
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
	
	
	public NopCommerce_Checkout (){
		PageFactory.initElements(driver, this);
	}
	
	public void BillingDetails() throws InterruptedException{
		Webgenericutility.sendKeyValue(driver, FirstName, 2, "Khushboo");
		Webgenericutility.sendKeyValue(driver, LastName, 2, "Tomar");
		Webgenericutility.sendKeyValue(driver, Email, 2, "Khushboo.T@hcl.com");
		Webgenericutility.selectByvisibletext(Country, "India");
		Webgenericutility.sendKeyValue(driver, City, 2, "Bangalore");
		Webgenericutility.sendKeyValue(driver, Address1, 2, "Bangalore Domlur");
		Webgenericutility.sendKeyValue(driver, Address2, 2, "Karnataka");
		Webgenericutility.sendKeyValue(driver, Zip, 2, "560010");
		Webgenericutility.sendKeyValue(driver, Phone_number, 2, "123456789");
		Webgenericutility.sendKeyValue(driver, Fax_number, 2, "123456");
		
		continuebtn.click();
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
