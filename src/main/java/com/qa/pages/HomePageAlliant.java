package com.qa.pages;

import java.io.IOException;
import java.util.List;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Resource.WriteExcel;
import com.qa.Utility.ExcellUtility;
import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;





public class HomePageAlliant extends BaseTest {

	public HomePageAlliant(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Accounts']")
	public WebElement accountsSec;
	@FindBy(xpath = "//*[@id='footer-main-nav']/div/ul/li/a")
	public WebElement BankBtn;
	@FindBy(xpath = "//*[@id']/div[1]/ul/li[2]/a")
	public WebElement bankBtn;
	 String accountSecXpath = "//*[@id='footer-main-nav']/div[1]";
	String bankSecXpath = "//*[@id='products']/li/div";
	
	@FindBy(xpath="//h5")
	WebElement accounts;
	


	public void scrollToAccounts() throws Exception {
		Webgenericutility.scrolltoElement(accountsSec);
		
	}

	
	
	//public void writeAccountsSections() throws Exception {
	//List<WebElement> accs=driver.findElements(By.xpath("//h5"));
	//	for (int i=0;i<accs.size();i++){
	//	String text=accs.get(i).getText();
		//String acc=accounts.getText();
		//ExcellUtility excel=new ExcellUtility();
		//excel.setExcelData("AllianzData.xlsx", "Sheet1", i, 0,text );
		
	//}
	//}

public void writeAccountData() throws InvalidFormatException, IOException{
	WebElement bank = driver.findElement(By.xpath("//li[@class='first']/a[text()='Bank']"));
	String text = bank.getText();
	ExcellUtility excel=new ExcellUtility();
	excel.setExcelData("AllianzData.xlsx", "Sheet1", 0, 1,text );
}
}
