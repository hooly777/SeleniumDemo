package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import com.hackathon.utility

public class NopCommerceHomePage{
	
	WebDriver driver;
	public NopCommerceHomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(xpath="//img[@alt='nopCommerce demo store']") WebElement pageHeader;
	@FindBy(xpath="//a[text()='Electronics ']") WebElement electronicsTab;
	@FindBy(xpath="//ul[@class='sublist first-level']/li/a[text()='Cell phones ']") WebElement lnkCellphone;
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")WebElement btnAddToCartfirst;
	@FindBy(xpath="(//input[@value='Add to cart'])[2]")WebElement btnAddToCartsecond;


	public void isPageDisplayed()
	{
		if(pageHeader.isDisplayed())
		{
			Reporter.log("NopCommerce home page is displayed",true);
		}
		else
			Reporter.log("NopCommerce home page is not displayed",false);
	
	}
	public void selectMobileUnderElectronics() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(electronicsTab).perform();
		Thread.sleep(2000);
		lnkCellphone.click();
	
	}
	
}

