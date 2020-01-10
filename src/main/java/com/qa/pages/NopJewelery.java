package com.qa.pages;

import org.testng.annotations.Test;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NopJewelery extends BaseTest{
Webgenericutility webutility= new Webgenericutility();
	
	public NopJewelery(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")
	WebElement jewelry1;
	@FindBy(id ="products-orderby")
	WebElement sortJewel;
	@FindBy(xpath="(//span[@class='price actual-price'])[last()]")
	WebElement cellphonelow;
	@FindBy(xpath="(//h2[@class='product-title'])[last()]//a")
	WebElement cellphonename;
	@FindBy(xpath="(//div[@class='item-grid'][1]//div[@class='buttons'][1]//input[@value='Add to cart'])[last()]")
	WebElement jewelryaddtocart;
	@FindBy(xpath="//div[@class='bar-notification success']")
	WebElement jewelry;
	WebElement notificationcontent;
	
@Test
public void JewelryAddToCart() throws InterruptedException{
	String expectedNotification,actualNotification;
	Thread.sleep(3000);
    jewelry1.click();
    jewelryaddtocart.click();
    Thread.sleep(3000);
	  try{
    
		  expectedNotification =  "The product has been added to your shopping cart";
		  actualNotification=notificationcontent.getText();
		  Assert.assertEquals(actualNotification, expectedNotification);
	  }
	  catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
	 
}
}