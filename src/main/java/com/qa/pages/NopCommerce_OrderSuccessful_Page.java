package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.basetest.BaseTest;

public class NopCommerce_OrderSuccessful_Page extends BaseTest {

	public Actions action;
	
	@FindBy(xpath="//strong[contains(text(),'Your order has been successfully processed!')]")
	WebElement ordersuccessfulmessage;
	
	public NopCommerce_OrderSuccessful_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Verifying Order Successful Page
	public void verifyingOrderPage(){
		String expectedordermessage = ordersuccessfulmessage.getText();
		String actualordermessage = "Your order has been successfully processed!";
		Assert.assertEquals(actualordermessage, expectedordermessage);
	}

}