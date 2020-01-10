package com.qa.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

import junit.framework.Assert;

public class jewelleryPage extends BaseTest {
	
	public jewelleryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="products-orderby")
	private WebElement sortby;
	
	@FindBy(xpath="//input[@value='Add to cart']")
	private WebElement addToCart;
	
	//@FindBy(xpath="//span[@class='cart-label']")
	//private WebElement Notify;
	
	@FindBy(xpath="//span[@class='cart-label']")
	private WebElement shpcartbtn;
	
	@FindBy(xpath=" //span[@class='close']")
	private WebElement close;
	
	@FindBy(xpath="//input[@class='button-1 cart-button']")
	private WebElement gotocart;
	
	public void sortPriceHighToLow(){
		Webgenericutility.selectByVisibleText(sortby, "Price: High to Low");
	}

	public void addJewel(){
		addToCart.click();
	   }
/*public void Notification(){
		//String Actualmsg=Notify.getText();
		String Expmsg="The product has been added to your shopping cart";
		Assert.assertEquals(Expmsg,Actualmsg);
		System.out.println(Actualmsg);
		close.click();*/
		
	//}
public void hovershpngbtn(){
	Webgenericutility.mouseHover(shpcartbtn);
	gotocart.click();
}
	
	
	
	}



