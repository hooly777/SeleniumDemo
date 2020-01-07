package com.qa.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Silampur Girish 
 * @date   06-01-2020
 * @version 1.o
 */
public class Webgenericutility {
	static WebDriver driver;

	/**
	 * @author Silampur Girish
	 * Method to select dropdown by text
	 * @param element
	 * @param text
	 */
	public static void selectDropdownByText(WebElement element, String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);		
	}

	/**
	 * @author Silampur Girish
	 * Method to select dropdown by Value
	 * @param element
	 * @param text
	 */
	public static void selectDropdownByValue(WebElement element, String text)
	{
		Select select = new Select(element);
		select.selectByValue(text);
	}
	/**
	 * @author Silampur Girish
	 * Method to select dropdown by index
	 * @param element
	 * @param num
	 */
	public static void selectDropdownByIndex(WebElement element, int  num)
	{
		Select select = new Select(element);
		select.selectByIndex(num);
	}
	/**
	 * @author Silampur Girish
	 * Method to get attribute value of the element
	 * @param element
	 * @param attribute
	 * @return String
	 */
	public static String getAttributeValue(WebElement element, String attribute)
	{
		return element.getAttribute(attribute);
	}

	/**
	 * @author Silampur Girish
	 * Method to get SelectedText value of the dropdwon
	 * @param element	 
	 * @return String
	 */
	public static String getSelectedText(WebElement element)
	{
		Select select = new Select(element);
		return select.getFirstSelectedOption().getText();
	}
	/**
	 * @author Uma Maheswari
	 * Method to Navigate url 
	 * @param url
	 */
	public static void NavigateToUrl(String url)
	{
		driver.navigate().to(url);
	}

	/**
	 * @author Lakshmi
	 * Method to take you back by one page on the browser’s history.
	 */ 
	public static void Navigateback()
	{
		driver.navigate().back();
	}
	/**
	 * @author Uma Maheswari
	 * Method to take you forward by one page on the browser’s history.
	 */ 

	public static void NavigateForward()
	{
		driver.navigate().forward();
	}

	/**
	 * @author Uma Maheswari
	 * Method to refresh the page
	 */ 

	public static void NavigateRefresh()
	{
		driver.navigate().refresh();
	}

	/**
	 * @author Uma Maheswari
	 * Method to get title of the application/page
	 * return String
	 */ 

	public static String getTitle()
	{
		return driver.getTitle();
	}

	/**
	 * @author Uma Maheswari
	 * Method to click an Element
	 * @param element
	 */

	// Method to Click Element
	public static  void ClickElement(WebElement element)
	{
		element.click();
	}

	/**
	 * @author Lakshmi
	 * Method to get text of the element
	 * @param element
	 */

	public static String getText(WebElement element)
	{
		return element.getText();
	}

	/**
	 * @author Uma Maheswari
	 * Method to send text
	 * @param element
	 * @param Text
	 */
	public static void sendText(WebElement element, String Text)
	{
		element.sendKeys(Text);
	}
	//
		/**
	 * @author Mohini Sethumadhavan
	 * Method to select any element for boolean value
	 * @param WebElement 
	 * @param elementSelect
	 */
	public   WebElement isElementSelected(WebElement elementSelect)
	{
		boolean value;
		value=elementSelect.isSelected();
		if(value==true)
		{
			System.out.println("Already Selected");

		}
		else
		{
			elementSelect.click();
			System.out.println("Selected");
		}

		return elementSelect;

	}
	/**
	 * @author Mohini Sethumadhavan
	 * Method to display any element for boolean value
	 * @param WebElement 
	 * @param elementDisplay
	 */
	public WebElement isElementDisplayed(WebElement elementDisplay)
	{
		boolean value;
		value=elementDisplay.isDisplayed();
		if(value==true)
		{
			System.out.println("Already Selected");

		}
		else
		{
			elementDisplay.click();
			System.out.println("Selected");
		}
		return elementDisplay;

	}
	/**
	 * @author Mohini Sethumadhavan
	 * Method to enable any element for boolean value
	 * @param WebElement 
	 * @param elementEnable
	 */
	public WebElement isElementEnabled(WebElement elementEnable)
	{
		boolean value;
		value=elementEnable.isEnabled();
		if(value==true)
		{
			System.out.println("Already Enabled");

		}
		else
		{
			elementEnable.click();
			System.out.println("Enabled");
		}
		return elementEnable;

	}
	/**
	 * @author Mohini Sethumadhavan
	 * Method to wait till page is loaded
	 * @param i 
	 * @param 
	 */
	public WebElement waitTillPageLoad(int i)
	{
		driver.manage().timeouts().pageLoadTimeout(i, TimeUnit.SECONDS);
		return null;

	}
	/**
	 * @author Mohini Sethumadhavan
	 * Method to check if the given element is selected
	 * @param WebElement 
	 * @param waitExpectedException
	 */
	public WebElement waitExpectedConditions(WebElement waitExpectedException, int seconds)
	{
		WebDriverWait wait=new WebDriverWait(driver,seconds);

		wait.until(ExpectedConditions.elementToBeSelected(waitExpectedException));
		return waitExpectedException;

	}
	/**
	 * @author Mohini Sethumadhavan
	 * Method to check an element is visible and enabled to click on it.
	 * @param WebElement 
	 * @param waitExpectedException
	 */

	public WebElement waitForElement(WebElement elementWait, int seconds) {

		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.elementToBeClickable(elementWait));
		return elementWait;
	}
	/**
	 * @author Mohini Sethumadhavan
	 * Method to check an element to be invisible
	 * @param WebElement 
	 * @param waitExpectedException
	 */

	public WebElement waitTillElementFound(WebElement ElementTobeFound,
			int seconds) 
	{
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(ElementTobeFound));
		return ElementTobeFound;
	}
	/**
	 * @author Mohini Sethumadhavan
	 * Method to check whether the given frame is available to switch to.
	 * @param WebElement 
	 * @param waitExpectedException
	 */
	public WebElement waitframeToBeAvailableAndSwitchToIt(WebElement frameLocator,
			int seconds) 
	{
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
		return frameLocator;
	}
	/**
	 * @author Mohini Sethumadhavan
	 * Method to switch back to original page 
	 * @param WebElement  
	 * @param 
	 */

	public WebElement switchToParentWindow() {
		driver.switchTo().defaultContent();
		return null;
	}
	/**
	 * @author Mohini Sethumadhavan
	 * Method to switch frame 
	 * @param WebElement  
	 * @param 
	 */	
	public WebElement switchToFrame(WebElement iframeElement) {
		driver.switchTo().frame(iframeElement);
		return iframeElement;
	}




}
