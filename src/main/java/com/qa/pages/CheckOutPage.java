package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.basetest.BaseTest;

public class CheckOutPage extends BaseTest {
//Constructor
	public CheckOutPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement for CheckOut Page label
	@FindBy(xpath="//h1[contains(text(),'Welcome, Please Sign In!')]")
	WebElement CheckoutPageHeading;
	
	public WebElement CheckoutPageHeadingElement(){
		return CheckoutPageHeading;
	}

	//WebElement for CHECKOUT AS GUEST Button
	@FindBy(xpath="//input[@class='button-1 checkout-as-guest-button']")
	WebElement CheckoutAsGuestBtn;
	
	public WebElement CheckoutAsGuestBtnElement(){
		return CheckoutAsGuestBtn;
	}
	
	//WebElement for Firstname input box
		@FindBy(xpath="//input[@id='BillingNewAddress_FirstName']")
		WebElement FirstNameInputBox;
		
		public WebElement FirstNameInputBoxElement(){
			return FirstNameInputBox;
		}
	
		//WebElement for Lastname input box
		@FindBy(xpath="//input[@id='BillingNewAddress_LastName']")
		WebElement LastNameInputBox;
		
		public WebElement LastNameInputBoxElement(){
			return LastNameInputBox;
		}

		//WebElement for Email input box
		@FindBy(xpath="//input[@id='BillingNewAddress_Email']")
		WebElement EmailInputBox;
		
		public WebElement EmailBoxElement(){
			return EmailInputBox;
		}
		
		//WebElement for Company input box
		@FindBy(xpath="//input[@id='BillingNewAddress_Company']")
		WebElement CompanyInputBox;
		
		public WebElement CompanyInputBoxElement(){
			return CompanyInputBox;
		}
		
		//WebElement for Country input box
		@FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
		WebElement CountryBox;
		public WebElement CountryBoxElement(){
			return CountryBox;
		}
		public void SelectCountry(){
			Select CountryName = new Select(CountryBox);
			CountryName.selectByVisibleText("India");
		}
		
		//WebElement for State input box
		@FindBy(xpath="//input[@class='button-1 checkout-as-guest-button']")
		WebElement StateInputBox;
		
		public WebElement StateInputBoxElement(){
			return StateInputBox;
		}
		
		//WebElement for City input box
		@FindBy(id="BillingNewAddress_City")
		WebElement CityInputBox;
		
		public WebElement CityBoxElement(){
			return CityInputBox;
		}
		
		//WebElement for Address1 input box
		@FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
		WebElement Address1InputBox;
		
		public WebElement Address1InputBoxElement(){
			return Address1InputBox;
		}

		//WebElement for Address2 input box
		@FindBy(xpath="//input[@id='BillingNewAddress_Address2']")
		WebElement Address2InputBox;
		
		public WebElement Address2InputBoxElement(){
			return Address2InputBox;
		}

		//WebElement for Zip/Postal code input box
		@FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
		WebElement ZipInputBox;
		
		public WebElement ZipInputBoxElement(){
			return ZipInputBox;
		}
		
		//WebElement for phone number code input box
		@FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
		WebElement PhoneInputBox;
		
		public WebElement PhoneInputBoxElement(){
			return PhoneInputBox;
		}
		
		//WebElement for Fax number code input box
		@FindBy(xpath="//input[@id='BillingNewAddress_FaxNumber']")
		WebElement FaxInputBox;
		
		public WebElement FaxInputBoxElement(){
			return FaxInputBox;
		}
		
		//WebElement for Continue button
		@FindBy(xpath="//*[@id=\"billing-buttons-container\"]/input")
		WebElement ContinueBtn;
		
		public WebElement ContinueBtnElement(){
			return ContinueBtn;
		}
}
