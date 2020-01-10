package com.qa.test;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.qa.basetest.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.JewelleryPage;

public class Demo_NopCommereceAddingJewelry_Test extends BaseTest {
private final static Logger log = Logger.getLogger(Demo_NopCommereceAddingJewelry_Test.class);

@Test
public void AddingJewelryToCart() throws InterruptedException {
log.info("start of test case");
HomePage homePage = new HomePage(driver);
JewelleryPage jewelryPage = new JewelleryPage(driver);
waitForLoad(driver);
homePage.clickJewelry();
waitForLoad(driver);
jewelryPage.selectHPJewelry();
waitForLoad(driver);
jewelryPage.ProductPrice();
jewelryPage.sortPrice();
waitForLoad(driver);
jewelryPage.addCartHpJewelry();
log.info("end  of test case");
}

}