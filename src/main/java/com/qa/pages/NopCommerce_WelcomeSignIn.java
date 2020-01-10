package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.basetest.BaseTest;

public class NopCommerce_WelcomeSignIn extends BaseTest{
	
	@FindBy(xpath="//div[@class='page-title']/h1")
	WebElement welcomeMessage;
	
	@FindBy(xpath="//input[@class='button-1 checkout-as-guest-button']")
	WebElement checkoutasguestbutton;
	
	public NopCommerce_WelcomeSignIn()
	{
		PageFactory.initElements(driver, this);
	}

	//verify welcome sign in page
	
public void verifySignInPage() throws InterruptedException{
		Thread.sleep(1000);
		String actualMessage = welcomeMessage.getText();
		System.out.println(actualMessage);
		String expectedMessage = "Welcome, Please Sign In!";
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	
	//click on checkoutAs guest
	
	public void checkOutAsGuestButton(){
		checkoutasguestbutton.click();
		String actualCheckout = driver.getTitle();
		String expectedCheckout = "nopCommerce demo store. Checkout";
		Assert.assertEquals(actualCheckout, expectedCheckout);
		
	}
	
	
}
