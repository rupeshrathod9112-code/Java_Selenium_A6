package org.Automation.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingTimeoutsInTC 
{
	@Test(timeOut = 7000)
	public void LaunchingTrimph()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.triumphmotorcyclesindia.com/");
	}
}
