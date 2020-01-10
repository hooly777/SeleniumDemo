package Trash;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qa.basetest.BaseTest;

public class Testcase extends BaseTest{
	
	/*public Testcase()
	{
		BaseTest test = new BaseTest();
	}
*/	String abspath = System.getProperty("user.dir");
/*	@DataProvider(name = "TC001")
	public Object[] getData() throws Exception{
		ReadExcel excel = new ReadExcel();
		Object[] testObjArray = excel.getExcelData(abspath+"\\Excelfile\\TestData.xlsx","Sheet1");
		System.out.println(testObjArray);
	     return testObjArray;
	     
		}*/
	
	@DataProvider(name="TC001")
	public Object[][] getDataFromDataprovider(){

	    return new Object[][] {

	            {"Hyderabad"},
	            {"Chennai"},
	            {"Bangalore"}

	            };
	}
	
	
}
