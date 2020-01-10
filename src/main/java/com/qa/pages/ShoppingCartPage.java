package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.basetest.BaseTest;

public class ShoppingCartPage extends BaseTest {
//Constructor
	public ShoppingCartPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//WebElement for Heading of Shopping Cart Landing page
	@FindBy(xpath="//h1[contains(text(),'Shopping cart')]")
	WebElement ShoppingCartLabel;
	public WebElement ShoppingCartLabelElement(){
		return ShoppingCartLabel;
	}
	
	//WebElement for Shopping Cart Sub-Total label
	@FindBy(xpath="//label[contains(text(),'Sub-Total:')]")
	WebElement ShoppingCartSubTotalLabel;
	
	public WebElement ShoppingCartSubTotalLabelElement(){
		return ShoppingCartSubTotalLabel;
	}
	
	//WebElement for Jewelry Quantity
	@FindBy(xpath="//div[@class='table-wrapper']/table/tbody/tr[3]/td[6]/input")
	WebElement JwlQuantity;
	
	public WebElement JewelryQuantityElement(){
		return JwlQuantity;
	}
	
	//WebElement for Update Shopping Cart button
	@FindBy(xpath="//input[@name='updatecart']")
	WebElement UpdateShoppingCartBtn;
	
	public WebElement UpdateShoppingCartElement(){
		return UpdateShoppingCartBtn;
	}
	
	//WebElement for EULA Select button
	@FindBy(xpath="//input[@id='termsofservice']")
	WebElement EULA;
	
	public WebElement EULAElement(){
		return EULA;
	}
	
	//WebElement for Checkout button
	@FindBy(xpath="//button[@id='checkout']")
	WebElement CheckoutBtn;
	
	public WebElement CheckoutElement(){
		return CheckoutBtn;
	}
	
	
	
	
}
