package com.qa.test;

import org.testng.annotations.Test;

import com.qa.basetest.BaseTest;
import com.qa.pages.cartPage;
import com.qa.pages.cellPage;
import com.qa.pages.checkoutPage;
import com.qa.pages.homePage;
import com.qa.pages.jewelleryPage;
import com.qa.pages.signinPage;

public class Nopcommercetest extends BaseTest {
	public homePage homepage;
	public cellPage cellpage;
	public jewelleryPage jwelpage;
	public cartPage cartpage;
	public signinPage signinpage;
	
	public checkoutPage checkoutpage;
	@Test(priority=1)
	public void Test001(){
		homepage=new homePage(driver);
		homepage.Electronics();
		homepage.cellPhones();
		}
	@Test(priority=2)
	public void Test002() throws InterruptedException{
		cellpage =new cellPage(driver);
		cellpage.sortPriceLowToHigh();
		cellpage.addTwoMoblies();
		cellpage.clickOnJewelBtn();
	}
	@Test(priority=3)
	public void Test003() throws InterruptedException{
		jwelpage=new jewelleryPage(driver);
		jwelpage.sortPriceHighToLow();
		jwelpage.addJewel();
		
		//jwelpage.Notification();
		Thread.sleep(7000);
		jwelpage. hovershpngbtn();
	}
	
	@Test(priority=4)
	public void Test004() throws InterruptedException{
		cartpage=new cartPage(driver);
		cartpage.subtotal();
		cartpage.quantity();
		Thread.sleep(5000);
		cartpage.upadtecart();
		cartpage.checkout();
		cartpage.closepopup();
		cartpage.checkbox();
	}
	
	@Test(priority=5)
	public void Test005(){
		signinpage=new signinPage(driver);
		signinpage.checkoutasguest();
	}
	
	@Test(priority=6)
	public void Test006(){
		checkoutpage=new checkoutPage(driver);
		checkoutpage.details();
	}
}


