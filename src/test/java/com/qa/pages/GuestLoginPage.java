package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class GuestLoginPage extends BaseTest{
Webgenericutility webutility= new Webgenericutility();
	
	public GuestLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//First Name field
	@FindBy(xpath="//input[@id='BillingNewAddress_FirstName']")
	WebElement fnameelement;
	//Last Name field
	@FindBy(xpath="//input[@id='BillingNewAddress_LastName']")
	WebElement lnameelement;
	//Email field
	@FindBy(xpath="//input[@id='BillingNewAddress_Email']")
	WebElement emailelement;
	//Country field
	@FindBy(id="BillingNewAddress_CountryId")
	WebElement countryelement;
	//Billing Address City field
	@FindBy(xpath="//input[@id='BillingNewAddress_City']")
	WebElement billaddresscity;
	//BillingNewAddres Address1 field
	@FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
	WebElement billaddresse1;
	//Zip postal code field
	@FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
	WebElement zipcode;
	//BillingNewAddress_PhoneNumber fieldBy.xpath
	@FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
	WebElement billaddressphonenum;
	//Continue Button
	@FindBy(xpath="//input[@onclick='Billing.save()']")
	WebElement btnBillingContinue;
	
	public void setFirstname(String strFirstName){

		fnameelement.sendKeys("AAAA");   
		
	}

	public void setLastname(String strLastName){

		lnameelement.sendKeys("BBBB");   
		
	}
	public void setEmailname(String strEmailName){

		emailelement.sendKeys("ghh@gmail.com");   
		
	}
	public void setCountryname(String strCountryName){

		countryelement.sendKeys("India");   
		
	}
	public void setAddressCity(String strAddressCity){

		billaddresscity.sendKeys("Bangalore");   
		
	}
	public void setAddressline(String strAddressLine){

		billaddresse1.sendKeys("76,Zoo Street");   
		
	}
	
	public void setZipCode(String strZipCode){

		zipcode.sendKeys("560100");   
		
	}
	public void setAddressAddressPhone(String strAddressPhoneNumber){

		billaddressphonenum.sendKeys("0808888888");   
		
	}
	
	public void btnBillingContinue(){

		btnBillingContinue.click();

	}  
	public void GuestLogin(String strFirstName,String strLastName,String strEmailName,String strCountryName,String strAddressCity,String strAddressLine,String strZipCode,String strAddressPhoneNumber){
		
		
		this.setFirstname(strFirstName);
		this.setLastname(strLastName);
		this.setEmailname(strEmailName);
		this.setCountryname(strCountryName);
		this.setAddressCity(strAddressCity);
		this.setAddressline(strAddressLine);
		this.setZipCode(strZipCode);
		this.setAddressAddressPhone(strAddressPhoneNumber);
		this.btnBillingContinue();  
		this.btnBillingContinue();  
		this.btnBillingContinue();  
		this.btnBillingContinue();  
		this.btnBillingContinue();  
		this.btnBillingContinue();  
	}	

	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
 
}
