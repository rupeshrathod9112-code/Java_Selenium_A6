package Org.TestPackage;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Org.GenericLibrary.BaseTest;
import Org.PomRepositpry.BAsePage;
import Org.PomRepositpry.CellPhonePage;
import Org.PomRepositpry.ElectronicsPage;
import Org.PomRepositpry.ShoppingCartPage;

@Listeners(Org.GenericLibrary.MyListener.class)
public class TC_RemoveProductFromCart_002_Test extends BaseTest
{
	@Test
	public void removeproduct() throws InterruptedException
	{
		BAsePage wp = new BAsePage(driver);
		wp.getElectronicLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		
		CellPhonePage clph = new CellPhonePage(driver);
		clph.getAddtoCartButton().click();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(clph.getProductaddedtocart().isDisplayed(), true, "Rpoduct added to cart");
		
		wp.getShoppingCart().click();
		
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		scp.removeSmartPhonefromcart();
		
		try
		{
			if(scp.getSmartphonecartItem().isDisplayed())
			{
				Reporter.log("Product is not removed from cart!");
			}
		}
		catch(Exception e)
		{
			Reporter.log("Product is removed from cart!");
		}
	}

}
