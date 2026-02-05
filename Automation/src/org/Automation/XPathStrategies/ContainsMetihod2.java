package org.Automation.XPathStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsMetihod2 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[contains(@title,'Search')]")).sendKeys("MotorolaEdge 60 pro");
		driver.findElement(By.xpath("//button[contains(@title,'Search')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Stardust')]")).click();
	}
}
