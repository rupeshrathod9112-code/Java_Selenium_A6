 package Org.PomRepositpry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BAsePage {
	
	//Declaration
	
	@FindBy(linkText = "Register") private WebElement registerLink;
	@FindBy(linkText = "Log in") private WebElement loginLink;
	@FindBy(xpath = "//span[text()='Shopping cart']") private WebElement soppingCart;
	@FindBy(xpath = "//span[text()='Wishlish']") private WebElement wishListLink;
	@FindBy(partialLinkText = "BOOKS") private WebElement booksLinks;
	@FindBy(partialLinkText = "COMPUTERS") private WebElement computerLink;
	@FindBy(partialLinkText = "ELECTRONICS") private WebElement electronicLink;
	@FindBy(linkText  ="Log out") private WebElement logOutLink;
	
	public WebElement getLogOutLink() {
		return logOutLink;
	}


	// Initialization
	public BAsePage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}


	//Utilization
	
	public WebElement getRegisterLink() {
		return registerLink;
	}


	public WebElement getLoginLink() {
		return loginLink;
	}


	public WebElement getShoppingCart() {
		return soppingCart;
	}


	public WebElement getWishListLink() {
		return wishListLink;
	}


	public WebElement getBooksLinks() {
		return booksLinks;
	}


	public WebElement getComputerLink() {
		return computerLink;
	}


	public WebElement getElectronicLink() {
		return electronicLink;
	}
	
	
	
	

}
