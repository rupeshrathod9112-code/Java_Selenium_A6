package ModularFramework_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class SelectUtility
{
	//Too Select An Option By Its Visible Text
	public void selectByVisibleTextMethod(WebElement DropDownElement, String visibleText)
	{
		Select sel = new Select(DropDownElement);
		sel.selectByVisibleText(visibleText);
	}
}
