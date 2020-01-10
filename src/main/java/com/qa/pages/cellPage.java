package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class cellPage extends BaseTest 
{
	public cellPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="products-orderby")
	private WebElement sortby;
	@FindBy(xpath="//a[text()='Jewelry ']")
	private WebElement jwelbtn;
	
	
public void sortPriceLowToHigh(){
	Webgenericutility.selectByVisibleText(sortby, "Price: Low to High");
}

public void addTwoMoblies() throws InterruptedException{
	List<WebElement>addCart=driver.findElements(By.xpath("//input[@value='Add to cart']"));
	for(int i=0;i<addCart.size()-1;i++){
		addCart.get(i).click();
		
	}
	
}

public void clickOnJewelBtn() {
	jwelbtn.click();
	
}
		

}
