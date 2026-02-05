package ModularFramework_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectrinicsPage 
{
	@FindBy(partialLinkText = "Cell phones") private WebElement cellphonelink;
	@FindBy(partialLinkText = "Camera, photo") private WebElement cameraPhotoink;
	
	public ElectrinicsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCellphonelink() {
		return cellphonelink;
	}

	public WebElement getCameraPhotoink() {
		return cameraPhotoink;
	}
	
	
}
