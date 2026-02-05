package ModularFramework_POM;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_AddToCart_001_Test extends BaseTest
{
	@Test
	public void AddtoCartMethod() 
	{
		Welcomepage wp = new Welcomepage(driver);
		wp.getElectronicslink().click();
		
		ElectrinicsPage ep = new ElectrinicsPage(driver);
		ep.getCellphonelink().click();
		
		CellPhonePage clph = new CellPhonePage(driver);
		clph.getCellphoneAddtoCartButton().click();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(clph.getProductaddedtocart().isDisplayed(), true, "Rpoduct added to cart");
		
		sa.assertAll();
		
		
	}
	
}
