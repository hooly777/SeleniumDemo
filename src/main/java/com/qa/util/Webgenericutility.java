package com.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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



}
