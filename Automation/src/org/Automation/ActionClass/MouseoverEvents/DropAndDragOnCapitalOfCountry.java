package org.Automation.ActionClass.MouseoverEvents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropAndDragOnCapitalOfCountry 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Automation%20Selenium/DragDrop.html");
		
		WebElement capital = driver.findElement(By.id("dropContent"));
		List<WebElement> list;
		
		//for(WebElement option: list)
		{
			System.out.println();
		}
		
		/*
		
		
		
		WebElement draggable = driver.findElement(By.xpath("//div[text()='Stockholm']"));
		WebElement droppable = driver.findElement(By.xpath("//div[text()='Italy']"));
		
		
		draggable = driver.findElement(By.xpath("//div[text()='Stockholm']"));
		droppable = driver.findElement(By.xpath("//div[text()='Italy']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable, droppable).perform();*/
	}
}
