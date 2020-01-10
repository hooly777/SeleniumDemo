package com.qa.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class CellPhones extends BaseTest {
	public static Map<String, String> mapProductNameAndValue = new HashMap<String, String>();

	@FindBy(xpath="//select[@id='products-orderby']")
	WebElement sortBy;

	@FindBy(xpath="//a[text()='Jewelry ']")
	WebElement jewelry;

	public CellPhones(){
		PageFactory.initElements(driver, this);
	}
	public CellPhones sortBy(){
		Webgenericutility.selectFromDropdownByVisibleText(sortBy, "Price: Low to High");
		return this;
	}
	public CellPhones addToCart() throws InterruptedException {
		List<WebElement> itemGrids = driver.findElements(By.cssSelector(".item-grid > div"));
		WebElement lowestPrice = itemGrids.get(0);
		String text1 = lowestPrice.findElement(By.className("product-title")).getText();
		String prices1 = lowestPrice.findElement(By.className("prices")).getText();
		mapProductNameAndValue.put(text1, prices1);
		WebElement secondLowest = itemGrids.get(1);
		String text2 = secondLowest.findElement(By.className("product-title")).getText();
		String prices2 = secondLowest.findElement(By.className("prices")).getText();
		mapProductNameAndValue.put(text2, prices2);
		lowestPrice.findElement(By.className("product-box-add-to-cart-button")).click();
		Thread.sleep(3000);	
		secondLowest.findElement(By.className("product-box-add-to-cart-button")).click();
		Thread.sleep(6000);
		return this;	
	}
	public JewelryPage moveToJewlery() {
		jewelry.click();
		return new JewelryPage();
	}
}
