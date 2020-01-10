package com.qa.test;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;
import com.qa.pages.AddToCart;
import com.qa.pages.GuestLoginPage;
import com.qa.pages.NoCellPhonePage;
import com.qa.pages.NoElectronicPage;

import com.qa.pages.NopJewelery;

public class NoCommMainTest extends BaseTest{
	WebDriver driver;
	Webgenericutility webutility=new Webgenericutility();
	

	  @Test(priority=1)
	  public void ValidateElectronicSectionPage() throws IOException {
		  
		  NoElectronicPage CommerceHome=new NoElectronicPage(driver);
		  Webgenericutility webutility= new Webgenericutility();
		//  CommerceHome.getHomePageTitle();
		  CommerceHome.SelectElectronic();
	  }
		  
	  @Test(priority=2)
	  public void ValidateCellPhoneAddToCartPage() throws IOException, InterruptedException {
		  
		  NoCellPhonePage CellHome=new NoCellPhonePage(driver);
		  Webgenericutility webutility= new Webgenericutility();
		  CellHome.CellPhoneAddToCart();
	  }
	  @Test(priority=3)
	  public void ValidateJewelryAddToCartPage() throws IOException, InterruptedException {
		  
		  NopJewelery jewelHome=new NopJewelery(driver);
		  Webgenericutility webutility= new Webgenericutility();
		  jewelHome.JewelryAddToCart();
		  driver.navigate().to("https://demo.nopcommerce.com/cart");
	  }
	  
	  @Test(priority=4)
	  public void ValidateAddToCartPage() throws IOException, InterruptedException {
		  
		  AddToCart cartHome=new AddToCart(driver);
		  Webgenericutility webutility= new Webgenericutility();
		  cartHome.updateCountUpdateAddtoCart();
		  Thread.sleep(3000);
		  cartHome.ClickButtonsAddtoCart();
	  }
	  @Test(priority=5)
	  public void ValidateGuestLoginPage() throws IOException, InterruptedException {
		  
		  GuestLoginPage Guestpage=new GuestLoginPage(driver);
		  Webgenericutility webutility= new Webgenericutility();
		}
	}
