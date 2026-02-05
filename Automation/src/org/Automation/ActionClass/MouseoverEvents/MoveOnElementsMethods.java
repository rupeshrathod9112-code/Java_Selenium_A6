package org.Automation.ActionClass.MouseoverEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveOnElementsMethods
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement computerslink = driver.findElement(By.partialLinkText("COMPUTERS"));
		
		Actions action = new Actions(driver); 
		
		action.moveToElement(computerslink).perform();  //perform mouseover action using Move to element method
		
		action.moveToLocation(500, 194).perform(); //Get the coordinates from  Extension added 
		
		action.moveByOffset(-122, -2).click().perform();
	}
}
