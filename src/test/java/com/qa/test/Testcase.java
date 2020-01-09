package com.qa.test;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

import com.qa.Resource.ReadExcel;
import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;
import com.qa.pages.SampleTest;

import com.qa.pages.SampleTest;
import com.qa.basetest.BaseTest;
public class Testcase  extends  BaseTest{

<<<<<<< HEAD
public class Testcase extends BaseTest{
	
	 public SampleTest objLogin;
	 Logger log = Logger.getLogger("devpinoyLogger");	 	
=======
	 
	Logger log = Logger.getLogger("devpinoyLogger");
>>>>>>> 8aa8720e6ee37ef8f94ffb1c79d1e48b8c5cc512

	@Test
	public void LoginDemoGuru() throws IOException
	{
		SampleTest objLogin;
		objLogin=new SampleTest();		
		ArrayList<String> data=SampleTest.dataReading("user3");	
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		objLogin.loginToGuru99(data.get(1), data.get(2));
		log.info("Login page opened by using excel inputs");
		driver.switchTo().alert().accept();
		log.debug("Accepting the popup message");
	}

	@Test(priority=1)
	public void InsurancePage(){

		//SampleTest objLogin2;
		objLogin = new SampleTest();
		objLogin.clickLink();
		log.info("Insurance page triggered after Login");
	}
	

}