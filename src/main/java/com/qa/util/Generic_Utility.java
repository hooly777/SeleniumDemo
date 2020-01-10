package com.qa.util;

import org.openqa.selenium.WebElement;

import com.qa.basetest.BaseTest;

public class Generic_Utility extends BaseTest
{
	public void AddToCart(WebElement element) throws InterruptedException
	{
		element.click();
		Thread.sleep(3000);
	}
}
