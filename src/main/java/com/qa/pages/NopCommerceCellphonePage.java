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

public class NopCommerceCellphonePage{
	
	static WebDriver driver;
	public NopCommerceCellphonePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(xpath="//div[@class='page-title']/h1[text()='Cell phones']") WebElement pageHeader;
	@FindBy(xpath="//ul[@class='sublist first-level']/li/a[text()='Cell phones ']") WebElement lnkCellphone;
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")WebElement btnAddToCartfirst;
	@FindBy(xpath="(//input[@value='Add to cart'])[2]")WebElement btnAddToCartsecond;
	@FindBy(xpath="//li[@class='inactive']/a[text()='Jewelry ']")WebElement lnkJwellery;
	@FindBy(xpath="//div[@class='bar-notification success']/p[text()='The product has been added to your ']")WebElement successNotification;
	@FindBy(xpath="(//h2[@class='product-title'])[1]")WebElement firstProductToAdd;
	@FindBy(xpath="(//h2[@class='product-title'])[2]")WebElement secondProductToAdd;
	//String ProductName=firstProductToAdd.getText();
	@FindBy(xpath="//a[text()=ProductName]/../../../div[@class='details']/div[@class='add-info']/div[@class='buttons']/input[@value='Add to cart']")WebElement addToCartPassingElement;

	public void isPageDisplayed()
	{
		if(pageHeader.isDisplayed())
		{
			Reporter.log("NopCommerce cellphone page is displayed",true);
		}
		else
			Reporter.log("NopCommerce cellphone page is not displayed",false);
	
	}
	
	public void sortMobileLowToHigh() throws InterruptedException
	{
		Select sortlowtoHigh=new Select(driver.findElement(By.name("products-orderby")));
		sortlowtoHigh.selectByVisibleText("Price: Low to High");
	}
	public void addToCartLowestTwoCellphones() throws InterruptedException
	{
		btnAddToCartfirst.click();
		Reporter.log("Lowest cell phone is added to cart",true);
		Thread.sleep(2000);
		btnAddToCartsecond.click();
		Reporter.log("Second Lowest cell phone is added to cart",true);
	}
	public void clickOnJwelleryLnk() throws InterruptedException
	{
		lnkJwellery.click();
		Reporter.log("Jwellery link is clicked",true);
		Thread.sleep(2000);

	}
		public static List<WebElement> AddedCellphones()
	{
		List<WebElement> ElementsAdded =  driver.findElements(By.xpath("//h2[@class='product-title']/a"));
		return ElementsAdded;
	
	}
	
	
}

