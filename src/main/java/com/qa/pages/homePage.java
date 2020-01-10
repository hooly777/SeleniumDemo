package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class homePage extends BaseTest {

	public homePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//a[text()='Electronics ']")
	private WebElement electronicbtn;
	
	@FindBy(xpath="//a[text()='Cell phones ']")
	private WebElement cellbtn;
	
	public void Electronics(){
		//electronicbtn.click();
		Webgenericutility.mouseHover(electronicbtn);
	}
	public void cellPhones(){
		cellbtn.click();
	}
}
