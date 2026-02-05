package org.Automation.ActionClass.MouseoverEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformDragAndDropAction 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		
		WebElement draggable = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement Droppable = driver.findElement(By.id("droppable"));
		
		Actions action= new Actions(driver);
		
		action.dragAndDrop(draggable, Droppable).perform();
		
	}
}
