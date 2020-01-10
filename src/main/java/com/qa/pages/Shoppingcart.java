package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.basetest.BaseTest;
public class Shoppingcart extends BaseTest {
public Shoppingcart(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//li[@id='topcartlink']")
WebElement Shoppingcart;
@FindBy(xpath = "//*[@id='checkout']")
WebElement checkout;
@FindBy(xpath = "//*[@id='termsofservice']")
WebElement termsofservice;
@FindBy(xpath = "//*[@value='Checkout as Guest']")
WebElement CheckoutAsGuest;

}