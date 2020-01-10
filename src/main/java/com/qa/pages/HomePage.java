package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.basetest.BaseTest;

public class HomePage extends BaseTest {

public HomePage(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);
}

@FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[2]/a")
private WebElement electronics;
@FindBy(xpath = "//li/a[@href='/jewelry']")
public WebElement jewelry;

public void electronicsClick() {
electronics.click();
}

public void clickJewelry() throws InterruptedException {
waitForLoad(driver);
jewelry.click();
}

}