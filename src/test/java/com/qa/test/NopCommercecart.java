package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qa.basetest.BaseTest;

public class NopCommercecart extends BaseTest{
	
    WebDriver driver;

    NopcommercePage objLogin;

	
	
	@Test
	
	public void TC_001() {
		

		objLogin.loginelectronics();
	}

}
