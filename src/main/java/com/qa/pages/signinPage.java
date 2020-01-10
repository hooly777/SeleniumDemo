package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.basetest.BaseTest;

public class signinPage extends BaseTest {
	public signinPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='button-1 checkout-as-guest-button']")
	private WebElement checkoutasguest;
	
	public void checkoutasguest(){
		checkoutasguest.click();
	}
	

}
