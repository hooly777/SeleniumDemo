package com.qa.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.basetest.BaseTest;

public class LoginPageEcom extends BaseTest {

	public static void main(String[] args) throws IOException, Exception {

		driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a")).click();
		// 2.click casual dresses
		driver.findElement(By.xpath("//*[@id='categories_block_left']/div/ul/li[1]/a")).click();
		;
		// select product
		driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")).click();
		// switching control to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='fancybox-iframe']")));
		System.out.println(" iframe is identified");
		// adding to cart
		driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
		;

		String productName = driver.findElement(By.xpath("//*[@id='product_3_13_0_0']/td[2]")).getText();

		System.out.println("the description of the selected product is:" + productName);

		String availability = driver.findElement(By.xpath("//*[@id='product_3_13_0_0']/td[3]/span")).getText();
		System.out.println("Availability:" + availability);
		String totalPrice = driver.findElement(By.xpath(" //*[@id='cart_summary']/tfoot/tr[7]")).getText();
		System.out.println("TotalPrice: " + totalPrice);
		// Click proceed to checkout
		driver.findElement(By.xpath(" //*[@id='center_column']/p[2]/a[1]/span")).click();
		// 7.verify create an account and already registered sections.
		WebElement createAccount = driver.findElement(By.xpath(" //*[@id='create-account_form']"));
		WebElement signIn = driver.findElement(By.xpath(" //*[@id='login_form']"));
		if (createAccount.isDisplayed()) {
			System.out.println("---Create account section is present---");
		}
		if (signIn.isDisplayed()) {
			System.out.println("--- SignIn  section is present---");
		}
		Thread.sleep(1000);
		driver.close();
	}

}
