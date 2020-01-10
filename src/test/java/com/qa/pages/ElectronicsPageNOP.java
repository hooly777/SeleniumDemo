package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.Utility.ExcellUtility;
import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class ElectronicsPageNOP extends BaseTest {
	Webgenericutility webTestUtil= new Webgenericutility();
	ExcellUtility excellUtility = new ExcellUtility();
	public ElectronicsPageNOP(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[6]/div[3]/div[2]/div[1]/div[1]/div[2]/ul/li[2]/ul/li[2]/a")
	private WebElement cellphones;

	public void cellPhonesClick() throws InterruptedException {
		waitForLoad(driver);
		
		cellphones.click();
	}

}
