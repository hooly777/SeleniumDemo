package com.qa.test;

import java.io.IOException;
import java.util.List;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.Utility.ExcellUtility;
import com.qa.basetest.BaseTest;
import com.qa.pages.AlliantLandingPage;

public class LandingPageScript extends BaseTest {

	@Test(priority=1)
	public void LandingPageScroll() throws InvalidFormatException, IOException{
		AlliantLandingPage ALP = new AlliantLandingPage(driver);
		ExcellUtility ExcelUti = new ExcellUtility();
		ALP.scrollToBottomPage();
		String BankLinkText = ALP.BankElement().getText();
		String BorrowLinkText = ALP.BorrowElement().getText();
		String InvestLinkText = ALP.InvestElement().getText();
		String ProtectLinkText = ALP.ProtectElement().getText();
		
		ExcelUti.setExcelData("HoolyExcel.xlsx", "sheet1", 0, 0, BankLinkText);
		ExcelUti.setExcelData("HoolyExcel.xlsx", "sheet1", 1, 0, BorrowLinkText);
		ExcelUti.setExcelData("HoolyExcel.xlsx", "sheet1", 2, 0, InvestLinkText);
		ExcelUti.setExcelData("HoolyExcel.xlsx", "sheet1", 3, 0, ProtectLinkText);
		//System.out.println(ALP.BorrowElement().getText());
		
		
		List<WebElement> element=ALP.getList();
		
		for(int i=0;i<element.size();i++)
		{
			System.out.println(element.get(i).getText());

			ExcelUti.setExcelData("HoolyExcel.xlsx", "sheet1", i, 0, element.get(i).getText());
			ExcelUti.setExcelData(fileName, sheetName, rowNum, colNum, data);
		}
	}
}
