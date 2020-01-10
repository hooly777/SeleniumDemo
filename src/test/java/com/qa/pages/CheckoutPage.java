package com.qa.pages;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.log4testng.Logger;

import com.qa.Utility.ExcellUtility;
import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class CheckoutPage extends BaseTest {
	Webgenericutility webTestUtil= new Webgenericutility();
	ExcellUtility excellUtility = new ExcellUtility();
	private final static Logger log = Logger.getLogger(CheckoutPage.class);
	
		public CheckoutPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//*[@title='Continue']")
	WebElement Continue;
	@FindBy(xpath="//div[@class='page-title']/h1[text()='Welcome, Please Sign In!']") WebElement pageHeader;
    @FindBy(xpath="//input[@class='button-1 checkout-as-guest-button']") WebElement btnCheckOutAsGuest;
    @FindBy(xpath="//input[@id='BillingNewAddress_FirstName']") WebElement txtName;
    @FindBy(xpath="//input[@id='BillingNewAddress_LastName']") WebElement txtLastName;
    @FindBy(xpath="//input[@id='BillingNewAddress_Email']") WebElement txtEmailAddress;
    @FindBy(xpath="//input[@id='BillingNewAddress_City']") WebElement txtBillingAddress; 
    @FindBy(xpath="//input[@id='BillingNewAddress_Address1']") WebElement txtBillingAddress1; 
    @FindBy(xpath="//*[@id='BillingNewAddress_CountryId']") WebElement CountryId;
    @FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']") WebElement txtzip;
    @FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']") WebElement txtPhone;
    @FindBy(xpath="//input[@title='Continue']") WebElement btnContinue;
    @FindBy(xpath="//input[@class='button-1 shipping-method-next-step-button']") WebElement btnContinueNext;
    @FindBy(xpath="//input[@class='button-1 shipping-method-next-step-button']") WebElement btnContinueNexts;
    @FindBy(xpath="//input[@class='button-1 payment-method-next-step-button']") WebElement btnContinuepayment;
    @FindBy(xpath="//input[@class='button-1 payment-info-next-step-button']") WebElement btnContinueinfo;
    @FindBy(xpath="//input[@class='button-1 confirm-order-next-step-button']") WebElement btnConfirm;
    @FindBy(xpath="//*[@id='ShipToSameAddress']") WebElement ShipToSameAddress;
    @FindBy(xpath="//div[@class='title']/strong[text()='Your order has been successfully processed!']") WebElement ordersuccessfully;

  //div[@class='title']/strong[text()='Your order has been successfully processed!']
	
	public void OrderCheckout(String name,String email  ) throws InterruptedException {
		
		txtName.sendKeys(name);		
		txtLastName.sendKeys(name);
		Select s = new Select(CountryId);		
		s.selectByIndex(3);
		txtEmailAddress.sendKeys(email);
		txtBillingAddress.sendKeys(name);
		txtBillingAddress1.sendKeys(name);
		txtzip.sendKeys(name);
		txtPhone.sendKeys(name);
		//ShipToSameAddress.click();
//		Thread.sleep(20000);
		btnContinue.click();
		Thread.sleep(20000);
//		btnContinueNext.click();
		Thread.sleep(20000);
		btnContinueNexts.click();
		Thread.sleep(20000);
		btnContinuepayment.click();
		Thread.sleep(20000);
		btnContinueinfo.click();
		Thread.sleep(20000);
		btnConfirm.click();	
		ordersuccessfully.isDisplayed();
		String Ordermsg = ordersuccessfully.getText();
		System.out.println(Ordermsg);
		
	}
	
	
	
	
}
