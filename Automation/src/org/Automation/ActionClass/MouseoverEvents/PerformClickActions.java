package org.Automation.ActionClass.MouseoverEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformClickActions 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		
		WebElement button = driver.findElement(By.xpath("//button[@class='No thanks']"));
		
		//button.click(); //click option directly on located Webelement
		
		Actions action = new Actions(driver);
		
		//action.click(button).perform(); //Click(webelement) from action class
		
		action.moveToElement(button).click().perform();  //Click() from action class
	}
}
