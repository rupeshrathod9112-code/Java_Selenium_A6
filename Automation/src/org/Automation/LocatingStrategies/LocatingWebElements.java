package org.Automation.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWebElements 
{
	public static void main(String[]args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Sourabh@gmail.com");
		

		WebElement Passwordtextfild = driver.findElement(By.id("pass)"));
		Passwordtextfild.sendKeys("123456");

		driver.findElement(By.name("login")).click();
	}
}
