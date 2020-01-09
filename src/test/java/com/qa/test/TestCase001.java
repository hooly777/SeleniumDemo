package com.qa.test;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
<<<<<<< HEAD:src/test/java/com/qa/test/TestCase001.java
=======


>>>>>>> 44e821011e52f2b574db8a525c1ee2fda9c6482d:src/test/java/com/qa/test/Testcase.java
import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.LoginPage;
import com.qa.basetest.BaseTest;

<<<<<<< HEAD:src/test/java/com/qa/test/TestCase001.java
public class TestCase001  extends  BaseTest{
=======

>>>>>>> 44e821011e52f2b574db8a525c1ee2fda9c6482d:src/test/java/com/qa/test/Testcase.java
	
	 public LoginPage objLogin;
	 Logger log = Logger.getLogger("devpinoyLogger");	 	
<<<<<<< HEAD:src/test/java/com/qa/test/TestCase001.java
=======

	 
	

>>>>>>> 44e821011e52f2b574db8a525c1ee2fda9c6482d:src/test/java/com/qa/test/Testcase.java

	@Test
	public void LoginDemoGuru() throws IOException
	{
		LoginPage objLogin;
		objLogin=new LoginPage();		
		ArrayList<String> data=LoginPage.dataReading("user3");	
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
		objLogin = new LoginPage();
		objLogin.clickLink();
		log.info("Insurance page triggered after Login");
	}
	

}