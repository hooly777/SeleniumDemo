package com.qa.pages;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.log4testng.Logger;

import com.qa.Utility.ExcellUtility;
import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class Shoppingcart extends BaseTest {
	Webgenericutility webTestUtil= new Webgenericutility();
	ExcellUtility excellUtility = new ExcellUtility();
	private final static Logger log = Logger.getLogger(Shoppingcart.class);
	
		public Shoppingcart(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//li[@id='topcartlink']")
	WebElement Shoppingcart;
	@FindBy(xpath = "//*[@class='qty-input'][1]")
	WebElement itemquantity;
	@FindBy(xpath = "//*[@name='removefromcart']")
	WebElement removefromcart;	
	@FindBy(xpath = "//input[@value='Update shopping cart']")
	WebElement UpdateCart;
	@FindBy(xpath =  "//*[@id='termsofservice']")
	WebElement termsofservice;	
	@FindBy(xpath =  "//*[@id='checkout']")
	WebElement checkout;	
	@FindBy(xpath = "//*[@value='Checkout as Guest']")
	WebElement CheckoutAsGuest;
	@FindBy(xpath = "//*[@title='Continue']")
	WebElement Continue;
	
	
	
	  public  void NavigateToShoppingCart()
	  {
		  waitForLoad(driver);
		  Shoppingcart.click();		
	   }
	 public void UpdateingShoppingCart(String itemquantitys ) throws InterruptedException {
		 Thread.sleep(1000);
		 itemquantity.clear();
		 itemquantity.sendKeys(itemquantitys);
		 UpdateCart.click();	
	} 
	 public void Validatingprice() 
		{
			float SumProductPrince = 0;
			List<WebElement> price = driver.findElements(By.xpath("//td[@class='subtotal']/span[@class='product-subtotal']"));	
			
			for (int i = 0; i < price.size(); i++) {			
				String ProductnamePrice = price.get(i).getText().toString();			
				System.out.println(ProductnamePrice);
				String ProductPrince = ProductnamePrice.substring(1);				
				System.out.println(ProductPrince);
//				int Price = Integer.parseInt(ProductPrince);	
				float Price = Float.valueOf(ProductPrince);
				 SumProductPrince = SumProductPrince+Price;			 	
			}
			System.out.println(SumProductPrince);
			String SubTotal = driver.findElement(By.xpath("//tr[@class='order-subtotal']/td[@class='cart-total-right']/span")).getText();
			String SubTotalPrince = SubTotal.substring(1);
			int STPrice = Integer.parseInt(SubTotalPrince);	
			Assert.assertEquals(SumProductPrince, STPrice);		
		}
	
	public void checkout() {
		termsofservice.click();
		checkout.click();		
	}

	public void CheckoutAsGuests() {
		CheckoutAsGuest.click();		
	}
	
}
