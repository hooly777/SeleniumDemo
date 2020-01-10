package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import com.hackathon.utility

public class NopCommerceSignInPage{

	WebDriver driver;
	public NopCommerceSignInPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}

	@FindBy(xpath="//div[@class='page-title']/h1[text()='Welcome, Please Sign In!']") WebElement pageHeader;
	@FindBy(xpath="//input[@class='button-1 checkout-as-guest-button']") WebElement btnCheckOutAsGuest;
	@FindBy(xpath="//input[@id='BillingNewAddress_FirstName']") WebElement txtName;
	@FindBy(xpath="//input[@id='BillingNewAddress_LastName']") WebElement txtLastName;
	@FindBy(xpath="//input[@id='BillingNewAddress_Email']") WebElement txtEmail;
	@FindBy(xpath="//input[@id='BillingNewAddress_Address1']") WebElement txtAddress1;
	@FindBy(xpath="//input[@id='BillingNewAddress_City']") WebElement txtBillingAddress;
	@FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']") WebElement txtzip;
	@FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']") WebElement txtPhone;
	@FindBy(xpath="//input[@title='Continue']") WebElement btnContinue;
	@FindBy(xpath="(//input[@class='button-1 new-address-next-step-button'])[2]") WebElement btnContinue2;
	@FindBy(xpath="//input[@class='button-1 shipping-method-next-step-button']") WebElement btnContinueNext;
	//@FindBy(xpath="//input[@class='button-1 shipping-method-next-step-button']") WebElement btnContinue;
	@FindBy(xpath="//input[@class='button-1 payment-method-next-step-button']") WebElement btnContinuepayment;
	@FindBy(xpath="//input[@class='button-1 payment-info-next-step-button']") WebElement btnContinueinfo;
	@FindBy(xpath="//input[@class='button-1 confirm-order-next-step-button']") WebElement btnConfirm;
	@FindBy(xpath="//div[@class='title']/strong[text()='Your order has been successfully processed!']") WebElement messageOrdersuccess;
	@FindBy(xpath="//*[@id='BillingNewAddress_CountryId']") WebElement CountryId;
	
	public void isPageDisplayed()
	{
		if(pageHeader.isDisplayed())
		{
			Reporter.log("NopCommerce SignIn page is displayed",true);
		}
		else
			Reporter.log("NopCommerce SignIn page is not displayed",false);

	}
	public void clickCheckoutAsGuest() 
	{
		btnCheckOutAsGuest.click();
		Reporter.log("Checkout as guest button is clicked",true);

	}
	public void enterDetails(String Text,String Text2) throws InterruptedException 
	{
		txtName.sendKeys(Text);
		txtLastName.sendKeys(Text);
		txtEmail.sendKeys(Text2);
		txtAddress1.sendKeys(Text);
		txtBillingAddress.sendKeys(Text);
		txtzip.sendKeys(Text);
		txtPhone.sendKeys(Text);
		Select s = new Select(CountryId); 
		s.selectByIndex(3);
		btnContinue.click();
		//btnContinue2.click();
		Thread.sleep(2000);
		btnContinueNext.click();
		Thread.sleep(2000);
		btnContinuepayment.click();
		Thread.sleep(2000);
		btnContinueinfo.click();
		Thread.sleep(2000);
		btnConfirm.click();
		

	}
	
	public void verifyOrderSuccessfulMessage()
	{
		if(messageOrdersuccess.isDisplayed())
		{
			Reporter.log("Order successful message is displayed",true);
		}
		else
			Reporter.log("Order successful message  is not displayed",false);

	}


}

