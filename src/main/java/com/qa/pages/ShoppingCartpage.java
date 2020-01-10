package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.basetest.BaseTest;

public class ShoppingCartpage extends BaseTest {

	public ShoppingCartpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id='shopping-cart-form']/div[1]")
	WebElement ShoppingCartDetails;

	@FindBy(xpath = "//*[@id='shopping-cart-form']/div[3]/div[2]/div[1]/table")
	WebElement SubTotalDetails;

	@FindBy(xpath = "//*[@id='shopping-cart-form']/div[1]/table/tbody/tr[2]/td[6]/input")
	WebElement jwecount;

	@FindBy(xpath = "//*[@id='shopping-cart-form']/div[2]/div[1]/input[1]")
	WebElement updateShoppingCart;

	@FindBy(xpath = "//*[@id='checkout']")
	WebElement checkoutbtn;

	@FindBy(xpath = "//*[@id='terms-of-service-warning-box']")
	WebElement popup;

	@FindBy(xpath = "/html/body/div[8]/div[1]/button")
	WebElement closebtn;

	@FindBy(xpath = "//*[@id='termsofservice']")
	WebElement checkbox;

	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]/h1")
	WebElement signInPage;

	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/input[1]")
	WebElement CheckOutGuest;

	public void ShoppingCart() throws InterruptedException {
		System.out.println("Shopping Cart details :" + ShoppingCartDetails.getText());
		System.out.println(SubTotalDetails.getText());

		// Assert.assertEquals(SubTotalDetails, "");

		jwecount.clear();
		jwecount.sendKeys("3");

		updateShoppingCart.click();
		checkoutbtn.click();

		System.out.println(popup.getText());
		closebtn.click();

		checkbox.click();
		checkoutbtn.click();

		System.out.println("Verifying Sign In Page" + signInPage.getText());
		CheckOutGuest.click();

	}
}
