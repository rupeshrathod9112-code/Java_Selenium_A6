package org.Automation.ActionClass.MouseoverEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByUsingOffset 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver .manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action = new Actions(driver);
		
		action.scrollByAmount(0, 500).perform();
	}
}
