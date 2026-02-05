package org.Automation.TestNG.GroupsExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yash 
{
	@Test(groups = {"Kannada", "PanIndia", "Tollywood"})
	public void LaunchYash()
	{
		Reporter.log("Yash wiki launch");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Yash_(actor)");
	}
}
