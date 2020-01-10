package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.qa.basetest.BaseTest;

public class ElectronicsPage extends BaseTest {
	HomePage hm= new HomePage();
	Select select ;
	
	@FindBy(name="products-orderby")
	private WebElement selectLower;
	
	@FindBy(xpath="//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
	private WebElement lowestProduct1;

	@FindBy(xpath="//div[@class='page-body']//div[2]//div[1]//div[2]//div[3]//div[2]//input[1]")
	private WebElement lowestProduct2;

	@FindBy(xpath="//span[@class='close']")
	private WebElement CloseNotification;
	public void closeNotification() throws InterruptedException
	{
		CloseNotification.click();
		Thread.sleep(5000);
	}
	
	public void clickLowsetProduct1() throws InterruptedException
	{
		lowestProduct1.click();
		Thread.sleep(3000);
		
	}
	public void clickLowestProduct2() throws InterruptedException
	{
		lowestProduct2.click();
		Thread.sleep(3000);
	}
	
	public ElectronicsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setProductListToLowerToHigh() throws InterruptedException
	{
		select = new Select(selectLower);
		System.out.println("ClickOnCellAndAddtoCart1" );
		select.selectByVisibleText("Price: Low to High");
		System.out.println("ClickOnCellAndAddtoCart2" );
		Thread.sleep(3000);
		
	}
	public void AddToCart() throws InterruptedException
	{
	    lowestProduct1.click();
		System.out.println("Lower Price 1 added to cart..");
		Thread.sleep(5000);
		lowestProduct2.click();
		System.out.println("Lower Price 2 added to cart..");
		Thread.sleep(5000);
	}
	@Test
	public void ClickOnCellAndAddtoCart() throws InterruptedException
	{
		Thread.sleep(1000);
		ElectronicsPage epage = new ElectronicsPage();
		System.out.println("ClickOnCellAndAddtoCart" );
		epage.setProductListToLowerToHigh();
		epage.AddToCart(); 
		
		
	}
	
}
