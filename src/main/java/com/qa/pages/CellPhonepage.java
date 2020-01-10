package com.qa.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.basetest.BaseTest;

public class CellPhonepage extends BaseTest {

	public CellPhonepage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[@class='price actual-price']")
	java.util.List<WebElement> price;

	@FindBy(xpath = "//input[@class='button-2 product-box-add-to-cart-button']")
	java.util.List<WebElement> addtocart;

	@FindBy(xpath = "//div[@class='item-grid']/div[1]/div/div[2]/div[3]/div[2]/input[1]")
	WebElement firstAddtoCart;

	@FindBy(xpath = "//div[@class='item-grid']/div[2]/div/div[2]/div[3]/div[2]/input[1]")
	WebElement secondAddtoCart;

	@FindBy(xpath = "/html/body/div[6]/div[3]/div[2]/div[1]/div[1]/div[2]/ul/li[6]/a")
	WebElement jwellarybtn;

	public void CellPhone() throws InterruptedException {
		ArrayList<String> prices = new ArrayList<String>();
		for (WebElement e : price) {
			prices.add(e.getText());
			System.out.println(e.getText());
		}
		Collections.sort(prices);

		for (int i = 0; i < prices.size(); i++) {
			System.out.println("phone price in ascending " + prices.get(i));

			if (prices.get(0).contains("$"))
				firstAddtoCart.click();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			if (prices.get(1).contains("$"))
				secondAddtoCart.click();

		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		jwellarybtn.click();
	}
}
