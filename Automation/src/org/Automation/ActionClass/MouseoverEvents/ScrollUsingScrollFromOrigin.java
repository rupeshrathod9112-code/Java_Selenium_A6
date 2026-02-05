package org.Automation.ActionClass.MouseoverEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollUsingScrollFromOrigin 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		WebElement target = driver.findElement(By.xpath("//span[text()='Resume writing']"));
		
		Actions action = new Actions(driver);
		ScrollOrigin scrollorigin = ScrollOrigin.fromElement(target);
		
		action.scrollFromOrigin(scrollorigin, 0, 200).perform();
		
		target.click();
	}
}
