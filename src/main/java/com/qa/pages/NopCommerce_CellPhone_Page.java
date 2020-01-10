package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class NopCommerce_CellPhone_Page extends BaseTest {

	//sortby xpath
	@FindBy(id ="products-orderby")
	WebElement sortby;

	//Adding lowest price cell-phones to cart
	@FindBy(xpath="(//div[@class='item-grid'][1]//div[@class='buttons'][1]//input[@value='Add to cart'])[position()=1]")
	WebElement cellphoneaddtocart1;

	@FindBy(xpath="(//div[@class='item-grid'][1]//div[@class='buttons'][1]//input[@value='Add to cart'])[position()=2]")
	WebElement cellphoneaddtocart2;

	public NopCommerce_CellPhone_Page()
	{
		PageFactory.initElements(driver, this);
	}

	// Adding 2 Lowest price Cell Phone
	public void CellPhone_AddToCarts() throws InterruptedException{
		// Selecting Low to High dropdown
		Webgenericutility.selectByVissibletext(sortby, "Price: Low to High");

		// Adding cell phone
		cellphoneaddtocart1.click();
		Thread.sleep(2000);
		cellphoneaddtocart2.click();
		Thread.sleep(2000);

	}

}