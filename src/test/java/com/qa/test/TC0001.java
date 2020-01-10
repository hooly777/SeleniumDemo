package com.qa.test;

import org.testng.annotations.Test;

import com.qa.basetest.BaseTest;
import com.qa.pages.CartPage;
import com.qa.pages.CellPhones;
import com.qa.pages.HomePage;
import com.qa.pages.JewelryPage;
import com.qa.pages.SignInPage;

public class TC0001 extends BaseTest {
	@Test(priority=0)
	public static void mouseHoverElectronics(){
		HomePage page=new HomePage();
		//BrowserIntialisation();
		page.moveToElectronics();
	}
	@Test(priority=1)
	public static void addCellPhones() {
		CellPhones cell=new CellPhones();
		cell.sortBy();
		try {
			cell.addToCart();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cell.moveToJewlery();
	}
	@Test(priority=1)
	public static void addJewelryToCart() {
		JewelryPage jewel=new JewelryPage();
		jewel.sort();
		jewel.addJewelryToCart();
		jewel.getNotificationAndClose();
		try {
			jewel.hoverOnCart();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public static void verifyCart(){
		CartPage cart=new CartPage();
		cart.verifyTotal();
		cart.modifyCart();
		cart.checkoutAndVerifyTerms();
	}
	@Test(priority=3)
	public static void OrderSuccess(){
		SignInPage sign=new SignInPage();
		sign.verifySignInPage();
		sign.checkOutAsGuest();
		try {
			sign.startFillData();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
