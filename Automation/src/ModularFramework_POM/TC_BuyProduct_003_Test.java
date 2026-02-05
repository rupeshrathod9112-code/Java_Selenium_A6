package ModularFramework_POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_BuyProduct_003_Test extends BaseTest 
{
	private static final String CheckOutPage = null;
	@Test
	public void buyProductMeThod() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Welcomepage wp = new Welcomepage(driver);
		wp.getElectronicslink().click();
		
		ElectrinicsPage ep = new ElectrinicsPage(driver);
		ep.getCellphonelink().click();
		
		CellPhonePage clph = new CellPhonePage(driver);
		clph.getCellphoneAddtoCartButton().click();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(clph.getProductaddedtocart().isDisplayed(), true, "poduct is not added to cart");
		
		wp.getShoppingcartlink().click();
		
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		scp.getSmartphonecartItem().click();
		scp.getTermsofservicesButton().click();
		scp.getCheckoutButton().click();
		
		String city = Flib.readCellValueFromExcel("buyproductcreds", 1, 0);
		String address1 = Flib.readCellValueFromExcel("buyproductcreds", 1, 1);
		String pinCode = Flib.getNumericCellValueMethod("buyproductcreds", 1, 2);
	    String contact = Flib.getNumericCellValueMethod("buyproductcreds", 1, 3);
	    
	    int rn = Flib.generateRandomNO();
	    String phoneNo = contact+rn;
	    
	    CheckOutPage cop = new CheckOutPage(driver);
	    cop.buyProduct(city, address1, pinCode, phoneNo);
		
	    successfullPage sp = new successfullPage(driver);
		String actualtitle = sp.getSuccessmsg().getText();
		sa.assertEquals(actualtitle, "Your order has been successfully processed!", "Prduct has been failed to process");
		
		sa.assertAll();
	}
}
