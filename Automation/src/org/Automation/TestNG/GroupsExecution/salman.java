package org.Automation.TestNG.GroupsExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class salman 
{
	@Test(groups = {"Hindi", "PanIndia", "Bollywood"})
	public void LaunchSalman()
	{
		Reporter.log("Salman wiki launch");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Salman_Khan");
	}
}
