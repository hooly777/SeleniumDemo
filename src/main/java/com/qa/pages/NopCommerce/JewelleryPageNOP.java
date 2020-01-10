package com.qa.pages.NopCommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class JewelleryPageNOP extends BaseTest {

	
	
	@FindBy(id = "products-orderby")
	private WebElement sortBy;
	
	@FindBy(xpath="//input[@value='Add to cart']")
	private WebElement AddToCart;
	
	@FindBy(xpath="//*[text()='Shopping cart']")
	private WebElement ShoppingCart;
	
	@FindBy(xpath="//div[@class='bar-notification success']")
	private WebElement NotificationAddingCart;
	
	@FindBy(xpath="//input[@value='Go to cart']")
	private WebElement GoToCart;
	
	public JewelleryPageNOP(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public void sortJewelryPriceHighToLow() {
		Webgenericutility.selectByVisibleText(sortBy, "Price: High to Low");
	}
	public void AddHPJewelryToCart() throws Exception{
		AddToCart.click();
		
	}
	public void verifyNotification(){
		String ActualText=NotificationAddingCart.getText();
		System.out.println(" the expected text is :-"+ActualText);
		String ExpectedText="The product has been added to your shopping cart";
		Assert.assertEquals(ExpectedText, ActualText);
	}
	public  void mouseHoverShoppingCart(){
		Webgenericutility.mouseHover(ShoppingCart);
		
	}
	public void clickGoToCart(){
		GoToCart.click();
	}
	
}
