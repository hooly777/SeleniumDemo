package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;
public class NOPHome extends BaseTest
{
	    
         public NOPHome(WebDriver driver)
         {
        	this.driver=driver;
        	PageFactory.initElements(driver, this);
         }
         
         @FindBy(xpath="//a[text()='Electronics ']")
         public WebElement electronics;
         
         @FindBy(xpath="//a[(text(),'Cell phones ')]")
         public WebElement cellphones;
         
         public void mouseOverToElectronics()
         {
        //	 w=new WebDriverWait(d,3000);
        //	 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics')]")));
        	Webgenericutility.moveToElement(electronics);
        	//Actions action= new Actions(driver);
        //.	action.moveToElement(electronics).build().perform();
         } 
}
