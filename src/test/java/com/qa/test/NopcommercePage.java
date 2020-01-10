package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.Webgenericutility;

public class NopcommercePage {
	
    WebDriver driver;

	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
	@CacheLookup
    WebElement electonics;
	
	@FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Cell phones')]")
	@CacheLookup
    WebElement cellphones;
	


    public NopcommercePage(WebDriver driver){

        PageFactory.initElements(driver, this);

    }
   public  Webgenericutility utility=new Webgenericutility();
	
	public WebElement loginelectronics(){
		
		utility.waitTillElementFound(electonics, 3000);
		utility.waitTillElementFound(cellphones, 3000);

		Actions a=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver,3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")));
		a.moveToElement(electonics);
		a.build().perform();
		cellphones.click();

		
		
		 		return cellphones;
		
		
		



	}

}
