package com.qa.util;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generic_Utility {

	 WebDriver driver;
	/**
	 * @author Mohini Sethumadhavan
	 * Method to get browser driver to launch application
	 * @param WebDriver load
	 * @param driver
	 */
	public WebDriver WebDriverLoad()
	{
		String absolutepath=System.getProperty("user.dir");
		String filepath=absolutepath+"\\Drivers"+"\\chromedriver.exe";
		System.setProperty("webdriver.gecko.driver", filepath);
		ChromeDriver driver=new ChromeDriver();
		return driver;

	}
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



