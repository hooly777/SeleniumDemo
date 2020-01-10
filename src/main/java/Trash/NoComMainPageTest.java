package Trash;

import org.testng.annotations.Test;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;

public class NoComMainPageTest extends BaseTest {
	Webgenericutility webutility=new Webgenericutility();
	
	
  @Test(priority=1)
  public void ValidateNopCommerceMainPage() {
	  
	  NoCommMainPage CommerceHome=new NoCommMainPage(driver);
	  CommerceHome.getHomePageTitle();
 
  }
  @Test(priority=2)
  public void ValidateHoverElementPage() throws IOException {
	  
	  NoCommerceMainPage CommerceHome=new NoCommerceMainPage(driver);
	  Webgenericutility webutility= new Webgenericutility();
	  CommerceHome.ElectronicsHover();
	  
 
  }
  @Test(priority=3)
  public void ValidateElectronicSectionPage() throws IOException {
	  
	  NoCommerceMainPage CommerceHome=new NoCommerceMainPage(driver);
	  Webgenericutility webutility= new Webgenericutility();
	  CommerceHome.SelectElectronics();
  }
	  
  @Test(priority=4)
  public void ValidateCellPhonePage() throws IOException {
	  
	  NoCommerceMainPage CommerceHome=new NoCommerceMainPage(driver);
	  Webgenericutility webutility= new Webgenericutility();
	  
	  CommerceHome.CellPhonePage();
  }
  @Test(priority=5)
  public void ValidateCellPhoneMainPage() throws IOException, InterruptedException {
	  
	  NoCommerceMainPage CommerceHome=new NoCommerceMainPage(driver);
	  Webgenericutility webutility= new Webgenericutility();
	  CommerceHome.CellPhoneMainPage();
  }
}
