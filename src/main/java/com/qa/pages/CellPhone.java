package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;

import com.qa.basetest.BaseTest;

public class CellPhone extends BaseTest {
	Home_Page hm=new  Home_Page();
	Select select;
	
	
	@FindBy(id="products-orderby")
 	private WebElement dropdownselect;
	
	
	@FindBy(xpath="//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
	private WebElement FirstLowestPhone;
	
	@FindBy(xpath="//div[@class='page-body']//div[2]//div[1]//div[2]//div[3]//div[2]//input[1]")
	private WebElement SecondLowestPhone;
	
	@FindBy(xpath="//span[@class='close']")
	private WebElement  CloseNotify;
	
	
	public CellPhone(){
		//This initElements method will create all WebElements
 		PageFactory.initElements(driver, this);

	}
	
	public void CloseNotification(){

		CloseNotify.click();     
	}
	
	public void sortLowToHigh() throws InterruptedException {
	select = new Select(dropdownselect);
	System.out.println("ClickOnCellAndAddtoCart1");
	Thread.sleep(3000);
	select.selectByVisibleText("Price: Low to High");
	System.out.println("ClickOnCellAndAddtoCart2");
	Thread.sleep(3000);
	}
	

	public void AddToCart() throws InterruptedException
	{
	FirstLowestPhone.click();
	System.out.println("Lower Price 1 added to cart..");
	Thread.sleep(3000);
	SecondLowestPhone.click();
	System.out.println("Lower Price 2 added to cart..");
	Thread.sleep(3000);
	}
	
	public void ClickOnCellAndAddtoCart() throws InterruptedException{
	CellPhone epage = new CellPhone();
	System.out.println("ClickOnCellAndAddtoCart");
	epage.sortLowToHigh();
	epage.AddToCart();
	Thread.sleep(3000);
	}
	
	
	
	
}
