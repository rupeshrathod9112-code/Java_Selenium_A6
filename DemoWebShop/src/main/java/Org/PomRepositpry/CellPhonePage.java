package Org.PomRepositpry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonePage {
@FindBy(xpath = "//a[text() ='Smartphone']") private WebElement smartPhoneLink;
@FindBy(xpath = "//a[text() ='Smartphone']/../..//input[@value='Add to cart']") private WebElement addtoCartButton;
@FindBy(xpath = "//p[text()='The product has been added to your ']") private WebElement productaddedtocart;
//Initialization
public CellPhonePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

public WebElement getProductaddedtocart() {
	return productaddedtocart;
}

//Utilization
public WebElement getSmartPhoneLink() {
	return smartPhoneLink;
}

public WebElement getAddtoCartButton() {
	return addtoCartButton;
}

}
