package org.Automation.ActionClass.MouseoverEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingUntilElementIsVisibleInViewPort 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/pune");
		
		WebElement target = driver.findElement(By.xpath("//h5[text()='Wakad']/.."));
		
		Actions action = new Actions(driver);
		action.scrollToElement(target).perform();
	}
}
