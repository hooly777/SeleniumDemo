package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qa.basetest.BaseTest;
import com.qa.pages.HomePage;

public class NopCommercecart extends BaseTest{
	
    WebDriver driver;

    HomePage objLogin;

	
	
	@Test
	
	public void TC_001() {
		

		objLogin.hoverToElectronics();
	}

}
