package Org.TestPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Org.GenericLibrary.BaseTest;
import Org.GenericLibrary.Flib;
import Org.PomRepositpry.BAsePage;
import Org.PomRepositpry.CellPhonePage;
import Org.PomRepositpry.Checkout;
import Org.PomRepositpry.ElectronicsPage;
import Org.PomRepositpry.ShoppingCartPage;
import Org.PomRepositpry.Success;

@Listeners(Org.GenericLibrary.MyListener.class)
public class TC_BuyProduct_003_ extends BaseTest{
	
		@Test
		public void buyProductMeThod() throws EncryptedDocumentException, IOException
		{
			BAsePage basePage = new BAsePage(driver);
			basePage.getElectronicLink().click();
			
			ElectronicsPage ep = new ElectronicsPage(driver);
			ep.getCellPhoneLink().click();
			
			CellPhonePage clph = new CellPhonePage(driver);
			clph.getAddtoCartButton().click();
			
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(clph.getProductaddedtocart().isDisplayed(), true, "Rpoduct added to cart");
			
			basePage.getShoppingCart().click();
			
			ShoppingCartPage shp = new ShoppingCartPage(driver);
			shp.getSmartphonecartItem().click();
			shp.getTermsofservicesButton().click();
			shp.getCheckoutButton().click();
			
			String city = Flib.readCellValueFromExcel(EXCEL_PATH_TEST,"Sheet1", 1, 0);
			String adress = Flib.readCellValueFromExcel(EXCEL_PATH_TEST,"Sheet1", 1, 1);
			String pincode = Flib.readCellValueFromExcelinint(EXCEL_PATH_TEST,"Sheet1", 1, 2);
			String contact = Flib.readCellValueFromExcelinint(EXCEL_PATH_TEST,"Sheet1", 1, 3);
			
			System.out.println(city);
			System.out.println(adress);
			System.out.println(pincode);
			System.out.println(contact);
			
			int rn = Flib.generateRandonNo();
			String PhoneNo = contact+rn;
			System.out.println(PhoneNo);
			
			Checkout cop = new Checkout(driver);
			cop.buyproduct(city, adress, pincode, PhoneNo);
			
		     Success sp = new Success(driver);
			
			String actualtitle = sp.getSuccess().getText();
			sa.assertEquals(actualtitle, "Your order has been successfully processed!", "Prduct has been failed to process");
			
			sa.assertAll();
		}
	}


