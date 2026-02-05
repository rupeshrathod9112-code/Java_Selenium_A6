package org.Automation.XPathStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsMethod 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes for Men");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'MEXICO-11')]")).click();
		driver.findElement(By.xpath("//img[contains(@alt,'MEXICO-11')]")).click();
	}
}
