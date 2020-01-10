package com.qa.pages;


import org.apache.commons.logging.impl.Log4JLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.qa.Utility.ExcellUtility;
import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;


public class BankLoginPage extends BaseTest {
	private final static Logger log = Logger.getLogger(BankLoginPage.class);
WebDriver driver;
	@FindBy(xpath="//*[@id='footer-main-nav']/div[1]/h5")
	WebElement accounts;
	@FindBy(xpath="//*[@id='footer-main-nav']/div[1]")
	WebElement accSubsection;
	
	
	public BankLoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);				
		}
	
	
	public String  subsectionNames(){
		 accSubsection.getText();
		return accSubsection.getText();	
	}
}
