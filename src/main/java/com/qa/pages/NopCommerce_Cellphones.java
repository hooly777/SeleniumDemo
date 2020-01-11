package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Utility.Webgenericutility;


public class NopCommerce_Cellphones {


	public String citemText1_exp = "HTC One Mini Blue";
	public String citemText2_exp = "HTC One M8 Android L 5.0 Lollipop";

	
	@FindBy(id="products-orderby")
	private WebElement sortDropdown;
	
	@FindBy(xpath = "//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
	private WebElement caddcart_1;
	
	@FindBy(xpath = "//div[@class='page-body']//div[2]//div[1]//div[2]//div[3]//div[2]//input[1]")
	private WebElement caddcart_2;
	
	@FindBy(xpath="//h2[@class='product-title']//a[contains(text(),'HTC One Mini Blue')]")
	private WebElement citemText1;
	
	@FindBy(xpath="//h2[@class='product-title']//a[contains(text(),'HTC One M8 Android L 5.0 Lollipop')]")
	private WebElement citemText2;
	
	@FindBy(xpath="//li[@class='inactive']//a[contains(text(),'Jewelry')]")
	private WebElement jewelry;
	

public WebDriver driver;

public NopCommerce_Cellphones(WebDriver driver){

this.driver=driver;

	//This initElements method will create all WebElements

	PageFactory.initElements(driver, this);

}

	Webgenericutility web_util = new Webgenericutility();

public void sort_dropdown_L2H() throws InterruptedException{
	
	//new WebDriverWait(driver, 3000).Until(ExpectedConditions.ElementIsVisible((By.Id("ctl00_ContentPlaceHolder1_drp85"))));

	
	Select s=new Select(sortDropdown);
	s.selectByIndex(3);
	Thread.sleep(3000);

	//Webgenericutility.selectDropdownByText(sortDropdown, "Price: Low to High", 10);
	
		
}

public void addToCart1() throws InterruptedException{
	
	//web_util.waitUntilElemLocated(caddcart_1);
	Webgenericutility.clickOn(caddcart_1, 1000);
	Thread.sleep(3000);
		
}

public void addToCart2() throws InterruptedException{
	

	//web_util.waitUntilElemLocated(caddcart_2);
	Webgenericutility.clickOn(caddcart_2,3000);
	Thread.sleep(3000);
		
}

public void jewellry_click(){


	//web_util.waitUntilElemLocated(jewelry);
	Webgenericutility.clickOn(jewelry, 3000);
	
}

}
