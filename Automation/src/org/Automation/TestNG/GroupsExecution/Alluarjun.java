package org.Automation.TestNG.GroupsExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Alluarjun 
{
	@Test(groups = {"Telgu", "PanIndia", "Tamilmadu"})
	public void LaunchAllu()
	{
		Reporter.log("Allu Arjun wiki launch");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Allu_Arjun");
	}
}
