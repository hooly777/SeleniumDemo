package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class NoCellPhonePage extends BaseTest {
	
	Webgenericutility webutility= new Webgenericutility();
	
	public NoCellPhonePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//cell phone to selected 
	@FindBy(xpath="//span[@class='price actual-price'])[last()]")
	WebElement cellphoneprice1;
	
	@FindBy(xpath="//span[@class='price actual-price'])[last()-1]")
	WebElement cellphoneprice2;
	
	//cell phone to selected 
	@FindBy(xpath="(//h2[@class='product-title'])[last()]//a")
	WebElement cellphonename1;
	
	@FindBy(xpath="(//h2[@class='product-title'])[last()-1]//a")
	WebElement cellphonename2;
	
	@FindBy(id="products-orderby") 
	WebElement SortElement;
	
	//add cell phone to cart
	@FindBy(xpath="//div[@class='item-grid'][1]//div[@class='buttons'][1]//input[@value='Add to cart'])[last()]")
	WebElement ProdClick1;

	@FindBy(xpath="//div[@class='item-grid'][2]//div[@class='buttons'][2]//input[@value='Add to cart'])[last()-1]")
	WebElement ProdClick2;
	
	  public void ProdClick1(){
	
		  ProdClick1.click();
	
		} 
	  public void ProdClick2(){
	
			ProdClick2.click();
	
	    }

	  
	  public void CellPhoneAddToCart() throws IOException, InterruptedException{
		  Webgenericutility.selectDropdownByValue(SortElement,"https://demo.nopcommerce.com/cell-phones?orderby=10", 0);
		 
		  ProdClick1.click();
		  Thread.sleep(3000);
		  ProdClick2.click();
		 
		  
		// driver.navigate().to("https://demo.nopcommerce.com/cart");
		//  String selElement=driver.findElement(By.xpath("//h1[contains(text(),'Shopping cart')]")).getText();
		  
	  }
	
}
