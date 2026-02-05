package org.Automation.XPathStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeName_TextMethod 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@data-testid='royal-email']")).sendKeys("KGF");  //Attribute Stratergy 
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("KGF123");
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();  //text() method
	}
}
