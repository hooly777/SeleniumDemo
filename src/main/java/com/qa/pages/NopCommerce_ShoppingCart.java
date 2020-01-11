package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Utility.Webgenericutility;



public class NopCommerce_ShoppingCart {
	
	WebDriver driver;

	public NopCommerce_ShoppingCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
	
	@FindBy(xpath="//h2[@class='product-title']//a[contains(text(),'HTC One Mini Blue')]")
	public static WebElement citemText3;
	
	
	
	@FindBy(xpath="//h2[@class='product-title']//a[contains(text(),'HTC One M8 Android L 5.0 Lollipop')]")
	public static WebElement citemText4;
	
	@FindBy(xpath="//a[@class='product-name'][contains(text(),'Vintage Style Engagement Ring')]")
	public static WebElement jitemText2;
	
	@FindBy(xpath ="//tr[@class='order-subtotal']//td[@class='cart-total-right']")
	public static WebElement subTotal;
	

	@FindBy(xpath ="//div[@class='table-wrapper']/table/tbody/tr[3]/td[6]/input")
	public static WebElement updateCountTxt;
	
	@FindBy(name ="updatecart")
	public static WebElement updateCartbutton;
	
	
	@FindBy(id ="checkout")
	public static WebElement checkoutButton;
	
	@FindBy(xpath ="//button[@class='ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close']")
	public static WebElement closeTermspopup;
	
	
	@FindBy(id ="termsofservice")
	public static WebElement acceptCheckbox;
	
	
	public String getSubTotal()
	{
		return Webgenericutility.getText(subTotal, 3000);	
	}
	
	public String getItem1Text()
	{
		return Webgenericutility.getText(citemText3, 3000);
	}
	
	public String getItem2Text()
	{
		return Webgenericutility.getText(citemText4, 3000);
	}
	

	public String getItem3Text()
	{
		return subTotal.getText();
	}
	
	public void updateJewelleryCount(String value)
	{
		updateCountTxt.clear();
		updateCountTxt.sendKeys(value);
		
	}
	
	public void clickUpdateShoppingCart()
	{
		Webgenericutility.clickOn(updateCartbutton, 1000);
		
	}
	
	public void clickCheckOutBtn()
	{
		Webgenericutility.clickOn(checkoutButton, 1000);
	}
	public void closePopUp()
	{
		
		Webgenericutility.clickOn(closeTermspopup, 1000);
		
	}
	
	public void acceptTerms()
	{	
		
		Webgenericutility.clickOn(acceptCheckbox, 1000);
		
	}
	
}
