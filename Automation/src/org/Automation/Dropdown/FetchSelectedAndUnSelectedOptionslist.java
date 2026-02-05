package org.Automation.Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchSelectedAndUnSelectedOptionslist 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Automation%20Selenium/Bikes.html");
		
		WebElement dropdown = driver.findElement(By.id("Bikes"));
		Select select = new Select(dropdown);
		
		select.selectByIndex(2);
		select.selectByValue("shb");
		select.selectByVisibleText("Harley Davidson 440x");
		
		List<WebElement> Alloptions = select.getOptions();
		System.out.println("====== All Options ======");
		for(WebElement option:Alloptions)
		{
			String text = option.getText();
			System.out.println(text);
		}
		
		//------------------------------------------------
		System.out.println();
		List<WebElement> SelectedOption = select.getAllSelectedOptions();
		System.out.println("====== Selected Options ======");
		for(WebElement option:SelectedOption)
		{
			String text = option.getText();
			System.out.println(text);
		}
		//-------------------------------------------------
		System.out.println();
		Alloptions.removeAll(SelectedOption);
		System.out.println("====== UnSelected Options ======");
		for(WebElement option:Alloptions)
		{
			String text = option.getText();
			System.out.println(text);
		}
		
		System.out.println();
		System.out.println("Firt Selected Option: " +select.getFirstSelectedOption().getText());
	}
}
