package com.qa.pages;

import java.util.ArrayList;
import java.util.Collections;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.basetest.BaseTest;

public class Jwellerypage extends BaseTest {

	public Jwellerypage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='item-grid']/div[3]/div/div[2]/div[3]/div[2]/input[1]")
	WebElement jwelAddtocart;

	@FindBy(xpath = "//span[@class='price actual-price']")
	java.util.List<WebElement> price;

	@FindBy(xpath = "//div[@class='bar-notification success']")
	WebElement Notification;

	@FindBy(xpath = "//span[@class='close']")
	WebElement NotificationClose;

	@FindBy(xpath = "//*[@id='topcartlink']/a")
	WebElement ShoppingCart;

	@FindBy(xpath = "//input[@value='Go to cart']")
	WebElement ShoppingGotoCart;

	public void Jwelery() throws InterruptedException {
		ArrayList<String> jweprices = new ArrayList<String>();
		for (WebElement e : price) {
			jweprices.add(e.getText());
			System.out.println(e.getText());
		}
		Collections.sort(jweprices);

		for (int i = 0; i < jweprices.size(); i++) {
			System.out.println("jewelry price in ascending " + jweprices.get(i));

		}
		jwelAddtocart.click();
	}

	public void Notification() throws InterruptedException {
		String actualmsg = Notification.getText();
		String expecmsg = "The product has been added to your shopping cart";
		Assert.assertEquals(actualmsg, expecmsg);
		System.out.println(actualmsg);
		NotificationClose.click();
	}

	public void ShoppingCart() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(ShoppingCart).perform();
		System.out.println("Done Mouse hover on 'shoping cart");
		ShoppingGotoCart.click();

	}

}
