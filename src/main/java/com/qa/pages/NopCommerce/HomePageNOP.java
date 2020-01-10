package com.qa.pages.NopCommerce;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class HomePageNOP extends BaseTest {

	@FindBy(xpath = "//a[text()='Electronics ']")
	private WebElement ElectronsLink;

	@FindBy(xpath = "//a[text()='Cell phones ']")
	private WebElement CellPhonesLink;

	

	public HomePageNOP(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void mouseHoverElectronics() {
		Webgenericutility.mouseHover(ElectronsLink);
		// ElectronsLink.click();
	}

	public void clickCellPhonesSubMenu() {
		CellPhonesLink.click();
	}

}
