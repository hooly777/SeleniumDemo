package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.basetest.BaseTest;

public class NopcommercePage extends BaseTest {
//Constructor
	public NopcommercePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//Electronics Tab WebElement
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[2]/a")
	WebElement ElectronicsLink;
	public WebElement ElectronicsElement(){
		return ElectronicsLink;
	}
	
	//Cellphone WebElement 
	@FindBy(xpath="//ul[@class='top-menu notmobile']/li[2]/ul/li[2]/a")
	WebElement CellphoneLink;
	public WebElement CellphoneElement(){
		return CellphoneLink;
	}
	
	
	
public void mouseHoverClick(){
	Actions mouseClick = new Actions(driver);
	mouseClick.moveToElement(ElectronicsLink).build().perform();
	
}
}
