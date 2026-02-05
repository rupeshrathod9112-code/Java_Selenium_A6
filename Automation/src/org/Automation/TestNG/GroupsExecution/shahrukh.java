package org.Automation.TestNG.GroupsExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class shahrukh 
{
	@Test(groups = {"Hindi", "PanIndia", "Bollywood"})
	public void LaunchSRK()
	{
		Reporter.log("SRK wiki launch");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Shah_Rukh_Khan");
	}
}
