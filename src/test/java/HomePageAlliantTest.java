import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.Resource.WriteExcel;
import com.qa.Utility.ExcellUtility;
import com.qa.basetest.BaseTest;
import com.qa.pages.HomePageAlliant;

public class HomePageAlliantTest extends BaseTest {
	//HomePageAlliant homePage= new HomePageAlliant(driver);
	
	@Test(priority=0)
	public void sampletest() throws Exception{
		HomePageAlliant homePage= new HomePageAlliant(driver);
			homePage.scrollToAccounts();
	}
	@Test(priority=1)
	public void writeDataIntoExcel() throws Exception{
		HomePageAlliant homePage= new HomePageAlliant(driver);
		homePage.writeAccountData();
		
		
		
	}

}
