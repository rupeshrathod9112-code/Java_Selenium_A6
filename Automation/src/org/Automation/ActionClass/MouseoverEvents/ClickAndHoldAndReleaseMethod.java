package org.Automation.ActionClass.MouseoverEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAndReleaseMethod 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Automation%20Selenium/DragDrop.html");
		
		 WebElement capital = driver.findElement(By.xpath("//div[text()='Copenhagen']"));
		 WebElement country = driver.findElement(By.xpath("//div[text()='Spain']"));
		 
		 Actions action = new Actions(driver);
		 action.clickAndHold(capital).moveToElement(country).release().perform();
		 
		 
		 capital = driver.findElement(By.xpath("//div[text()='Washington']"));
		 country = driver.findElement(By.xpath("//div[text()='Denmark']"));
		 action.clickAndHold(capital).release(country).perform();
	}
}
