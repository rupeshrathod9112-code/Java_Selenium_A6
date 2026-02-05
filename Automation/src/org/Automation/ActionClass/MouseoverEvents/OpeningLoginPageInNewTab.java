package org.Automation.ActionClass.MouseoverEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpeningLoginPageInNewTab 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		WebElement RegisterLink = driver.findElement(By.linkText("Register"));
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).click(LoginLink).keyUp(Keys.CONTROL).perform();
		
		action.keyDown(Keys.SHIFT).click(RegisterLink).keyUp(Keys.SHIFT).perform();
	}
}
