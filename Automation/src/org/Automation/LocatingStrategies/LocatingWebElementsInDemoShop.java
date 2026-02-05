package org.Automation.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWebElementsInDemoShop 
{
	public static void main(String[]args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");

		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Sourabh");
		driver.findElement(By.id("LastName")).sendKeys("teli");
		driver.findElement(By.id("Email")).sendKeys("sourabh321@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("sourabh123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("sourabh123");
		driver.findElement(By.id("register-button")).click();	
	}
}
