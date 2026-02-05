package Org.PomRepositpry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
@FindBy(partialLinkText  ="Cell phones") private WebElement cellPhoneLink;
@FindBy(partialLinkText = "Camera, photo") private WebElement cameraPhotoLink;


//Initialization
public ElectronicsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

//Utilization

public WebElement getCellPhoneLink() {
	return cellPhoneLink;
}


public WebElement getCameraPhotoLink() {
	return cameraPhotoLink;
}

}
