package SilapurGirish51750336;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

import SilapurGirish51750336.*;
import Trash.ExcellUtility;

import com.relevantcodes.extentreports.LogStatus;

public class AlliantcreditunionHomePageTest extends BaseTest {
	Webgenericutility webTestUtil= new Webgenericutility();
	ExcellUtility excellUtility = new ExcellUtility();
	
	
	@Test(priority=1)
	public void ValidatinghomePageTitle() throws Exception{
		//logger = extent.startTest(" Validating homePage Title ");
		AlliantcreditunionHomePage AlliantHome = new AlliantcreditunionHomePage(driver);		
		AlliantHome.getHomePageTitle();
	}
	
	@Test(priority=2)
	public void Validating_Alliant_HomePageSections() throws Exception{
		//logger = extent.startTest(" Writing Accounts;AboutAlliant;HelpSupport Sections into Excel ");
		AlliantcreditunionHomePage AlliantHome = new AlliantcreditunionHomePage(driver);
		Webgenericutility webTestUtil= new Webgenericutility();
		webTestUtil.scrolltoElement(AlliantHome.AllSec);
		AlliantHome.writeBottomSectionsExcel();
		
	}
  @Test(priority=3)
  public void Validating_Alliant_BankSections() throws Exception{
		//logger = extent.startTest(" Writing Bank Saving Products Sections into Excel ");
		AlliantcreditunionHomePage AlliantHome = new AlliantcreditunionHomePage(driver);
		Webgenericutility webTestUtil= new Webgenericutility();	
		//TestUtil.scrolltoElement(AlliantHome.AllSec);
		AlliantHome.writeBankSectionstoExcel();	
	}
  @Test(priority=4)
  public void ValidatingBankSections() throws Exception{
		//logger = extent.startTest("ValidatingBankSections");
		AlliantcreditunionHomePage AlliantHome = new AlliantcreditunionHomePage(driver);
		Webgenericutility webTestUtil= new Webgenericutility();	
		//TestUtil.scrolltoElement(AlliantHome.AllSec);
		AlliantHome.GetAllProductWithnames();	
	}
  
  

}
