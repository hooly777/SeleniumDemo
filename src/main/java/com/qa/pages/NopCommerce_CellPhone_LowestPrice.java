package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class NopCommerce_CellPhone_LowestPrice extends BaseTest {

	//sortby xpath

	@FindBy(id ="products-orderby")
	WebElement sortby;

	//lowest cell phones price

	@FindBy(xpath="(//span[@class='price actual-price'])[position()=1]")
	WebElement cellphonelowpric1;

	@FindBy(xpath="(//span[@class='price actual-price'])[position()=2]")
	WebElement cellphonelowpric2;

	//lowest cell phones names

	@FindBy(xpath="(//h2[@class='product-title'])[position()=1]//a")
	WebElement cellphonelowname1;

	@FindBy(xpath="(//h2[@class='product-title'])[position()=2]//a")
	WebElement cellphonelowname2;

	//Adding lowest price cell-phones to cart

	@FindBy(xpath="(//div[@class='item-grid'][1]//div[@class='buttons'][1]//input[@value='Add to cart'])[position()=1]")
	WebElement cellphoneaddtocart1;

	@FindBy(xpath="(//div[@class='item-grid'][1]//div[@class='buttons'][1]//input[@value='Add to cart'])[position()=2]")
	WebElement cellphoneaddtocart2;

	public NopCommerce_CellPhone_LowestPrice (){
		PageFactory.initElements(driver, this);
	}

	public void CellPhone_AddToCarts() throws InterruptedException{

		Webgenericutility.selectByvisibletext(sortby, "Price: Low to High");
		cellphoneaddtocart1.click();
		Thread.sleep(2000);
		cellphoneaddtocart2.click();

	}

	public void getCellPhoneDetails(){
		
		String celph1=cellphonelowname1.getText();
		System.out.println(celph1);
		String celph2=cellphonelowname2.getText();
		System.out.println(celph2);
		

		
	}










}
