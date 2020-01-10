package com.qa.pages;

import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

import Trash.ReadExcel;

import org.apache.log4j.Logger;

public class SignIn_Page extends BaseTest {	

	Logger log = Logger.getLogger("devpinoyLogger");

	@FindBy(xpath="//input[@class='button-1 checkout-as-guest-button']")

	WebElement SignIn;




	public SignIn_Page(){

		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);

	}

	//clicks on the Checkoutasguest button and verify that it is navigating to check out page
	public void clickCheckOutasGuest() throws Exception{

		SignIn.click();
		Thread.sleep(1000);
		String exptedTitle = "nopCommerce demo store. Checkout";
		String actualTilte = driver.getTitle();
		System.out.println("current page title: " +actualTilte);
		Assert.assertEquals(actualTilte, exptedTitle);




	}		

}


