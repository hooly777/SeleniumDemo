package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.basetest.BaseTest;

public class JewelryPage extends BaseTest {
//Constructor
	public JewelryPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//WebElement of Selecting Jewelry by Highest to Lowest price
	@FindBy(xpath="//select[@id='products-orderby']")
	WebElement HighestJewelryLink;
	public WebElement HighestJewelryElement(){
		return HighestJewelryLink;
	}
	
	public void SortJewelryByHighPrice(){
		Select SortPhone = new Select(HighestJewelryLink);
		SortPhone.selectByVisibleText("Price: High to Low");
	}
	
	//Webelement for AddToCart1 Button
	@FindBy(xpath="//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
	WebElement AddToCartJwlryButton;
	public WebElement AddToCartJwlryElement(){
		return AddToCartJwlryButton;
	}

	//Webelement for Jewelry
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[6]/a")
	WebElement JewelryTab;
	public WebElement JewelryElement(){
		return JewelryTab;
	}
	
	//WebElement for Successful message for adding of items to cart
	@FindBy(xpath="//div[@class='bar-notification-container']/div/p")
	WebElement Confirmation	;
	public WebElement ConfirmationMsg(){
		return Confirmation;
	}
	
	//Webelement for Confirmationmessage
	@FindBy(xpath="//span[@class='cart-label']")
	WebElement ShoppingCartLink;
	public WebElement ShoppingCartLinkElement(){
	return ShoppingCartLink;
	}
	
	//Code for Clicking on GO TO CART
	public void ShoppingCart() throws InterruptedException{
		Actions ShoppingCartAction=new Actions(driver);
		ShoppingCartAction.moveToElement(ShoppingCartLink).build().perform(); 
		Thread.sleep(4000);
	}
	
	
	//Webelement for Go To Cart 
	@FindBy(xpath="//input[@class='button-1 cart-button']")
	WebElement GoToCartBtn;
	public WebElement GoToCartElement(){
	return GoToCartBtn;
	}
	
	//Code for Clicking on GO TO CART
	public void GoToCart(){
		GoToCartBtn.click();
	}
	
	
		
}
