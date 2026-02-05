package org.Automation.Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDeSelectMethodInOmayu 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		WebElement MultiSelectDropDown = driver.findElement(By.id("multiselect1"));  //Locating Multiple Select Drop down
		
		Select select = new Select(MultiSelectDropDown);  //Creating Object for Dowpdown
		
		if (select.isMultiple())			// check if drop Down is Multiple Select.
			System.out.println("Givn Drop Down is Multiple Select Dropdown");
		else
			System.out.println("Givn Drop Down is Single Select Dropdown");
		
		List<WebElement> alloptions = select.getOptions();  // get the list of webelements from drop down
		
		for (WebElement option : alloptions)   // Select all options present in drop down using For Each loop
		{
			String text = option.getText();
			select.selectByVisibleText(text);
		}
		
		Thread.sleep(2000);
		select.deselectByIndex(0);  // DeSelect 1 option using Index method
		
		Thread.sleep(2000);
		select.deselectByValue("swiftx");  // DeSelect 1 option using Value Attribute using deselectByValue  method
		
		Thread.sleep(2000);
		select.deselectByVisibleText("Hyundai");  // DeSelect 1 option using visible text using deselectByVisibleText method
		
		Thread.sleep(2000);
		select.deselectAll();  // DeSelect All options using deselectAll method
		
	}
}
