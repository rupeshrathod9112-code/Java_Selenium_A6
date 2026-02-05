package ModularFramework_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class  successfullPage
	{
		@FindBy(xpath = "//strong[contains(text(),'successfully')]")
		private WebElement successmsg;
		
		public successfullPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		public WebElement getSuccessmsg() {
			return successmsg;
		}
		
		
	}
