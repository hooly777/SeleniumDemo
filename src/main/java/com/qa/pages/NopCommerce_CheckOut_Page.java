package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.basetest.BaseTest;

public class NopCommerce_CheckOut_Page extends BaseTest {

	public Actions action;

	@FindBy(xpath="//h1[contains(text(),'Welcome, Please Sign In!')]")
	WebElement signInMessage;

	@FindBy(xpath="//input[@class='button-1 checkout-as-guest-button']")
	WebElement ceckoutasguestbutton;

	public NopCommerce_CheckOut_Page()
	{
		PageFactory.initElements(driver, this);
	}

	//Verifying Sign In Page
	public void verifySignInPage(){
		String actualMessage = signInMessage.getText();
		String expectedMessage = "Welcome, Please Sign In!";
		Assert.assertEquals(actualMessage, expectedMessage);
	}

	// Clicking on Check Out As Guest Button
	public void checkOutAsGuestButton(){
		ceckoutasguestbutton.click();
		String expTitle = "nopCommerce demo store. Checkout";
		String actTilte = driver.getTitle();
		System.out.println("current page title: " +actTilte);
		//validating the title of Check Out page
		Assert.assertEquals(actTilte, expTitle);
	}

}