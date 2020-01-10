package com.qa.test;
import org.testng.annotations.Test;
import com.qa.pages.NOPHome;
import com.qa.pages.NOPCellPhones;
import com.qa.pages.NOPCellPhoneSelection;
import com.qa.pages.NOPJewellry;
import com.qa.pages.NOPShoppingCart;
import com.qa.basetest.BaseTest;
public class NOPTestCase extends BaseTest
{
	     public NOPHome home;
	     public NOPCellPhones cellphones;
	     public NOPCellPhoneSelection selectcellphones;
	     public NOPJewellry selectjewellry;
	     public NOPShoppingCart shoppingcart;
         @Test(priority=1)
         public void mouseOverToElectronics()
         {
        	 home=new NOPHome(driver);
        	 home.mouseOverToElectronics();
         }
         @Test(priority=2)
         public void clickCellPhones()
         {
        	 cellphones=new NOPCellPhones(driver);
        	 cellphones.clickCellPhones();
         }   
         @Test(priority=3)
         public void selectCellPhones() throws InterruptedException
         {
        	 selectcellphones=new NOPCellPhoneSelection(driver);
        	 selectcellphones.selectDropDownOption();
        	 selectcellphones.addTwoMobiles();
         }
         @Test(priority=4)
         public void clickJewellryLink() throws InterruptedException
         {
        	 selectcellphones=new NOPCellPhoneSelection(driver);
        	 selectcellphones.clickJewellryLink();
         }
         @Test(priority=5)
         public void selectJewellry() throws InterruptedException
         {
        	 selectjewellry=new NOPJewellry(driver);
        	 selectjewellry.selectJewellry();
        	 selectjewellry.clickAddJewellryButton();
        	 selectjewellry.verifyNotification();
        	 selectjewellry.closeNotification();
        	 selectjewellry.mouseOverShopping();
        	 selectjewellry.clickGoButton();
         }
         @Test(priority=6)
         public void performOperations() throws InterruptedException
         {
        	 shoppingcart=new NOPShoppingCart(driver);
        	 shoppingcart.performOperations();
         }
         
}
