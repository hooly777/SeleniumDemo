package com.qa.test;

import java.io.IOException;

import javax.swing.Spring;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.Utility.ExcellUtility;
import com.qa.basetest.BaseTest;
import com.qa.pages.Allianthomepage;

public class Testcase extends BaseTest {
	 

	
	@Test(priority=1)
	public void Homepagenavigation() throws InvalidFormatException, IOException{		
	
	Allianthomepage AHP=new Allianthomepage(driver);
	ExcellUtility Excelinput=new ExcellUtility();
	AHP.scrolldown();	
	String value1=AHP.bankelement().getText();
	String value2=AHP.BorrowElement().getText();
	String value3=AHP.InvestElement().getText();
	String value4=AHP.ProtectElement().getText();
	System.out.println(AHP.bankelement().getText());
	System.out.println(AHP.BorrowElement());
	Excelinput.setExcelData("RaviAppdata.xlsx", "Sheet1",0,0,value1);
	Excelinput.setExcelData("RaviAppdata.xlsx", "Sheet1",1,0,value2);
	Excelinput.setExcelData("RaviAppdata.xlsx", "Sheet1",2,0,value3);
	Excelinput.setExcelData("RaviAppdata.xlsx", "Sheet1",3,0,value4);
	
	List<WebElement> Elements=AHP.
	
	int noofrows=AHP.getlistfirstcol().size();
	System.out.println(noofrows);
	
	}
		
	}
