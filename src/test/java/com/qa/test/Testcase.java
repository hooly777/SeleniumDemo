package com.qa.test;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
<<<<<<< HEAD
import org.testng.annotations.Test;

import com.qa.Resource.ReadExcel;
import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;
import com.qa.pages.SampleTest;

public class Testcase  extends  BaseTest{
	



=======
import com.qa.pages.SampleTest;
import com.qa.basetest.BaseTest;

public class Testcase extends BaseTest {
	 
	Logger log = Logger.getLogger("devpinoyLogger");

	@Test
	public void LoginDemoGuru() throws IOException
	{
		ArrayList<String> data=SampleTest.dataReading("user3");	
		SampleTest objLogin;
		objLogin = new SampleTest();
		objLogin.loginToGuru99(data.get(1), data.get(2));
		log.info("Login page opened by using excel inputs");
		driver.switchTo().alert().accept();
		log.debug("Accepting the popup message");
	}

	@Test(priority=1)
	public void InsurancePage(){

		SampleTest objLogin2;
		objLogin2 = new SampleTest();
		objLogin2.clickLink();
		log.info("Insurance page triggered after Login");
	}
	
>>>>>>> bf2f49c491bf9f118e431b80eadc117abca586f3
}