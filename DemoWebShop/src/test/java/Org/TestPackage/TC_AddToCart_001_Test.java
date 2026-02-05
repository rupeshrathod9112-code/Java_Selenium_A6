package Org.TestPackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Org.GenericLibrary.BaseTest;
import Org.PomRepositpry.BAsePage;
import Org.PomRepositpry.CellPhonePage;
import Org.PomRepositpry.ElectronicsPage;

@Listeners(Org.GenericLibrary.MyListener.class)
public class TC_AddToCart_001_Test extends BaseTest {

	@Test
	public void addTocart()
	{
		BAsePage basePage = new BAsePage(driver);
		basePage.getElectronicLink().click();
		
		ElectronicsPage elec = new ElectronicsPage(driver);
		elec.getCellPhoneLink().click();
		CellPhonePage cellPhone = new CellPhonePage(driver);
		cellPhone.getAddtoCartButton().click();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(cellPhone.getProductaddedtocart().isDisplayed(), true, "Rpoduct added to cart");
		
		sa.assertAll();
		
		
	}

}  
