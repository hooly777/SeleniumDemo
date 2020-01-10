package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.basetest.BaseTest;

public class CartPage extends BaseTest
{
	
public Select select;
public Actions action;
public WebDriverWait wait;

	@FindBy(xpath= "//li[@id='topcartlink']")
	private WebElement shoppingCart;

	@FindBy(xpath="//input[@class='button-1 cart-button']")
	private WebElement goTocart;
	
	@FindBy(xpath="//tr[@class='order-subtotal']//td[@class='cart-total-right']")
	private WebElement subTotalValue;
	
	@FindBy(xpath="//tr[@class='order-total']//span[@class='value-summary']")
	private WebElement totalValue;
	
	public void getSubTotalAndTotalAndValidate()
	{
		String subtotalAmt= subTotalValue.getText();
		String tbtotalAmt= totalValue.getText();
		Assert.assertEquals(subtotalAmt, tbtotalAmt);
		System.out.println("Total and subtotal validated..");
				
	}
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='table-wrapper']//tr[3]//td[6]//input[@class='qty-input']")
	private WebElement  updateCartValue;
	
	@FindBy(xpath="//input[@name='updatecart']")
	private WebElement cartBtn;
	
	@FindBy(xpath="//input[@id='termsofservice']")
	private WebElement termsAndCondtionBtn;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkOut;
	
	public void checkOutCart() throws InterruptedException
	{
		termsAndCondtionBtn.click();
		checkOut.click();
		Thread.sleep(3000);
	}
	public void updateCart() throws InterruptedException
	{
		System.out.println( updateCartValue.getText());
		updateCartValue.clear();
		updateCartValue.sendKeys("2");
		//input[starts-with(@name,â€™btnâ€™)]â€�)
		cartBtn.click();
		Thread.sleep(3000);
			
    }
	
	
	public void clickOnShoppingCart() throws InterruptedException
	{
		
		action = new Actions(driver);
		wait = new WebDriverWait(driver,30);
		System.out.println(shoppingCart);
		action.moveToElement(shoppingCart).perform();
		//action.moveToElement(goTocart).perform();
		goTocart.click();
		
	}
	

	@Test
	public void cartValidationTest() throws InterruptedException
	{ 
		CartPage cPage = new CartPage();
		cPage.clickOnShoppingCart();
		cPage.getSubTotalAndTotalAndValidate();
		cPage.updateCart();
		cPage.checkOutCart();
		
	}
	
}
