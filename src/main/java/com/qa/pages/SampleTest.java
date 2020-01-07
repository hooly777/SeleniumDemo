package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.basetest.BaseTest;

public class SampleTest extends BaseTest {

	

	@FindBy(name="uid")

	WebElement user99GuruName;

	@FindBy(name="password")

	WebElement password99Guru;


	@FindBy(name="btnLogin")

	WebElement login;


	public SampleTest(){



		//This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}

	//Set user name in textbox

	public void setUserName(String strUserName){

		user99GuruName.sendKeys(strUserName);     
	}

	//Set password in password textbox

	public void setPassword(String strPassword){

		password99Guru.sendKeys(strPassword);

	}

	//Click on login button

	public void clickLogin(){

		login.click();

	}  

	public void loginToGuru99(String strUserName,String strPasword){

		//Fill user name

		this.setUserName(strUserName);

		//Fill password

		this.setPassword(strPasword);

		//Click Login button

		this.clickLogin();           

	}

	@Test(priority=0)

	public void test_Home_Page_Appear_Correct(){

		//Create Login Page object
		SampleTest objLogin;
		objLogin = new SampleTest();

		//login to application

		objLogin.loginToGuru99("mgr123", "mgr!23");


	}

}
