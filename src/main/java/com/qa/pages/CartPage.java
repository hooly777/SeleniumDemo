package com.qa.pages;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.basetest.BaseTest;

public class CartPage extends BaseTest {
	public static Map<String, String> mapProductNameAndPrice = new HashMap<String, String>();
	@FindBy(xpath = "//input[@class='button-2 update-cart-button']")
	WebElement updateShopCart;

	@FindBy(xpath = "//button[@class='button-1 checkout-button']")
	WebElement checkOutBtn;

	@FindBy(id = "termsofservice")
	WebElement checkBoxTerms;

	@FindBy(xpath="//div[@id='terms-of-service-warning-box']")
	WebElement checkoutPopup;

	@FindBy(xpath="(//input[@class='qty-input'])[3]")
	WebElement qtyEditBox;

	@FindBy(xpath="//td[@class='cart-total-right']")
	WebElement subTotalValue;

	@FindBy(xpath="//button[@title='Close']")
	WebElement closePopup;

	public CartPage(){
		PageFactory.initElements(driver, this);
	}
	public void verifyTotal(){
		List<WebElement> productNames = driver.findElements(By.xpath("//td[@class='product']/a"));
		WebElement productOne = productNames.get(0);
		WebElement productTwo = productNames.get(1);
		WebElement productThree = productNames.get(2);
		//assertEquals(productOne, "HTC One Mini Blue");
		System.out.println(productOne);
		System.out.println(subTotalValue.getText());
		assertEquals(subTotalValue.getText(),"$2,445.00");
	}
	public void modifyCart(){
		qtyEditBox.clear();
		qtyEditBox.sendKeys("3");
		updateShopCart.click();
	}
	public SignInPage checkoutAndVerifyTerms(){
		checkOutBtn.click();
		String text = checkoutPopup.getText();
		assertEquals(text, "Please accept the terms of service before the next step.");
		closePopup.click();
		checkBoxTerms.click();
		checkOutBtn.click();
		return new SignInPage();
	}
}
