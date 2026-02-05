package ModularFramework_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage 
{
	//declaration
	@FindBy(linkText = "Register") 
	private WebElement registerlink;
	
	@FindBy(linkText = "Log in") 
	private WebElement loginlink;
	
	@FindBy(xpath = "//span[text()='Shopping cart']") 
	private WebElement shoppingcartlink;
	
	@FindBy(xpath = "//span[text()='Wishlist']") 
	private WebElement wishlistlink;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement bookslink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computerslink;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicslink;
	
	@FindBy(linkText = "Log out") 
	private WebElement Logoutlink;
	
	//initialization
	public Welcomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getShoppingcartlink() {
		return shoppingcartlink;
	}

	public WebElement getWishlistlink() {
		return wishlistlink;
	}

	public WebElement getBookslink() {
		return bookslink;
	}

	public WebElement getComputerslink() {
		return computerslink;
	}

	public WebElement getElectronicslink() {
		return electronicslink;
	}

	public WebElement getLogoutlink() {
		return Logoutlink;
	}
	
}
