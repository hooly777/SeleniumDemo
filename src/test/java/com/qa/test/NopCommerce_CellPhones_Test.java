package com.qa.test;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.NopCommerce_CartPage;
import com.qa.pages.NopCommerce_CellPhones_Page;
import com.qa.pages.nopCommercePage;
import com.qa.pages.NopCommerce_Jewelry_Page;
import com.qa.pages.LoginPage;
import com.qa.basetest.BaseTest;


public class NopCommerce_CellPhones_Test  extends  BaseTest{


	public nopCommercePage n1;
	public NopCommerce_CellPhones_Page p1;
	Logger log = Logger.getLogger("devpinoyLogger");
	public NopCommerce_Jewelry_Page jewellerypage;
	public NopCommerce_CartPage cart;




	@Test(priority=1)

	public void verifyCellphoneAddtoCart() throws InterruptedException{


		n1=new nopCommercePage();
		n1.clickCellphone();

		//validation of adding cell phones to cart
		p1=new NopCommerce_CellPhones_Page();
		Thread.sleep(2000);
		p1.clickAddtoCart();

	}

	@Test(priority=2)

	public void verifyAddtoCartJewellery() throws InterruptedException{

		jewellerypage=new NopCommerce_Jewelry_Page();
		Thread.sleep(2000);
		jewellerypage.Jewelry_AddToCarts();
	}

	
	@Test(priority=3)

	public void verifyUpdatecart() throws InterruptedException{

		 cart=new NopCommerce_CartPage();
		
		cart.clickOnShoppingCart();
		Thread.sleep(2000);
		cart.updateJewelryCart();
		cart.verifySubTotal();
	}



}