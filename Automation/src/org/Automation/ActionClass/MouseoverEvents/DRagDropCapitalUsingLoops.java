package org.Automation.ActionClass.MouseoverEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DRagDropCapitalUsingLoops 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Automation%20Selenium/DragDrop.html");
		
		Actions action = new Actions(driver);
		
		for(int i=1; i<=7; i++)
		{
			WebElement capital = driver.findElement(By.id("box"+i));
			WebElement country = driver.findElement(By.id("box10"+i));
			
			action.dragAndDrop(capital, country).perform();
		}
		
	}
}
