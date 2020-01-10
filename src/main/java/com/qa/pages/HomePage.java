package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class HomePage extends BaseTest {
	@FindBy(xpath="//a[text()='Electronics ']")
	WebElement electronics;

	@FindBy(linkText="Cell phones")
	WebElement cellPhones;

	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	public CellPhones moveToElectronics() {
		Webgenericutility.mouseHoverOnElement(electronics);
		System.out.println("Mouse hover on electronics finished");
		cellPhones.click();
		return new CellPhones();
	}
}
