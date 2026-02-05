package org.Automation.Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegDropdownOnDates 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		
		//-----------------------------------------------------
		WebElement Date = driver.findElement(By.id("day"));  //locating Date Element
		
		Select select = new Select(Date); //create select object for Date
		
		if(select.isMultiple())    //check if Date Drop down is Multiple Drop down
			System.out.println("DropDown is Multiple DropDown");
		else
			System.out.println("DropDown is Single DropDown");
		
		List<WebElement> Alloptions = select.getOptions();  //fetching list of index
		
		for(int index = 0; index < Alloptions.size() ; index++) //by For method passing all index till size of list
			select.selectByIndex(index);						
		//-------------------------------------------------------
		
		WebElement Month = driver.findElement(By.id("month")); //locating Month Element
		select = new Select(Month);		//create select object for Month
		Alloptions = select.getOptions();  //fetching list of visible text for month drop down
		
		for(WebElement option: Alloptions)	//by For each method passing all visible texts(Month) fetched under Alloptions
		{
			String text = option.getText();
			select.selectByVisibleText(text);
		}
		//-----------------------------------------------------------
		
		
		WebElement Year = driver.findElement(By.id("year"));  //locating Year Element
		select = new Select(Year);		//create select object for Year
		Alloptions = select.getOptions(); 		//fetching list of visible text for Year drop down
		
		for(WebElement option: Alloptions)		//by For each method passing all getAttribute method ("Value") fetched under Alloptions
		{
			String year = option.getAttribute("value");
			select.selectByValue(year);
		}
		
	}
}
