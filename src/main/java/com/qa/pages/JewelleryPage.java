package com.qa.pages;

	
	
	

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class JewelleryPage {
		
		@FindBy(xpath="//select[@id='products-orderby']")
		public static WebElement sortDropdown_1;
		
		@FindBy(xpath="//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
		public static WebElement jaddTocart;
		
		@FindBy(xpath="//p[@class='content']")
		public static WebElement cartContent;
		
		@FindBy(xpath="//span[@class='close']")
		public static WebElement cartContentclose;
		
		@FindBy(xpath="//span[@class='cart-label']")
		public static WebElement addtoCartlabel;
		
		@FindBy(xpath="//input[@class='button-1 cart-button']")
		public static WebElement goToCartButton;
		
		@FindBy(xpath="//a[@class='product-name'][contains(text(),'Vintage Style Engagement Ring')]")
		public static WebElement jitemText2;
	


}
