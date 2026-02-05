package org.Automation.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingDependsOnMethod 
{
	@Test(priority = -12)
	public void LaunchingZomato()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Reporter.log("Zomato", true);
	}
	
	@Test (dependsOnMethods = {"LaunchingZomato", "LaunchingZepto"})
	public void LaunchingSwiggy()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Reporter.log("Swiggy", true);
	}
	
	@Test (priority = 1)
	public void LaunchingZepto()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zepto.com/");
		Reporter.log("Zepto", true);
	}
}
