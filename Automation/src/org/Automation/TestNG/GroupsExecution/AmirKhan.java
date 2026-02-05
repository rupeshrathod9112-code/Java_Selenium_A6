package org.Automation.TestNG.GroupsExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AmirKhan 
{
	@Test(groups = {"Hindi", "PanIndia", "Bollywood"})
	public void LaunchAmir()
	{
		Reporter.log("Amirkhan wiki launch");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Aamir_Khan");
	}
}
