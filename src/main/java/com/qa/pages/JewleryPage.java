package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.basetest.BaseTest;


public class JewleryPage extends BaseTest{
	public Select select;
	
	JewleryPage jpage;
	Actions action;
	@FindBy(xpath="//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
	private WebElement highestProduct1;

	@FindBy(xpath="//div[@class='page-body']//div[2]//div[1]//div[2]//div[3]//div[2]//input[1]")
	private WebElement highestProduct2;
	@FindBy(id= "products-orderby")
	private WebElement selectHigher;
	
	@FindBy(xpath="//div[@class='bar-notification success']")
	private WebElement notification;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")
	private WebElement jewwlsLink;
	
		
	public boolean notificationDetails()
	{
		boolean cartMessageStatus = notification.isDisplayed();
		return cartMessageStatus;
	}
	
	@FindBy(xpath="//span[@class='close']")
	private WebElement CloseNotification;
	public void closeNotification() throws InterruptedException
	{
		CloseNotification.click();
		Thread.sleep(5000);
	}
	public String notificationMessageDetails() throws InterruptedException
	{
		String cartMessagTxt = notification.getText();
		closeNotification();
		return cartMessagTxt;
	}
	
	public void updateCart(WebElement element) throws InterruptedException
	{
		element.sendKeys("1");
		Thread.sleep(3000);
	}
	public JewleryPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void setProductListToHighToLow() throws InterruptedException
	{
		select = new Select(selectHigher);
		select.selectByVisibleText("Price: High to Low");
		System.out.println("Set product High to Low..");
		Thread.sleep(5000);
	}
	
	public void clickOnJewels() throws InterruptedException
	{
		Thread.sleep(2000);
		jewwlsLink.click();
	}
	public void AddToCart() throws InterruptedException
	{
		highestProduct1.click();
		System.out.println("Higer Price 1 added to cart..");
		Thread.sleep(3000);
		//highestProduct2.click();
		//System.out.println("Higer Price 2 added to cart..");
	}
	
	
	@Test
	public void ClickOnJewelsAndAddtoCart() throws InterruptedException
	{
		try {
			String actualNotification,expectedNotification;
			jpage = new JewleryPage();
			jpage.clickOnJewels();
			jpage.setProductListToHighToLow();
			jpage.AddToCart();
			//Thread.sleep(2000);
			boolean cartStatus = jpage.notificationDetails();
			if(cartStatus)
			{
				expectedNotification = "The product has been added to your shopping cart";
				actualNotification = jpage.notificationMessageDetails();
				Assert.assertEquals(actualNotification, expectedNotification);
			}
			System.out.println("Jewlery Test Completed");
			
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		 
	}
	
	
}
