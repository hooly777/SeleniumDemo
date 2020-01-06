package com.qa.util;

/**
 * @author Silampur Girish 
 * @date   06-01-2020
 * @version 1.o
 */
public class genericutility {
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
		
		
		int i=20;
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



}
