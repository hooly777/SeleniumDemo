package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;


public class NopCommerce_Jewelry_Page extends BaseTest {

	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")
	WebElement jewelry;
	
	//sortby xpath
	@FindBy(id ="products-orderby")
	WebElement sortby;

	//lowest cell phones price
	@FindBy(xpath="(//span[@class='price actual-price'])[position()=1]")
	WebElement jewelrylowpric1;

	//lowest cell phones names
	@FindBy(xpath="(//h2[@class='product-title'])[position()=1]//a")
	WebElement jewelrylowname1;

	//Adding lowest price cell-phones to cart
	@FindBy(xpath="(//div[@class='item-grid'][1]//div[@class='buttons'][1]//input[@value='Add to cart'])[position()=1]")
	WebElement jewelryaddtocart;

	@FindBy(xpath="//div[@class='bar-notification success']")
	WebElement notificationcontent;

	public NopCommerce_Jewelry_Page()
	{
		PageFactory.initElements(driver, this);
	}

	public void Jewelry_AddToCarts() throws InterruptedException{
		String expectedNotification,actualNotification;
		Thread.sleep(5000);
		jewelry.click();
		Webgenericutility.selectByVissibletext(sortby, "Price: High to Low");
		jewelryaddtocart.click();
		Thread.sleep(2000);
		try{
		expectedNotification = "The product has been added to your shopping cart";
		actualNotification = notificationcontent.getText();
		Assert.assertEquals(actualNotification, expectedNotification);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}