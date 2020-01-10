package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.basetest.BaseTest;

public class cartPage extends BaseTest {

	public cartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='shopping-cart-form']/div[1]")
	private WebElement shoppingdetails;

	@FindBy(xpath = "//span[@class='value-summary']")
	private WebElement subtotaldetails;

	@FindBy(xpath = "(//input[@class='qty-input'])[2]")
	private WebElement qty;

	@FindBy(xpath = "//input[@value='Update shopping cart']")
	private WebElement Update;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;
	
	@FindBy(xpath="//*[contains(text(),'Please accept the terms of service')]")
	private WebElement verifypop;
	
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement closebtn;
	
	@FindBy(xpath="//input[@id='termsofservice']")
	private WebElement checkbox;
	
	@FindBy(xpath="//h1[contains(text(),'Welcome, Please Sign In!')]")
	private WebElement verifypage;

	public void subtotal() {
		subtotaldetails.getText();
		System.out.println("shoppingdetails :" + shoppingdetails.getText());
		System.out.println(subtotaldetails.getText());
	}

	public void quantity() throws InterruptedException {
		qty.clear();
		qty.sendKeys("3");
	}
	public void upadtecart(){
		Update.click();
	}
	public void checkout(){
	
		checkout.click();
	}
	

	public void closepopup(){
		String act=verifypop.getText();
		String exp="Please accept the terms of service before the next step.";
		Assert.assertEquals(exp,act);
		closebtn.click();
	}
	public void checkbox(){
		checkbox.click();
		checkout.click();
	}
	
	public void verifysigninpage(){
		String act=verifypage.getText();
		System.out.println(verifypage);
		String exp="Welcome, Please Sign In!";
	Assert.assertEquals(act, exp);	
	}

	

}
