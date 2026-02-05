package org.Automation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Properties 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
		
		System.out.println("Background Colour: "+loginButton.getCssValue("background-color"));
		System.out.println("Font Size: "+loginButton.getCssValue("font-size"));
		System.out.println("line Height: "+loginButton.getCssValue("line-height"));
	}
}
