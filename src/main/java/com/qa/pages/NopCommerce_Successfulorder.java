package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;


public class NopCommerce_Successfulorder {

	
	@FindBy(xpath ="//strong[contains(text(),'Your order has been successfully processed!')]")
	public static WebElement successful_message;
	WebDriver driver;
	



public NopCommerce_Successfulorder(WebDriver driver){


this.driver=driver;
	//This initElements method will create all WebElements

	PageFactory.initElements(driver, this);

}

public void successfullOrder(String msg){
	
	
	
	SoftAssert sf=new SoftAssert();
	
	sf.assertEquals(successful_message.getText(), msg);

}

}
