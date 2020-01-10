package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;
public class NOPJewellry extends BaseTest
{
      public NOPJewellry(WebDriver driver)
      {
    	  this.driver=driver;
    	  PageFactory.initElements(driver, this);
      }
      
      @FindBy(id="products-orderby")
      public WebElement selectjewellry;
      
      @FindBy(xpath="//input[@value='Add to cart']")
      public WebElement addjewellrybutton;
      
      @FindBy(xpath="//a[text()='shopping cart']")
      public WebElement verificationmessage;
      
      @FindBy(xpath="//span[@title='Close']")
      public WebElement closeverification;
      
      @FindBy(xpath="//span[text()='Shopping cart']")
      public WebElement shoppingcartmouseover;
      
      @FindBy(xpath="//input[@class='button-1 cart-button']")
      public WebElement gobutton;
      
      public void selectJewellry()
      {
    	  Webgenericutility.selectByVisibleText(selectjewellry, "Price: High to Low");
      }
      
      public void clickAddJewellryButton()
      {
    	  addjewellrybutton.click();
      }
   
      public void verifyNotification()
      {
    	  String actual="shopping cart";
    	  String expected=verificationmessage.getText();
    	  Assert.assertEquals(actual, expected);
      }
      public void closeNotification()
      {
    	  closeverification.click();
      }
      public void mouseOverShopping()
      {
    	  Webgenericutility.moveToElement(shoppingcartmouseover);
      }
      
      public void clickGoButton() throws InterruptedException
      {
    	  Thread.sleep(1000);
    	  gobutton.click();
      }      
}
