package com.qa.pages;


import java.io.IOException;
import java.util.List;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Utility.ExcellUtility;
import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class AlliantcreditunionHomePage extends BaseTest {
	Webgenericutility webTestUtil= new Webgenericutility();
	ExcellUtility excellUtility = new ExcellUtility();
	
	public AlliantcreditunionHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[contains(text(),'Accounts')]")
	public WebElement AllSec;
	
	@FindBy(xpath = "//*[@id='footer-main-nav']/div[1]/ul/li[1]/a")
	private WebElement BankMenu;
	@FindBy(xpath="//*[@id='footer-main-nav']/div")
	private List<WebElement> AllProductName;
	
	
	public String getHomePageTitle() {		
		return driver.getTitle();		
	}
	
	

	public void writeBottomSectionsExcel() throws Exception{	
		
		// Accounts section
		String Mainmenu =  driver.findElement(By.xpath("//h5[contains(text(),'Accounts')]")).getText();
		System.out.println("Printing footer main menu is "+ Mainmenu);		
		excellUtility.setExcelData("Appdata.xlsx","Accounts",0,0,Mainmenu);	
		
		
		String AccountsMenudata1 =  driver.findElement(By.xpath("//*[@id='footer-main-nav']/div[1]/ul/li[1]/a")).getText();
		System.out.println("Printing footer menu is " + AccountsMenudata1);		
		excellUtility.setExcelData("Appdata.xlsx","Accounts",1,0,AccountsMenudata1);
		
		String AccountsMenudata2 =  driver.findElement(By.xpath("//*[@id='footer-main-nav']/div[1]/ul/li[2]/a")).getText();
		System.out.println("Printing footer menu is " + AccountsMenudata2);		
		excellUtility.setExcelData("Appdata.xlsx","Accounts",2,0,AccountsMenudata2);
		
		String AccountsMenudata3 =  driver.findElement(By.xpath("//*[@id='footer-main-nav']/div[1]/ul/li[3]/a")).getText();
		System.out.println("Printing footer menu is " + AccountsMenudata3);		
		excellUtility.setExcelData("Appdata.xlsx","Accounts",3,0,AccountsMenudata3);
		
		String AccountsMenudata4 =  driver.findElement(By.xpath("//*[@id='footer-main-nav']/div[1]/ul/li[4]/a")).getText();
		System.out.println("Printing footer menu is " + AccountsMenudata4);		
		excellUtility.setExcelData("Appdata.xlsx","Accounts",5,0,AccountsMenudata4);
		
		String AccountsMenudata5 =  driver.findElement(By.xpath("//*[@id='footer-main-nav']/div[1]/ul/li[4]/a")).getText();
		System.out.println("Printing footer menu is " + AccountsMenudata5);		
		excellUtility.setExcelData("Appdata.xlsx","Accounts",5,1,AccountsMenudata5);
		
		
		// About Alliant section
		String Mainmenu1 =  driver.findElement(By.xpath("//h5[contains(text(),'About Alliant')]")).getText();
		System.out.println("Printing footer main menu is "+ Mainmenu1);		
		excellUtility.setExcelData("Appdata.xlsx","AboutAlliant",0,0,Mainmenu1);	
		
		
		String AboutAlliantMenudata1 =  driver.findElement(By.xpath("//*[@id='footer-main-nav']/div[2]/ul/li[1]/a")).getText();
		System.out.println("Printing footer menu is " + AboutAlliantMenudata1);		
		excellUtility.setExcelData("Appdata.xlsx","AboutAlliant",1,0,AboutAlliantMenudata1);
		
		String AboutAlliantMenudata2 =  driver.findElement(By.xpath("//*[@id='footer-main-nav']/div[2]/ul/li[2]/a")).getText();
		System.out.println("Printing footer menu is " + AboutAlliantMenudata2);		
		excellUtility.setExcelData("Appdata.xlsx","AboutAlliant",2,0,AboutAlliantMenudata2);
		
		String AboutAlliantMenudata3 =  driver.findElement(By.xpath("//*[@id='footer-main-nav']/div[2]/ul/li[3]/a")).getText();
		System.out.println("Printing footer menu is " + AboutAlliantMenudata3);		
		excellUtility.setExcelData("Appdata.xlsx","AboutAlliant",3,0,AboutAlliantMenudata3);
		
		String AboutAlliantMenudata4 =  driver.findElement(By.xpath("//*[@id='footer-main-nav']/div[2]/ul/li[4]/a")).getText();
		System.out.println("Printing footer menu is " + AboutAlliantMenudata4);		
		excellUtility.setExcelData("Appdata.xlsx","AboutAlliant",4,0,AboutAlliantMenudata4);
		
		String AboutAlliantMenudata5 =  driver.findElement(By.xpath("//*[@id='footer-main-nav']/div[2]/ul/li[5]/a")).getText();
		System.out.println("Printing footer menu is " + AboutAlliantMenudata5);		
		excellUtility.setExcelData("Appdata.xlsx","AboutAlliant",5,0,AboutAlliantMenudata5);
		
		// About Help & Support section
		
		String Mainmenu2 =  driver.findElement(By.xpath("//h5[contains(text(),'Help & Support')]")).getText();
		System.out.println("Printing footer main menu is "+ Mainmenu2);		
		excellUtility.setExcelData("Appdata.xlsx","HelpSupport",0,0,Mainmenu2);	
		
		
		String Help_Support1 =  driver.findElement(By.xpath("//*[@id='footer-main-nav']/div[3]/ul/li[1]/a")).getText();
		System.out.println("Printing footer menu is " + Help_Support1);		
		excellUtility.setExcelData("Appdata.xlsx","HelpSupport",1,0,Help_Support1);
		
		String Help_Support2 =  driver.findElement(By.xpath("//*[@id='footer-main-nav']/div[3]/ul/li[2]/a")).getText();
		System.out.println("Printing footer menu is " + Help_Support2);		
		excellUtility.setExcelData("Appdata.xlsx","HelpSupport",2,0,Help_Support2);
		
		String Help_Support3 =  driver.findElement(By.xpath("//*[@id='footer-main-nav']/div[3]/ul/li[3]/a")).getText();
		System.out.println("Printing footer menu is " + Help_Support3);		
		excellUtility.setExcelData("Appdata.xlsx","HelpSupport",3,0,Help_Support3);	
		
		}
	
	public void writeBankSectionstoExcel() throws Exception{
			webTestUtil.clickOn(driver, BankMenu, 30);
			//BankMenu.click();
			// Bank different saving products 
			String Mainmenu = driver.findElement(By.xpath("//*[@id='footer-main-nav']/div[1]/ul/li[1]/a")).getText();
			System.out.println("Printing  main menu is "+ Mainmenu);		
			excellUtility.setExcelData("Appdata.xlsx","Bank",0,0,Mainmenu);
			
			String product1 =  driver.findElement(By.xpath("//h2[contains(text(),'High-Rate Savings')]")).getText();
			System.out.println("Bank saving product is "+ product1);		
			excellUtility.setExcelData("Appdata.xlsx","Bank",1,0,product1);
			
			String product2 =  driver.findElement(By.xpath("//h2[contains(text(),'High-Rate Checking')]")).getText();
			System.out.println("Bank saving product is "+ product2);		
			excellUtility.setExcelData("Appdata.xlsx","Bank",2,0,product2);
			
			String product3 =  driver.findElement(By.xpath("//h2[(text()='Certificates')]")).getText();
			System.out.println("Bank saving product is "+ product3);		
			excellUtility.setExcelData("Appdata.xlsx","Bank",3,0,product3);
			
			String product4 =  driver.findElement(By.xpath("//h2[(text()='Kids Savings Accounts')]")).getText();
			System.out.println("Bank saving product is "+ product4);		
			excellUtility.setExcelData("Appdata.xlsx","Bank",4,0,product4);
			
			String product5 =  driver.findElement(By.xpath("//h2[(text()='Teen Checking')]")).getText();
			System.out.println("Bank saving product is "+ product5);		
			excellUtility.setExcelData("Appdata.xlsx","Bank",5,0,product5);
			
			String product6 =  driver.findElement(By.xpath("//h2[(text()='Supplemental Savings')]")).getText();
			System.out.println("Bank saving product is "+ product6);		
			excellUtility.setExcelData("Appdata.xlsx","Bank",6,0,product6);
			
			String product7 =  driver.findElement(By.xpath("//h2[(text()='Custodial Accounts')]")).getText();
			System.out.println("Bank saving product is "+ product7);		
			excellUtility.setExcelData("Appdata.xlsx","Bank",7,0,product7);	
			
		
	}
    
	public void GetAllProductWithnames() throws InvalidFormatException, IOException{
	    // take each and every tag which have a [anchor] attribute inside the list
	    List <WebElement> TotalProducCount = AllProductName;
	    // Print the size of the tags
	    int size =TotalProducCount.size();
	    System.out.println("Total Products are : "+size );
	    // now printing all anchor tag values one by one
	    for(int i=0;i<size;i++)
	    {
	    	String Productname = TotalProducCount.get(i).getText();
	        System.out.println("Product name  is "+TotalProducCount.get(i).getText());
	       // webTestUtil.setExcelData("Bank",i,1,Productname);
	    }
	}

}

