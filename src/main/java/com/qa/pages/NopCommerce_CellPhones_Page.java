package com.qa.pages;

import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

import Trash.ReadExcel;

import org.apache.log4j.Logger;

public class NopCommerce_CellPhones_Page extends BaseTest {	

	Logger log = Logger.getLogger("devpinoyLogger");

	@FindBy(id="products-orderby")

	WebElement sortbydropdown;


	@FindBy(xpath="(//span[@class='price actual-price'])[position()=1]")
	WebElement cellphoneprice1;

	@FindBy(xpath="(//span[@class='price actual-price'])[position()=2]​")
	WebElement cellphoneprice2;

	@FindBy(xpath="​(//h2[@class='product-title'])[position()=1]//a")
	WebElement cellphonename1;


	@FindBy(xpath="​(//h2[@class='product-title'])[position()=2]//a")
	WebElement cellphonename2;

	
	
	@FindBy(xpath="(//div[@class='item-grid'][1]//div[@class='buttons'][1]//input[@value='Add to cart'])[position()=1]")
	 
	WebElement cellphoneaddtocart1;





	@FindBy(xpath="(//div[@class='item-grid'][1]//div[@class='buttons'][1]//input[@value='Add to cart'])[position()=2]")

	WebElement cellphoneaddtocart2;

	public NopCommerce_CellPhones_Page(){

		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);

	}

  //this function adds the lowest prize phones to cart
	public void clickAddtoCart() throws InterruptedException{
		
		
		Webgenericutility.selectByVissibletext(sortbydropdown, "Price: Low to High");
		
		cellphoneaddtocart1.click();
        Thread.sleep(1000);
        cellphoneaddtocart2.click();


	}		

}


