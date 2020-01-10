package com.qa.test;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.qa.basetest.BaseTest;
import com.qa.pages.CellPhonesPage;
import com.qa.pages.ElectronicsPage;
import com.qa.pages.HomePage;

public class Demo_NopCommereceAddingCellPhones_Test extends BaseTest {
private final static Logger log = Logger.getLogger(Demo_NopCommereceAddingCellPhones_Test.class);

@Test
public void AddingCellPhone_Cart() throws InterruptedException {
Thread.sleep(3000);
log.info("start of test case");
HomePage homePage = new HomePage(driver);
ElectronicsPage electronicsPage = new ElectronicsPage(driver);
CellPhonesPage cellPhonesPage = new CellPhonesPage(driver);
homePage.electronicsClick();
waitForLoad(driver);
electronicsPage.cellPhonesClick();
waitForLoad(driver);
cellPhonesPage.selectLPCellphone();
cellPhonesPage.ProductPrice();
cellPhonesPage.sortPrice();
cellPhonesPage.AddToCart();
log.info("end  of test case");
}
}