package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	
import com.qa.Utility.Webgenericutility;

public class HomePage {


public HomePage(WebDriver driver){
PageFactory.initElements(driver, this);
}

@FindBy(xpath="//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
private WebElement hoverElectronicsmenu;

@FindBy(xpath= "//ul[@class='top-menu notmobile']//a[contains(text(),'Cell phones')]")
private WebElement cellPhone;

private Webgenericutility utility=new Webgenericutility();

public void hoverToElectronics()
{
utility.waitTillElementFound(hoverElectronicsmenu, 3000);

utility.moveToElement(hoverElectronicsmenu);
}

public void clickOnCellPhonesLink()
{
utility.clickOn(cellPhone, 11);
}

}
