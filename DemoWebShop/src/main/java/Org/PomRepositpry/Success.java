package Org.PomRepositpry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Success {
	@FindBy(xpath = "//h1[text() ='Thank you']") private WebElement successmsg;
	
	public  Success(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}

	public WebElement getSuccess() {
		return successmsg;
	}

}
