package org.Automation.TestNG.GroupsExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dhanush 
{
	@Test(groups = {"Tamil", "TamilNadu", "Hollywood"})
	public void LaunchDHanush()
	{
		Reporter.log("Danush wiki launch");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Dhanush");
	}
}
