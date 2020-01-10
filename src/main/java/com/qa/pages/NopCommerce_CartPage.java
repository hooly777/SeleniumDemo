package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

import junit.framework.Assert;

public class NopCommerce_CartPage extends BaseTest {

	public Actions action;
	//Shopping Cart
	@FindBy(xpath="//li[@id='topcartlink']")
	WebElement shoppingcart;
	
	@FindBy(xpath="//input[@class='button-1 cart-button']")
	WebElement gotocart;
	
	@FindBy(xpath="//input[@name='updatecart']")
	WebElement updatecartButton;
	
	@FindBy(xpath="//div[@class='table-wrapper']//tr[3]//td[6]//input[@class='qty-input']")
	WebElement updateCartValue;
	
	//tr[@class='order-subtotal']//span[@class='value-summary']


	
	@FindBy(xpath="//tr[@class='order-subtotal']//span[@class='value-summary']")
	WebElement Subtotal;
	
	@FindBy(xpath="//tr[@class='order-total']//span[@class='value-summary']")
	WebElement total;
	
	public NopCommerce_CartPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnShoppingCart() throws InterruptedException{
		Thread.sleep(4000);
		Webgenericutility.mouseHover(shoppingcart);
		gotocart.click();
	}
	
	public void updateJewelryCart(){
		
		Webgenericutility.sendKeyValue(driver, updateCartValue, 2, "3");
		updatecartButton.click();
		
	}

	
public void verifySubTotal(){
		
	String sub1=Subtotal.getText();
	String Sub2=total.getText();
	Assert.assertEquals(Sub2, sub1);
		
	}
}