package com.qa.pages;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.basetest.BaseTest;
import com.qa.Utility.Webgenericutility;
public class NOPCellPhoneSelection extends BaseTest
{
          public NOPCellPhoneSelection(WebDriver driver)
          {
        	  this.driver=driver;
        	  PageFactory.initElements(driver, this);
          }
          
          @FindBy(id="products-orderby")
          public WebElement sortby;
          
          @FindBy(xpath="//a[text()='Jewelry ']")
          public WebElement jewellrylink;
          
          public void selectDropDownOption()
          {
        	  Webgenericutility.selectByVisibleText(sortby, "Price: Low to High");
          }
          
          public void addTwoMobiles() throws InterruptedException
          {
        	  List<WebElement> addmobiles=driver.findElements(By.xpath("//input[@value='Add to cart']"));
        	  for(int i=0;i<2;i++)
        	  {
        		  addmobiles.get(i).click();
        		  Thread.sleep(1000);
        	  }
          }
          public void clickJewellryLink() throws InterruptedException
          {
        	  Actions a=new Actions(driver);
        	  a.click(jewellrylink).build().perform();
          }
}
