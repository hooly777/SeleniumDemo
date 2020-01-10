package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.basetest.BaseTest;
public class NOPShoppingCart extends BaseTest
{
       public NOPShoppingCart(WebDriver driver)
       {
    	   this.driver=driver;
    	   PageFactory.initElements(driver, this);
       }
       
       @FindBy(id="itemquantity14914")
       public WebElement txtQuantity;
       
       @FindBy(xpath="//input[@name='updatecart']")
       public WebElement btnUpdateCart;
       
       @FindBy(id="checkout")
       public WebElement btnCheckout;
       
       @FindBy(xpath="//button[@title='Close']")
       public WebElement closepopup;
       
       public void performOperations() throws InterruptedException
       {
    	   txtQuantity.clear();
    	   txtQuantity.sendKeys("3");
    	   Thread.sleep(1000);
    	   btnUpdateCart.click();
    	   Thread.sleep(1000);
    	   btnCheckout.click();
    	   Thread.sleep(1000);
    	   closepopup.click();
       }
}
