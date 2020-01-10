package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class NopCommerceElectronics_Page extends BaseTest {

	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[text()='Electronics ']")
	WebElement electronics;

	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[contains(text(),'Cell phones')]")
	WebElement cellPhones;

	public NopCommerceElectronics_Page (){
		PageFactory.initElements(driver, this);
	}

	// Clicking on Electronics and CellPhone link
	public void clickCellPhoneLink() throws InterruptedException{

		Webgenericutility.mouseOver(electronics);
		cellPhones.click();
		String expTitle = "nopCommerce demo store. Cell phones";
		String actTilte = driver.getTitle();
		System.out.println("current page title: " +actTilte);
		//validating the title of cellphone page
		Assert.assertEquals(actTilte, expTitle);

	}



}