package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.qa.Utility.Webgenericutility;



public class NopCommerce_Jewelry {
	
	public WebDriver driver;
	public NopCommerce_Jewelry(WebDriver driver){
		this.driver=driver;
		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@id='products-orderby']")
	private WebElement sortDropdown_1;
	
	@FindBy(xpath="//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
	private WebElement jaddTocart;
	
	@FindBy(xpath="//p[@class='content']")
	private WebElement cartContent;
	
	@FindBy(xpath="//span[@class='close']")
	private WebElement cartContentclose;
	
	@FindBy(xpath="//span[@class='cart-label']")
	private WebElement addtoCartlabel;
	
	@FindBy(xpath="//input[@class='button-1 cart-button']")
	private WebElement goToCartButton;
	
	@FindBy(xpath="//a[@class='product-name'][contains(text(),'Vintage Style Engagement Ring')]")
	private WebElement jitemText2;
	
	
	public void JewelryHighestPrice() throws InterruptedException
	{
		Thread.sleep(3000);
		//Webgenericutility.selectDropdownByValue(sortDropdown_1, "Price: High to Low", 10);
		

		Select s=new Select(sortDropdown_1);
		s.selectByVisibleText("Price: High to Low");
		Thread.sleep(3000);

	}
	
	public void JewelryAddToCart()
	{
		Webgenericutility.clickOn(jaddTocart, 10);
	}
	
	public void VerifyJewelryCartContent(String msg)
	{
		SoftAssert sf=new SoftAssert();
		
		sf.assertEquals(cartContent.getText(), msg);
	}
	
	public void JewelryCartContentClose()
	{
		Webgenericutility.clickOn(cartContentclose, 10);
	}
	
	public void JewelryMouseHoverShoppingCart()
	{
		Actions a= new Actions(driver);
		a.moveToElement(addtoCartlabel);
		a.build().perform();
	
		goToCartButton.click();
	}
	
	public void JewelryShoppingCart()
	{
		System.out.println(jitemText2.getText());
	}
	
}
