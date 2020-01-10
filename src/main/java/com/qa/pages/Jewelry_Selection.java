package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.qa.basetest.BaseTest;

public class Jewelry_Selection extends BaseTest {

	Select select;
	Actions action;
	Jewelry_Selection jpage;
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")
 	private WebElement jewellery;
	
	@FindBy(id="products-orderby")
	private WebElement sort;
	
	@FindBy(xpath="//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
	private WebElement highestpricejewelry;
	
	@FindBy(xpath="//div[@class='bar-notification success']")
	private WebElement notification;
	
	@FindBy(xpath="//span[@class='close']")
	private WebElement CloseNotification;;
	
	@FindBy(xpath = "//div[@class='bar-notification success']/p[text()='The product has been added to your ']")
	 WebElement barnotification;
	
	public void closeNotification() throws InterruptedException
	{
		CloseNotification.click();
		Thread.sleep(3000);
	}
	
	

	
	public String notificationMessageDetails() throws InterruptedException{
		
		String cartMessagTxt = notification.getText();
		closeNotification();
		return cartMessagTxt;		
		}
	
	
	public boolean notificationDetails() throws InterruptedException {
		Thread.sleep(1000);
		boolean cartMessageStatus=notification.isDisplayed();
		return cartMessageStatus;
	}
	
	public Jewelry_Selection(){
		//This initElements method will create all WebElements
 		PageFactory.initElements(driver, this);

	}
	
	public void JewelryClick() throws InterruptedException {
		
	Thread.sleep(4000);
		jewellery.click();	
		Thread.sleep(4000);
		
			}
	
	public void SelectHighestPriceJewelry() throws InterruptedException {
		sort.click();
		Thread.sleep(2000);
		select = new Select(sort);
		Thread.sleep(3000);
		select.selectByVisibleText("Price: High to Low");
		Thread.sleep(3000);
	}
	
	
	public void AddToCart() throws InterruptedException {
		highestpricejewelry.click();
		Thread.sleep(3000);
		
	}
		
	
	public void ClickOnJewelsAndAddtoCart() throws InterruptedException {
	
	String actualNotification,expectedNotification;
	jpage = new Jewelry_Selection();
	Thread.sleep(3000);
	jpage.JewelryClick();
	jpage.SelectHighestPriceJewelry();
	jpage.AddToCart();
	Thread.sleep(3000);
		
	
	}
}