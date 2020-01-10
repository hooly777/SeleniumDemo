package com.qa.test;

import org.testng.annotations.Test;

import com.qa.basetest.BaseTest;
import com.qa.pages.CellPhonepage;
import com.qa.pages.Homepage;
import com.qa.pages.Jwellerypage;
import com.qa.pages.ShoppingCartpage;
import com.qa.pages.SignInpage;

public class Test_Cases extends BaseTest {
	public Homepage homepage;
	public CellPhonepage cellphone;
	public Jwellerypage jwelery;
	public ShoppingCartpage shopcart;
	public SignInpage signin;

	@Test(priority = 1)
	public void ElectronicBtn() throws InterruptedException {
		homepage = new Homepage(driver);
		homepage.Electronics();
	}

	@Test(priority = 2)
	public void AddCellPhone() throws InterruptedException {
		cellphone = new CellPhonepage(driver);
		cellphone.CellPhone();
	}

	@Test(priority = 3)
	public void Jewllery() throws InterruptedException {
		jwelery = new Jwellerypage(driver);
		jwelery.Jwelery();
		jwelery.ShoppingCart();
	}

	@Test(priority = 4)
	public void ShoppingCart() throws InterruptedException {
		shopcart = new ShoppingCartpage(driver);
		shopcart.ShoppingCart();
	}

	@Test(priority = 5)
	public void SignIn() throws InterruptedException {
		signin = new SignInpage(driver);
		signin.SignInPage();
	}
}
