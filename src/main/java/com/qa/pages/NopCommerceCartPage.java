package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import com.hackathon.utility

public class NopCommerceCartPage{
	
	WebDriver driver;
	public NopCommerceCartPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(xpath="//div[@class='page-title']/h1[text()='Shopping cart']") WebElement pageHeader;
	@FindBy(xpath="(//input[@class='qty-input'])[3]") WebElement editJwelerycountbox;
	@FindBy(xpath="//input[@class='button-2 update-cart-button']") WebElement btnUpdateCart;
	@FindBy(xpath="//button[@id='checkout']") WebElement btnCheckout;
	@FindBy(xpath="//div[@id='terms-of-service-warning-box']") WebElement TermsCond;
	@FindBy(xpath="//button[@title='Close']") WebElement btnClosePopup;
	@FindBy(xpath="//input[@id='termsofservice']") WebElement termsCheckbox;

	public void isPageDisplayed()
	{
		if(pageHeader.isDisplayed())
		{
			Reporter.log("NopCommerce cart page is displayed",true);
		}
		else
			Reporter.log("NopCommerce cart page is not displayed",false);
	
	}
	public void verifyAddedItems()
	{
		int NumberOfRows=driver.findElements(By.xpath("//*[@id='shopping-cart-form']/div[1]/table/tbody/tr")).size();
		if(NumberOfRows==3)
		{
			Reporter.log("three items are present in the cart",true);
		}
		
		 List<WebElement> ElementsInCart = driver.findElements(By.xpath("//*[@id='shopping-cart-form']/div[1]/table/tbody/tr/td[4]"));
		
	
		String CartItem1=ElementsInCart.get(0).getText();
		System.out.println("Cart Item1:"+CartItem1);
		String CartItem2=ElementsInCart.get(1).getText();
		System.out.println("Cart Item2:"+CartItem2);
		String CartItem3=ElementsInCart.get(2).getText();
		System.out.println("Cart Item3:"+CartItem3);
   
/*String AddedItem1=NopCommerceCellphonePage.AddedCellphones().get(0).getText();
String AddedItem2=NopCommerceCellphonePage.AddedCellphones().get(1).getText();
String AddedItem3=NopCommerceJwelleryPage.addedJweleryItem();
if(CartItem1==AddedItem1 && CartItem2==AddedItem2 && CartItem3==AddedItem3)
{
	Reporter.log("Allthe three added items:"+AddedItem1+","+AddedItem2+"and"+AddedItem3+" are present in the cart",true);
}
	*/
	}
	public void verifySubTotal()
	{
		 float sum=0;
		List<WebElement> ElementsInCart =driver.findElements(By.xpath("//*[@id='shopping-cart-form']/div[1]/table/tbody/tr/td[7]"));
	for(int i=0;i<=ElementsInCart.size();i++)
	{
		String Price=ElementsInCart.get(i).toString().substring(1);
		System.out.println(Price);
		float price=Integer.parseInt(Price);
		sum=sum+price;
	}
	String subtotal=driver.findElement(By.xpath("//tr[@class='order-subtotal']/td[@class='cart-total-right']/span")).getText();
	int Subtotal=Integer.parseInt(subtotal);
	if(sum==Subtotal)
	{
		Reporter.log("Subtotal shown correctly as the sum of three prices",true);
	}
	}
	
	public void updateJweleryCount() throws InterruptedException
	{
		editJwelerycountbox.clear();
		editJwelerycountbox.sendKeys("3");
		Thread.sleep(2000);
		btnUpdateCart.click();
		
	}
	public void clickOnCheckout() 
	{
		btnCheckout.click();
		
	}
	public void termsandServicePopUp()
	{
		//driver.switchTo().alert();
		if(TermsCond.isDisplayed())
		{
			Reporter.log("Terms and service pop up is displayed",true);
		}
		else
			Reporter.log("Terms and service pop up is not displayed",false);
		btnClosePopup.click();
		//driver.switchTo().defaultContent();
	}
	public void selectTermsCheckbox() 
	{
		termsCheckbox.click();
		
	}
	}
	
	
	
	


