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

public class NopCommerceJwelleryPage{
	
	static WebDriver driver;
	public NopCommerceJwelleryPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(xpath="//div[@class='page-title']/h1[text()='Jewelry']") WebElement pageHeader;
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")WebElement btnAddToCartfirst;
	@FindBy(xpath="//div[@class='bar-notification success']/p[text()='The product has been added to your ']")WebElement successNotification;
	@FindBy(xpath="//span[text()='Shopping cart']")WebElement lnkShoppingCart;
	@FindBy(xpath="//input[@class='button-1 cart-button']")WebElement btnGoToCart;
	@FindBy(xpath="//span[@title='Close']")WebElement btnCloseNotification;

	public void isPageDisplayed()
	{
		if(pageHeader.isDisplayed())
		{
			Reporter.log("NopCommerce cellphone page is displayed",true);
		}
		else
			Reporter.log("NopCommerce cellphone page is not displayed",false);
	
	}
	
	public void sortJwelleryByPrice()
	{
	Select sortHighToLow=new Select(driver.findElement(By.name("products-orderby")));
	sortHighToLow.selectByVisibleText("Price: High to Low");
	
	}
	public void addToCartHighestPriceJwellery() throws InterruptedException
	{
		btnAddToCartfirst.click();
		Reporter.log("Hihest price jwellery is added to cart",true);
		Thread.sleep(2000);
		
	}
	public void verifySuccessNotification()
	{
		if(successNotification.isDisplayed())
		{
			Reporter.log("The product has been added to your shopping cart  message is displayed after clicking on ADD TO CART button",true);
		}
		else
			Reporter.log("The product has been added to your shopping cart  message is displayed after clicking on ADD TO CART button",false);
		btnCloseNotification.click();
	}
	public void goToCart() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(lnkShoppingCart).perform();
		Thread.sleep(2000);
		btnGoToCart.click();
		Reporter.log("Go to cart button has been clicked",true);
	
	}
	public static String addedJweleryItem()
	{
		String JweleryStringAdded=driver.findElement(By.xpath("//h2[@class='product-title']/a")).getText();
		return JweleryStringAdded;
	}
	
}

