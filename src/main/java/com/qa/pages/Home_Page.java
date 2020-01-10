package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class Home_Page extends BaseTest {

	public Home_Page() {

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
	WebElement MouseOver;

	@FindBy(xpath = "//ul[@class='sublist first-level']//a[contains(text(),'Cell phones')]")
	public static WebElement ElectronicsCellPhoneClick;

	Webgenericutility utility = new Webgenericutility();

	public void ValidateCellphonePage() throws InterruptedException {
		Thread.sleep(3000);
		// validate the title of cellphone page
		String expTitle = "nopCommerce demo store";
		String actTilte = driver.getTitle();
		System.out.println("current page title: " + actTilte);
		AssertJUnit.assertEquals(actTilte, expTitle);
		Thread.sleep(3000);
	}

	public void moveToElectronics() throws InterruptedException {

		Actions a = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")));
		a.moveToElement(MouseOver);
	
		a.build().perform();
		Thread.sleep(3000);
	}

	public void clickOnCellPhones() throws InterruptedException {
		ElectronicsCellPhoneClick.click();
		Thread.sleep(3000);

	}

}
