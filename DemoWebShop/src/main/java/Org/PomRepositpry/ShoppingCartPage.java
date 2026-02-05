package Org.PomRepositpry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage 
{

	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@name='removefromcart']")
	private WebElement smartphonecartItem;
	
	@FindBy(name = "updatecart")
	private WebElement updateCartButton;
	
	@FindBy(name = "continueshopping")
	private WebElement continueshoppingButton;
	
	@FindBy(name = "termsofservice")
	private WebElement termsofservicesButton;
	
	@FindBy(name = "checkout")
	private WebElement checkoutButton;
	
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSmartphonecartItem() {
		return smartphonecartItem;
	}

	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}

	public WebElement getContinueshoppingButton() {
		return continueshoppingButton;
	}

	public WebElement getTermsofservicesButton() {
		return termsofservicesButton;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
	
	
	//business logic
	public void removeSmartPhonefromcart() throws InterruptedException
	{
		smartphonecartItem.click();
		Thread.sleep(1000);
		updateCartButton.click();
	}
	

}
