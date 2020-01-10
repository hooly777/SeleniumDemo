package com.qa.test;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.basetest.BaseTest;
import com.qa.pages.BankLoginPage;
import com.relevantcodes.extentreports.LogStatus;

import com.qa.Utility.ExcellUtility;
import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

class loginBankTest extends BaseTest {
	@Test
	public void writingSubsectionNames() throws Exception {
		logger = extent.startTest(" check scroll down");
		// test = extent.createTest("Test Case 1", "PASSED test case");
		BankLoginPage bp = new BankLoginPage(driver);
		
		System.out.println(bp.subsectionNames());
		// Lib.writeDataToExcel(WRITE_EXCEL_PATH,accSub);
		Assert.fail();
		// getScreenshot(driver, "SubSection");

	}

}
