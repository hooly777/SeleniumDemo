package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.basetest.BaseTest;

public class HomePage  extends BaseTest{
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	Actions action ;
	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
	private WebElement electronicsMenu;

	@FindBy(xpath="//ul[@class='top-menu notmobile']//a[contains(text(),'Cell phones')]")
	private WebElement cellPhoneSubMenu;
	
	public void clickOnCellPhoneSubMenu()
	{
	    action = new Actions(driver);
		action.moveToElement(electronicsMenu).perform();
		action.moveToElement(cellPhoneSubMenu).perform();
		cellPhoneSubMenu.click();
		
	}
	
	@Test
	public void ClickOnElectronicMenu() throws InterruptedException
	{
		HomePage hm = new HomePage();
		//Howering on Electronics page and clicking on cell phones 
		hm.clickOnCellPhoneSubMenu();
		System.out.println("Clikked on Cell phone link");
		Thread.sleep(2000);
	}
	
	
}
