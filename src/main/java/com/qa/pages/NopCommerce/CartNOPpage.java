package com.qa.pages.NopCommerce;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class CartNOPpage extends BaseTest {

	@FindBy(xpath = "//a[@class='product-name']")
	private WebElement AddedProducts;

	@FindBy(xpath = "//*[@class='value-summary']")
	private WebElement SubTotal;

	@FindBy(xpath = "(//input[@class='qty-input'])[3]")
	private WebElement JewelleryTB;

	@FindBy(xpath = "//input[@value='Update shopping cart']")
	private WebElement UpdateShoppingCart;

	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement CheckOutBtn;

	@FindBy(xpath = "//*[contains(text(),'Please accept the terms of service')]")
	private WebElement TermsAndService;

	@FindBy(xpath = "//button[@title='Close']")
	private WebElement CloseButton;

	@FindBy(xpath = "//input[@id='termsofservice']")
	private WebElement AgreeTermsBTN;
	
	@FindBy(xpath ="//h1[text()='Welcome, Please Sign In!']")
	private WebElement SignMSG;
	
	@FindBy(xpath ="//input[@value='Checkout as Guest']")
	private WebElement CheckOutGuestBTN;

	
	
	public CartNOPpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void verifyShoppingCartItems() {
		// Webgenericutility.listOfElements("//a[@class='product-name']");
		List<String> ItemNames = Webgenericutility.listOfElements("//a[@class='product-name']");
		String expect1 = ItemNames.get(0);
		String expect2 = ItemNames.get(1);
		String expect3 = ItemNames.get(2);

		String actual1 = "HTC One Mini Blue";
		String actual2 = "HTC One M8 Android L 5.0 Lollipop";
		String actual3 = "Vintage Style Engagement Ring";
		Assert.assertEquals(actual1, expect1);
		Assert.assertEquals(actual2, expect2);
		Assert.assertEquals(actual3, expect3);
		System.out.println(" verified Items list");

	}

	public void verifyShoppingCartItemsPrice() {
		// Webgenericutility.listOfElements("//a[@class='product-name']");
		List<String> ItemNames = Webgenericutility.listOfElements("//*[@class='product-unit-price']");
		String expect1 = ItemNames.get(0);
		String expect2 = ItemNames.get(1);
		String expect3 = ItemNames.get(2);

		String actual1 = "$100.00";
		String actual2 = "$245.00";
		String actual3 = "$2,100.00";
		Assert.assertEquals(actual1, expect1);
		Assert.assertEquals(actual2, expect2);
		Assert.assertEquals(actual3, expect3);
		System.out.println(" verified Items price");

	}

	public void verifyShoppingCartItemsQuantity() {
		// Webgenericutility.listOfElements("//a[@class='product-name']");
		List<String> ItemNames = Webgenericutility.listOfElements("//*[@class='qty-input']");
		String expect1 = ItemNames.get(0);
		String expect2 = ItemNames.get(1);
		String expect3 = ItemNames.get(2);

		String actual1 = "1";
		String actual2 = "1";
		String actual3 = "1";
		Assert.assertEquals(actual1, expect1);
		Assert.assertEquals(actual2, expect2);
		Assert.assertEquals(actual3, expect3);
		System.out.println(" verified Items Quantity");

	}

	public void verifySubTotal() {

		String ActualTotal = SubTotal.getText();
		System.out.println("actual subtotal:-" + ActualTotal);
		String ExpectedTotal = "$2,445.00";
		Assert.assertEquals(ActualTotal, ExpectedTotal);
		System.out.println(" Subtotal verified successfully");
	}

	public void modifyJewelryUpdateShoppingCart() {
		JewelleryTB.clear();
		JewelleryTB.sendKeys("3");
	}

	public void UpdateShoppingCart() {
		UpdateShoppingCart.click();
	}

	public void clickCheckout() {
		CheckOutBtn.click();
	}

	public void verifyTermsOfService() {
		String ActualTermsText = TermsAndService.getText();
		String ExpectedTermsText = "Please accept the terms of service before the next step.";
		Assert.assertEquals(ActualTermsText, ExpectedTermsText);
		System.out.println(" verified Terms and conditions");
	}

	public void closePopUp() {
		CloseButton.click();
	}
	public void clickAgreeTermsAndConditions(){
		AgreeTermsBTN.click();
	}
	public void verifySignIn(){
		String Expect="Welcome, Please Sign In!";
		String Actual=SignMSG.getText();
		Assert.assertEquals(Actual, Expect);
		System.out.println(" Sign in page verified");
	}
	public void clickCheckOutAsGuest(){
		CheckOutGuestBTN.click();
	}
}
