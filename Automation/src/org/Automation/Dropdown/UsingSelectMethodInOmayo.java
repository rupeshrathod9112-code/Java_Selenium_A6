package org.Automation.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectMethodInOmayo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement DropDownElement = driver.findElement(By.id("drop1"));
		
		
		
		Select select = new Select(DropDownElement);
		select.selectByVisibleText("doc 3");
		Thread.sleep(2000);
		select.selectByValue("def");
		Thread.sleep(2000);
		select.selectByIndex(4);
		
		System.out.println(select.isMultiple());
	}
}
