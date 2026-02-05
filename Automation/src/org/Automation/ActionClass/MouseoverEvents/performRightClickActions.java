package org.Automation.ActionClass.MouseoverEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class performRightClickActions 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/");
		
		WebElement compresspdfButton = driver.findElement(By.linkText("COMPRESS PDF"));
		
		Actions action = new Actions(driver);
		//action.contextClick(compresspdfButton).perform();  //RightClick-contextClick(webelement) from action class
		
		action.moveToElement(compresspdfButton).contextClick().perform(); //RightClick-contextClick() from action class
	}
}
