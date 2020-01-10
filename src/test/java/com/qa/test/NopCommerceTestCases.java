package com.qa.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.qa.basetest.BaseTest;
import com.qa.pages.NopCommerceCartPage;
import com.qa.pages.NopCommerceCellphonePage;
import com.qa.pages.NopCommerceHomePage;
import com.qa.pages.NopCommerceJwelleryPage;
import com.qa.pages.NopCommerceSignInPage;

public class NopCommerceTestCases extends BaseTest {
	
	@Test(priority=1)
	public void NopCommerceSelectMobileValidation() throws InterruptedException
	{
		
		NopCommerceHomePage homepage=PageFactory.initElements(driver, NopCommerceHomePage.class);
		homepage.isPageDisplayed();
		homepage.selectMobileUnderElectronics();
		NopCommerceCellphonePage cellphonepage=PageFactory.initElements(driver, NopCommerceCellphonePage.class);
		cellphonepage.isPageDisplayed();
		cellphonepage.sortMobileLowToHigh();
		cellphonepage.addToCartLowestTwoCellphones();
		cellphonepage.clickOnJwelleryLnk();
		
	}
	@Test(priority=2)
	public void NopCommerceSelectJweleryValidation() throws InterruptedException
	{
	
	NopCommerceJwelleryPage jwellerypage=PageFactory.initElements(driver, NopCommerceJwelleryPage.class);
	jwellerypage.isPageDisplayed();
	jwellerypage.sortJwelleryByPrice();
	jwellerypage.addToCartHighestPriceJwellery();
	jwellerypage.verifySuccessNotification();
	jwellerypage.goToCart();
	
	}
	@Test(priority=3)
	public void NopCommerceCartValidation() throws InterruptedException
	{
	NopCommerceCartPage cartpage=PageFactory.initElements(driver, NopCommerceCartPage.class);
	cartpage.isPageDisplayed();
	/*cartpage.verifyAddedItems();
	cartpage.verifySubTotal();*/
	
	}
	@Test(priority=4)
	public void NopCommerceUpdateAndCheckoutvalidation() throws InterruptedException
	{
	NopCommerceCartPage cartpage=PageFactory.initElements(driver, NopCommerceCartPage.class);
	cartpage.updateJweleryCount();
	cartpage.clickOnCheckout();
	cartpage.termsandServicePopUp();
	cartpage.selectTermsCheckbox();
	cartpage.clickOnCheckout();
	
	}
	@Test(priority=5)
	public void NopCommerceSignInPageValidation() throws InterruptedException
	{
	NopCommerceSignInPage signpage=PageFactory.initElements(driver, NopCommerceSignInPage.class);
	signpage.isPageDisplayed();
	signpage.clickCheckoutAsGuest();
	}
	
	@Test(priority=6)
	public void NopCommerceEnterDeatils() throws InterruptedException
	{
	NopCommerceSignInPage signpage=PageFactory.initElements(driver, NopCommerceSignInPage.class);
	signpage.enterDetails("Test1","abc@gmail.com");
	}
	@Test(priority=7)
	public void NopCommerceVerifySuccesspage() throws InterruptedException
	{
	NopCommerceSignInPage signpage=PageFactory.initElements(driver, NopCommerceSignInPage.class);
	signpage.verifyOrderSuccessfulMessage();
	}

}
