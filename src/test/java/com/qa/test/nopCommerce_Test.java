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
import com.qa.pages.nopCommercePage;
import com.qa.pages.LoginPage;
import com.qa.basetest.BaseTest;


public class nopCommerce_Test  extends  BaseTest{

	
	 public nopCommercePage n1;
	 Logger log = Logger.getLogger("devpinoyLogger");	 
	 
	 
	@Test
	public void verifyClickCellphone() throws IOException
	{
		
		
		n1=new nopCommercePage();
		n1.clickCellphone();
		String exptedTitle = "nopCommerce demo store. Cell phones";
        String actualTilte = driver.getTitle();
        System.out.println("current page title: " +actualTilte);
        Assert.assertEquals(actualTilte, exptedTitle);


		// element.click();
		
		
		
	}

		

}