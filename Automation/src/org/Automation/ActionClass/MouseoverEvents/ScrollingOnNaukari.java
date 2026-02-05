package org.Automation.ActionClass.MouseoverEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingOnNaukari 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		WebElement target = driver.findElement(By.xpath("//span[text()='Resume writing']"));
		
		Actions action = new Actions(driver);
		
		action.scrollToElement(target).pause(2000).scrollByAmount(0, 300).perform();
		target.click();
		
	}
}
