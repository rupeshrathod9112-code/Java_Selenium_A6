package org.Automation.TestNG.BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HarleyDevidson 
{
	@Test
	public void Launching42Bobber()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.harley-davidsonx440.com/");
	}
	
	
}
