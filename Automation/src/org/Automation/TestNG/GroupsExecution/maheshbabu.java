package org.Automation.TestNG.GroupsExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class maheshbabu 
{
	@Test(groups = {"Telgu", "Hydrabad", "Hollywood"})
	public void LaunchMahesh()
	{
		Reporter.log("Mahesh Babu wiki launch");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Mahesh_Babu");
	}
}
