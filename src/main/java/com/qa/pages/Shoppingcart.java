package com.qa.pages;


	

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class Shoppingcart {

		
		@FindBy(xpath="//select[@id='products-orderby']")
		public static WebElement sortDropdown_1;
		
		@FindBy(xpath="//h2[@class='product-title']//a[contains(text(),'HTC One Mini Blue')]")
		public static WebElement citemText3;
		
		@FindBy(xpath="//h2[@class='product-title']//a[contains(text(),'HTC One M8 Android L 5.0 Lollipop')]")
		public static WebElement citemText4;
		
		@FindBy(xpath="//a[@class='product-name'][contains(text(),'Vintage Style Engagement Ring')]")
		public static WebElement jitemText2;
		
		@FindBy(xpath ="//span[contains(text(),'$19,245.00')]")
		public static WebElement subTotal;
		

		@FindBy(id ="itemquantity13138")
		public static WebElement qty;
		
		@FindBy(name ="updatecart")
		public static WebElement updateCartbutton;
		
		
		@FindBy(id ="checkout")
		public static WebElement checkoutButton;
		
		@FindBy(xpath ="//button[@class='ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close']")
		public static WebElement closeTermspopup;
		
		
		@FindBy(id ="termsofservice")
		public static WebElement acceptCheckbox;
		
	


}
