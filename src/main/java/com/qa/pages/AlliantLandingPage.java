package com.qa.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.basetest.BaseTest;

public class AlliantLandingPage extends BaseTest {

	WebDriver driver;
	
	public AlliantLandingPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void scrollToBottomPage(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		
	}
	
	@FindBy(xpath="//nav[@id='footer-main-nav']/div[1]/ul/li[1]")
	WebElement BankLink;
	public WebElement BankElement(){
		return BankLink;
	}
	

	@FindBy(xpath="//nav[@id='footer-main-nav']/div[1]/ul/li[2]")
	WebElement BorrowLink;
	public WebElement BorrowElement(){
		return BorrowLink;
	}
	
	@FindBy(xpath="//nav[@id='footer-main-nav']/div[1]/ul/li[3]")
	WebElement InvestLink;
	public WebElement InvestElement(){
		return InvestLink;
	}
	
	@FindBy(xpath="//nav[@id='footer-main-nav']/div[1]/ul/li[4]")
	WebElement ProtectLink;
	public WebElement ProtectElement(){
		return ProtectLink;
	}
	
	//List of WebElements
	@FindBy(xpath="//nav[@id='footer-main-nav']/div[1]")
	public static List<WebElement> accountSection;
	
	public static List<WebElement> getList()
	{
		List<WebElement> elements = accountSection;
		return elements;
	}
 	
}
