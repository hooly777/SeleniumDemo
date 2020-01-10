package com.qa.pages.NopCommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class CellPhonesPageNOP extends BaseTest {

	@FindBy(id = "products-orderby")
	private WebElement sortBy;

	@FindBy(xpath="//a[text()='Jewelry ']")
	private WebElement JewelleryLink;

	@FindBy(xpath = "//span[@title='Close']")
	private WebElement PopUpClose;
	
	
	
	public CellPhonesPageNOP(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void sortPhonePriceLowToHigh() {
		Webgenericutility.selectByVisibleText(sortBy, "Price: Low to High");
	}

	public void AddTwoLPMobilesToCart() throws Exception {
		List<WebElement> AddCart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for (int i = 0; i <2; i++) {
			AddCart.get(i).click();
		
			//PopUpClose.click();
			Thread.sleep(1000);
		}
		
	}

	/*public void goToHomePage(){
		Navigation navigate = new 
	}*/

	public void clickJewelryLink() {
		//Actions action = new Actions(driver);
		//action.moveToElement(JewelleryLink).click().build().perform();
		JewelleryLink.click();
	}
}
