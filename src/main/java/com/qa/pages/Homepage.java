package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class Homepage extends BaseTest {

	public Homepage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Electronics ']")
	WebElement ElectronicsBtn;

	@FindBy(xpath = "//a[text()='Cell phones ']")
	WebElement CellBtn;

	@SuppressWarnings("deprecation")
	public void Electronics() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Webgenericutility.mouseHover(ElectronicsBtn);
		CellBtn.click();
	}
}