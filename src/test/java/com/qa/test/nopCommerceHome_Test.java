package com.qa.test;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.basetest.BaseTest;
import com.qa.pages.NopCommerce_HomePage;



public class nopCommerceHome_Test  extends  BaseTest{
	
	 public NopCommerce_HomePage cellPhonePageVerify;
	 Logger log = Logger.getLogger("validating cellphone page");
	 

	@Test
	public void ValidateCellphonePage() throws IOException, InterruptedException
	{
		 //validate the title of cell phone page
		  
		cellPhonePageVerify  = new NopCommerce_HomePage();
		cellPhonePageVerify.clickCellphonelink();
		String expTitle = "nopCommerce demo store. Cell phones";
		String actTilte = driver.getTitle();
		System.out.println("current page title: " +actTilte);
		Assert.assertEquals(actTilte, expTitle);
		

		
	}

	

}