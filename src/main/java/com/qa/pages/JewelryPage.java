package com.qa.pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class JewelryPage extends BaseTest{
	@FindBy(xpath="//select[@id='products-orderby']")
	WebElement sortBy;


	@FindBy(xpath="//span[text()='Shopping cart']")
	WebElement shoppingCart;

	@FindBy(xpath="//div[@class='buttons']//input[@value='Go to cart']")
	WebElement goToCart;

	public JewelryPage(){
		PageFactory.initElements(driver, this);
	}
	public JewelryPage sort() {
		Webgenericutility.selectFromDropdownByVisibleText(sortBy, "Price: High to Low");
		return this;
	}
	public JewelryPage addJewelryToCart() {
		List<WebElement> itemGrids = driver.findElements(By.cssSelector(".item-grid > div"));
		WebElement highestPrice = itemGrids.get(0);
		String text1 = highestPrice.findElement(By.className("product-title")).getText();
		String prices1 = highestPrice.findElement(By.className("prices")).getText();
		CellPhones.mapProductNameAndValue.put(text1, prices1);
		highestPrice.findElement(By.className("product-box-add-to-cart-button")).click();
		return this;
	}
	public JewelryPage getNotificationAndClose()
	{
		WebElement barNotification = driver.findElement(By.xpath("//div[@class='bar-notification success'] "));
		System.out.println(barNotification.getText());
		assertEquals(barNotification.getText(),"The product has been added to your shopping cart");
		barNotification.findElement(By.className("close")).click();;		
		return this;
	}
	public CartPage hoverOnCart() throws InterruptedException {
		Webgenericutility.mouseHoverOnElement(shoppingCart);
		Thread.sleep(1500);
		goToCart.click();

		return new CartPage();	
	}
}
