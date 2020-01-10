package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.basetest.BaseTest;

public class CellphonePage extends BaseTest {
//Constructor
	public CellphonePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//WebElement of Selecting Phone by Lowest to Highest price
	@FindBy(xpath="//select[@id='products-orderby']")
	WebElement LowestCellphoneLink;
	public WebElement LowestCellphoneElement(){
		return LowestCellphoneLink;
	}
	
	
	//Webelement for AddToCart1 Button
	@FindBy(xpath="//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
	WebElement AddToCartFirstButton;
	public WebElement AddToCartFirstElement(){
		return AddToCartFirstButton;
	}

	//Webelement for AddToCart2 Button
	@FindBy(xpath="//div[@class='page-body']//div[2]//div[1]//div[2]//div[3]//div[2]//input[1]")
	WebElement AddToCartSecondButton;
	public WebElement AddToCartSecondElement(){
		return AddToCartSecondButton;
	}
	
	//Webelement for Jewelry
		@FindBy(xpath="//ul[@class='top-menu notmobile']/li[6]/a")
		WebElement JewelryTab;
		public WebElement JewelryElement(){
			return JewelryTab;
		}
	
	//
	public void SortPhoneByPrice(){
		Select SortPhone = new Select(LowestCellphoneLink);
		SortPhone.selectByVisibleText("Price: Low to High");
				
	}
	
}
