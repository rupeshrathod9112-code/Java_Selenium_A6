package Org.GenericLibrary;

	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

	public class SelectUtility {
		public void selectByVisibleText(WebElement element, String visibletext)
		{
			Select sel= new Select(element);
			sel.selectByVisibleText(visibletext);
			
		}

	}

