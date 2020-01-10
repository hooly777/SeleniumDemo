package Trash;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.qa.Utility.Webgenericutility;
import com.qa.basetest.BaseTest;

public class NoCommMainPage extends BaseTest {
	
	Webgenericutility webutility= new Webgenericutility();
	
	public NoCommMainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/electronics']")
	 WebElement hoverElement;
			
	@FindBy(xpath = "//a[contains(@text,'Electronics']")
	 WebElement ElecElement;
	
	
	public String getHomePageTitle() {		
		return driver.getTitle();		
	}
	
	
  @Test
  public void ElectronicsHover() throws IOException {
	  
	  Actions action = new Actions(driver);
	  WebElement hoverElement = driver.findElement(By.xpath("//a[@href='/electronics']"));
	  action.moveToElement(hoverElement).moveToElement(driver.findElement(By.xpath("//a[@href='/electronics']"))).click().build().perform();
  }
  
  public void SelectElectronics() throws IOException{
	  String ElecElement =  driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")).getText();
	  System.out.println("Selected Electronics "+ ElecElement);	
	  
	  
  }
  public void clickLink(){

	  ElecElement.click();

	}
  
  /*public void DropElementSort() throws IOException{

	  System.out.println("Selected Cell Phones "+ dropdown);	

  }*/
}
