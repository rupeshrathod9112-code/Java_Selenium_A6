package org.Automation.TestNG.GroupsExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sudeep 
{
	@Test(groups = {"Kannada", "Karnataka", "Tollywood"})
	public void LaunchSudeep()
	{
		Reporter.log("Sudeep wiki launch");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Sudeepa");
	}
}
