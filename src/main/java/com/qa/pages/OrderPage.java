package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.basetest.BaseTest;

public class OrderPage extends BaseTest{

	public Select select;
	public Actions action;
	public WebDriverWait wait;

		@FindBy(xpath= "//input[@class='button-1 checkout-as-guest-button']")
		private WebElement guestBtn;
		
		
		public void clickOnGeust()
		{
			guestBtn.click();
		}
		public OrderPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		@Test
		public void PlaceOrderAsGuest() throws InterruptedException
		{
			OrderPage oPage = new OrderPage();
			Thread.sleep(3000);
			oPage.clickOnGeust();
			//Thread.sleep(50000);
			
		}

}
