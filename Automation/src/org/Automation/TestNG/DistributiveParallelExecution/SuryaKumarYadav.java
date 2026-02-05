package org.Automation.TestNG.DistributiveParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SuryaKumarYadav 
{
	@Test
	public void SKY()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Suryakumar_Yadav");
	}
}
