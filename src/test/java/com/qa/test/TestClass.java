package com.qa.test;


import java.io.IOException;
import org.testng.annotations.Test;
import com.qa.basetest.BaseTest;
import com.qa.pages.AddToCart;
import com.qa.pages.CellPhone;
import com.qa.pages.Home_Page;
import com.qa.pages.Jewelry_Selection;



public class TestClass  extends  BaseTest{

public Home_Page HomePageVerify;
public CellPhone Cellphoneselection;
public Jewelry_Selection Jewelry;
public AddToCart addcart;

@Test
public void ValidateCellphonePage() throws IOException, InterruptedException
{
//validate the title of cellphone page
 
	HomePageVerify = new Home_Page();
	HomePageVerify.ValidateCellphonePage();
	HomePageVerify.moveToElectronics();
	HomePageVerify.clickOnCellPhones();
	Cellphoneselection=new CellPhone(); 
	Cellphoneselection.sortLowToHigh();
	Cellphoneselection.AddToCart();
	Jewelry=new Jewelry_Selection();
	Jewelry.JewelryClick();
	Jewelry.SelectHighestPriceJewelry();
	Jewelry.AddToCart();
	addcart= new AddToCart();
	addcart.GoToCart();
	addcart.UpdateJewelryCount();
//	addcart.UpdateJewelryCount();
	
	
	


}


}

