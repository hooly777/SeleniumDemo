/*
 *This class is created to Modify the jewelry item count to 3 and Click on update shopping cart button.
 *Click on checkout button and verify the terms and service popup and close the popup.
 */package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class NopCommerce_CartPage extends BaseTest {

	//public Actions action;
	//Shopping Cart
	@FindBy(xpath="//li[@id='topcartlink']")
	WebElement shoppingcart;

	@FindBy(xpath="//input[@class='button-1 cart-button']")
	WebElement gotocart;

	@FindBy(xpath="//div[@class='table-wrapper']//tr[3]//td[6]//input[@class='qty-input']")
	WebElement updateCartValue;

	@FindBy(xpath="//input[@name='updatecart']")
	WebElement updatecartButton;
	
	// xpath of cellphone and jwellery item in shopping cart
	
	@FindBy(xpath="(//a[@class='product-name'])[1]")
	WebElement item1;
	
	@FindBy(xpath="(//a[@class='product-name'])[2]")
	
	WebElement item2;
	
	@FindBy(xpath="(//a[@class='product-name'])[3]")
	
	WebElement item3;
	
	@FindBy(xpath="//tr[@class='order-total']//span[@class='value-summary']")
	WebElement subTotal;
	
	@FindBy(xpath="//tr[@class='order-subtotal']//span[@class='value-summary']")
	
	WebElement totalvalue;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkoutbutton;
	
	@FindBy(xpath="//div[@id='terms-of-service-warning-box']//p")
	WebElement popmessage;
	
	@FindBy(xpath="//button[@title='Close']")
	WebElement popupclose;
	
	@FindBy(xpath="//input[@id='termsofservice']")
	WebElement termofservicecheckbox;
	


	public NopCommerce_CartPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnShoppingCart() throws InterruptedException{
		Webgenericutility.mousehover(shoppingcart);
		Thread.sleep(4000);
		gotocart.click();
	}

	public void updateJewelryCart() throws InterruptedException{
		
		Webgenericutility.sendKeyValue(driver, updateCartValue, 2, "3");
		updatecartButton.click();
		Thread.sleep(4000);


	}
	public void getcartdetails(){
		
		String cell1 = item1.getText();
		System.out.println(cell1);
		String cell2 = item2.getText();
		System.out.println(cell2);
		String jewel1 =item3.getText();
		System.out.println(jewel1);
		
	}
	
	public void verifySubtotal(){
		String subt=subTotal.getText();
		String Total=totalvalue.getText();
		Assert.assertEquals(subt, Total);
	}
	
	//verify the terms and service popup and close the popup
	
	public void verifyTermsAndServicePopup(){
		checkoutbutton.click();
		String actualmessage = popmessage.getText();
		String expectedMessage = "Please accept the terms of service before the next step.";
		Assert.assertEquals(actualmessage, expectedMessage);
		popupclose.click();
	}
	
	//Click on checkout button 
	public void clickCheckOut(){
		termofservicecheckbox.click();
		checkoutbutton.click();
	}
	

	
		
	
	
	
	
}

