package org.Automation.TestNG.BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jawa 
{
	@Test
	public void Launching42Bobber()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawayezdimotorcycles.com/products/jawa-42-bobber");
	}
	
	@Test
	public void LaunchingJawaPerak()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawayezdimotorcycles.com/products/jawa-perak");
	}
}
