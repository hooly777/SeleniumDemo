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

public class NoCommerceMainPage extends BaseTest {
	
	Webgenericutility webutility= new Webgenericutility();
	
	public NoCommerceMainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Hovering to electronics
	@FindBy(xpath="//a[@href='/electronics']")
	 WebElement hoverElement;
	//Select electronics
	@FindBy(xpath = "//a[contains(@text,'Electronics']")
	 WebElement ElecElement;
	
	//Select Cell phone
	@FindBy(xpath="//span[@class='Cell phones')][last()")
	WebElement selectElement;
	//Sorting to filter
	@FindBy(id="products-orderby") 
	WebElement SortElement;
	//Click the selection
	@FindBy(xpath="//option[@class='Price: Low to High')]")
	WebElement selectLink;
	//Select element to add1
	@FindBy(xpath="//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
	WebElement ProdClick1;
	//Select element to add2
	@FindBy(xpath="//div[@class='page-body']//div[2]//div[1]//div[2]//div[3]//div[2]//input[1]")
	WebElement ProdClick2;
	
	
	
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
  public void ElecElement(){

	  ElecElement.click();

	}
  public void ProdClick1(){

	  ProdClick1.click();

	} 
  public void ProdClick2(){

		ProdClick2.click();

    }
  public void selectLink()
  {
	  selectLink.click();
  }
  
  
  public void CellPhonePage() throws IOException{
		 Select dropdown=new Select(selectElement);
		 String selectElement =  driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Cell phones')]")).getText();
	     dropdown.selectByVisibleText("Cell Phones");
	  //   selectElement.click();
		  System.out.println("Selected Cell Phones "+ dropdown);	
	  }
	  
  public void CellPhoneMainPage() throws IOException, InterruptedException{
	 
	 Select dropdown=new Select(SortElement);
	 String selectDrop1 =  driver.findElement(By.xpath("//a[contains(@text,'Cell phones']")).getText();

	  dropdown.selectByVisibleText("Price: Low to High");
	  selectLink.click();
	  ProdClick1.click();
	  Thread.sleep(3000);
	  ProdClick2.click();	// driver.navigate().to("https://demo.nopcommerce.com/cart");
	//  String selElement=driver.findElement(By.xpath("//h1[contains(text(),'Shopping cart')]")).getText();
		  

  }

  /*public void DropElementSort() throws IOException{

	  System.out.println("Selected Cell Phones "+ dropdown);	

  }*/
}
