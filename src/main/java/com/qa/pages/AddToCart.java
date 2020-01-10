package com.qa.pages;

import java.io.IOException;
import java.util.List;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class AddToCart extends BaseTest {
	
	Webgenericutility webutility= new Webgenericutility();
	
	public AddToCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h1[contains(text(),'Shopping cart')]")
	 WebElement MainPageElement;
			
	@FindBy(xpath="//a[@href='/jewelry']")
	private List<WebElement> CartProduct;
	
	@FindBy(xpath="//input[@id='itemquantity13478']")
	WebElement cartText;
	
	@FindBy(xpath="//input[@name='updatecart']")
	WebElement btnupdatecart;
	
	@FindBy(xpath="//input[@id='termsofservice']")
	WebElement checkElement;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement btncheckoutelement;
	
	@FindBy(xpath="//input[@class='button-1 checkout-as-guest-button']")
	WebElement btncheckguestelement;
	

	public void GetAllProdAdd() throws InvalidFormatException, IOException{
	    
	    List <WebElement> TotalProducCount = CartProduct;
	    
	    int size =TotalProducCount.size();
	    System.out.println("Total Products are : "+size );
	    for(int i=0;i<size;i++)
	    {
	    	String CartProduct = TotalProducCount.get(i).getText();
	        System.out.println("Product name  is "+TotalProducCount.get(i).getText());
	     }
	    
	}

	public void updateCountUpdateAddtoCart() throws IOException
	{
		cartText.clear();
		cartText.sendKeys("3");
		btnupdatecart.click();
		
	}
	
	public void ClickButtonsAddtoCart() throws IOException{
		Select checkbox=new Select(checkElement);
		checkElement.isSelected();
		btncheckoutelement.click();
		btncheckguestelement.click();
	
	}
	
	}

