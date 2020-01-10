package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.qa.basetest.BaseTest;

public class AddToCart extends BaseTest {
	
	WebDriver driver;

	Select select;
	Actions action;
	AddToCart jpage;
	WebElement table;
	List<WebElement> rows;
	
	@FindBy(xpath="//*[@class='ico-cart']")
 	private WebElement Gotocart;
	
	@FindBy(xpath="//input[@class='button-1 cart-button']")
	private WebElement buttonclick;
	
	
	@FindBy(xpath="//div[@class='table-wrapper']/table/tbody/tr[3]/td[6]/input")
	private WebElement updatecount;
	
	public AddToCart() {

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}
	
	public void GoToCart() throws InterruptedException{
//		action = new Actions(driver);
//		WebDriverWait wait = new WebDriverWait(driver, 3000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("//span[@class='cart-label']")));
//		action.moveToElement(Gotocart);
//		Thread.sleep(5000);
//		action.build().perform();
		Thread.sleep(3000);
		Gotocart.click();
	}
	/*public void ClickGoToCartButton() throws InterruptedException {

		buttonclick.click();
		Thread.sleep(3000);
	}
	*/
	
	
	public void UpdateJewelryCount() throws InterruptedException {
		Thread.sleep(3000);
		updatecount.sendKeys("3");		
	}
	    
	}