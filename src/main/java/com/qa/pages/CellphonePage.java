package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CellphonePage {
	
	@FindBy(id="products-orderby")
	public static WebElement sortDropdown;
	
	@FindBy(xpath = "//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
	public static WebElement caddcart_1;
	
	@FindBy(xpath = "//div[@class='page-body']//div[2]//div[1]//div[2]//div[3]//div[2]//input[1]")
	public static WebElement caddcart_2;
	
	@FindBy(xpath="//h2[@class='product-title']//a[contains(text(),'HTC One Mini Blue')]")
	public static WebElement citemText1;
	
	@FindBy(xpath="//h2[@class='product-title']//a[contains(text(),'HTC One M8 Android L 5.0 Lollipop')]")
	public static WebElement citemText2;
	
	@FindBy(xpath="//div[@class='block block-category-navigation']//li[6]")
	public static WebElement jewelry;
	
}



