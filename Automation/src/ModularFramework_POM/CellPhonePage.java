package ModularFramework_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonePage 
{
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input") private WebElement cellphoneAddtoCartButton;
	@FindBy(xpath = "//a[text()='Phone Cover']/../..//input") private WebElement PhonecoverButton;
	@FindBy(xpath = "//a[text()='Smartphone']") private WebElement cellphonelink;
	@FindBy(xpath = "//a[text()='Phone Cover']") private WebElement Phonecoverlink;
	@FindBy(xpath = "//p[text()='The product has been added to your ']") private WebElement productaddedtocart;
	
	public CellPhonePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCellphoneAddtoCartButton() {
		return cellphoneAddtoCartButton;
	}

	public WebElement getPhonecoverButton() {
		return PhonecoverButton;
	}

	public WebElement getCellphonelink() {
		return cellphonelink;
	}

	public WebElement getPhonecoverlink() {
		return Phonecoverlink;
	}

	public WebElement getProductaddedtocart() {
		return productaddedtocart;
	}
	
	
	
	
}
