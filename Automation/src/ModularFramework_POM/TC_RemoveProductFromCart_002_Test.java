package ModularFramework_POM;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_RemoveProductFromCart_002_Test extends BaseTest
{
	@Test
	public void removeproduct() throws InterruptedException
	{
		Welcomepage wp = new Welcomepage(driver);
		wp.getElectronicslink().click();
		
		ElectrinicsPage ep = new ElectrinicsPage(driver);
		ep.getCellphonelink().click();
		
		CellPhonePage clph = new CellPhonePage(driver);
		clph.getCellphoneAddtoCartButton().click();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(clph.getProductaddedtocart().isDisplayed(), true, "Rpoduct added to cart");
		
		wp.getShoppingcartlink().click();
		
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
