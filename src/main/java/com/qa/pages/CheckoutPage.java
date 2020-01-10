package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.qa.basetest.BaseTest;

public class CheckoutPage extends BaseTest {
	
	Select select;
	
	@FindBy(id="BillingNewAddress_FirstName")
	private WebElement firstName;
	
	@FindBy(id="BillingNewAddress_LastName")
	private WebElement lasttName;
	
	@FindBy(id="BillingNewAddress_Email")
	private WebElement emailID;
	
	@FindBy(name="BillingNewAddress.Company")
	private WebElement company;
	
	@FindBy(id="BillingNewAddress_CountryId")
	private WebElement selectCountry;
	
		
	@FindBy(name="BillingNewAddress.StateProvinceId")
	private WebElement selectState;
		
	@FindBy(id="BillingNewAddress_City")
	private WebElement city;
	
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement address1;
	
	@FindBy(id="BillingNewAddress_Address2")
	private WebElement address2;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private WebElement zipcode;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement phoneNumber;
	
	@FindBy(id="BillingNewAddress_FaxNumber")
	private WebElement faxNumber;
	
	@FindBy(id="billing-buttons-container")
	private WebElement ctnBtn;
	
	public void  clickContinue()
	{
		ctnBtn.click();
	}
	
	public CheckoutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void First_Name()
	{
		firstName.sendKeys("Akshata");
	}
	
	public void Last_Name()
	{
		lasttName.sendKeys("T");
	}
	
	public void Email()
	{
		emailID.sendKeys("akshatallalli@gmail.com");
	}
	
	public void Company()
	{
		company.sendKeys("xyz");
	}
	
	public void Country() throws InterruptedException
	{
		select =new Select(selectCountry);
		select.selectByVisibleText("India");
		Thread.sleep(3000);
	}
	
	public void City() throws InterruptedException
	{
		Thread.sleep(3000);
		city.sendKeys("Gulbarga");
	}
	
	public void Address1() throws InterruptedException
	{
		Thread.sleep(3000);
		address1.sendKeys("Akshata, Bangalore");
	}
	
	public void Address2() throws InterruptedException
	{
		Thread.sleep(3000);
		address2.sendKeys("Akshata, Gulbarga");
	}
	
	public void ZipCode() throws InterruptedException
	{
		Thread.sleep(3000);
		zipcode.sendKeys("585 105");
	}
	
	public void Phone_n0()
	{
		phoneNumber.sendKeys("9912345678");
	}
	
	public void Fax_Number()
	{
		faxNumber.sendKeys("123456");
	}
	
	public void fillUserDetails() throws InterruptedException
	{
		First_Name();
		Last_Name();
		Email();
		Company();
		Country();
		City();
		Address1();
		Address2();
		ZipCode();
		 Phone_n0();
		 Fax_Number();
		 clickContinue();
	}
	
	@Test
	public void CheckoutOrderDetails() throws InterruptedException
	{
		CheckoutPage cop=new CheckoutPage();
		Thread.sleep(3000);
		cop.fillUserDetails();
		
	}
}
