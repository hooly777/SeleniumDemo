package com.qa.pages;


import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Resource.ReadExcel;
import com.qa.basetest.BaseTest;

public class SampleTest extends BaseTest {

	

	@FindBy(name="uid")

	WebElement user99GuruName;

	@FindBy(name="password")

	WebElement password99Guru;


	@FindBy(name="btnLogin")

	WebElement login;

	@FindBy(xpath="//a[@href='http://demo.guru99.com/insurance/v1/index.php']")

	WebElement clicklink;

	@FindBy(xpath="//a[@href='http://demo.guru99.com/insurancedex.php']")

	WebElement clicklink2;
	
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

	public void clickLink(){

		clicklink.click();

	}

	public void clickLink2(){

		clicklink2.click();

	}

	public void loginToGuru99(String strUserName,String strPasword){

		//Fill user name

		this.setUserName(strUserName);

		//Fill password

		this.setPassword(strPasword);

		//Click Login button

		this.clickLogin();           

	}
	
	
	

	@Test(priority = 0,dataProvider="RowXLSX")

	public void test_Home_Page_Appear_Correct(String uname,String pswrd) throws Exception {

		//Create Login Page object
		SampleTest objLogin;
		objLogin = new SampleTest();

		//login to application

		
		objLogin.loginToGuru99(uname, pswrd);
		driver.switchTo().alert().accept();
      
		//re.getData("TC_003",System.getProperty("user.dir")+"\\ExportExcel\\WriteData.xlsx");


	}

	
	
@DataProvider(name="getrowdata")
	public static ArrayList<String> dataReading(String userID) throws IOException
	{
		ReadExcel read=new ReadExcel();
		ArrayList<String> arr=read.getData(userID,System.getProperty("user.dir")+"\\ExportExcel\\WriteData.xlsx");
		System.out.println(arr);
		
		SampleTest objLogin;
		objLogin = new SampleTest();
		
		//objLogin.loginToGuru99(arr.get(1), arr.get(2));
		//driver.switchTo().alert().accept();
		
		
		return arr;
		
		
		
	}

@Test

public  void LoginwithParticularusecase() throws IOException
{
	ArrayList<String> data=SampleTest.dataReading("user3");	
	SampleTest objLogin;
	objLogin = new SampleTest();	
	objLogin.loginToGuru99(data.get(1), data.get(2));
	driver.switchTo().alert().accept();

}

	@Test(priority=1)

	public void Insurance(){

		SampleTest objLogin2;
		objLogin2 = new SampleTest();
		objLogin2.clickLink();

	}


	@Test(priority=2)

	public void test_Home_Page_Appear_wrong(){

		SampleTest objLogin2;
		objLogin2 = new SampleTest();

		objLogin2.clickLink2();

	}
}
