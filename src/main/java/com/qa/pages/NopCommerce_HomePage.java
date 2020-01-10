package com.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class NopCommerce_HomePage extends BaseTest {
	
	
	
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[text()='Electronics ']")
	WebElement electronics;
	
	//@FindBy(xpath="//ul[@class='sublist']//a[@href='/cell-phones']​")
	@FindBy(xpath="//ul//a[contains(text(),'Cell phones')]")
	WebElement cellPhones;
	
	public NopCommerce_HomePage (){
		PageFactory.initElements(driver, this);
	}
	
	public void clickCellphonelink() throws InterruptedException{
     
	Webgenericutility.mousehover(electronics);
		Thread.sleep(4000);
		cellPhones.click();
		String expTitle = "nopCommerce demo store. Cell phones";
		String actTilte = driver.getTitle();
		System.out.println("current page title: " +actTilte);
		Assert.assertEquals(actTilte, expTitle);
		}

	

}
