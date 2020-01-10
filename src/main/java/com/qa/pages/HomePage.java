package com.qa.pages;

	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class HomePage {
		
		@FindBy(xpath="//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
		public static WebElement hoverElectronicsmenu;
		
		@FindBy(xpath= "//ul[@class='top-menu notmobile']//a[contains(text(),'Cell phones')]")
		public static WebElement cellPhone;
		
		
		
	}



