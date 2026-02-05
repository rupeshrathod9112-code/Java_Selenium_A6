package org.Automation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement CHB1 = driver.findElement(By.xpath("//input[@value='Pen' and @name]"));
		System.out.println(CHB1.isSelected()?"Pen CheckBox is Selected":"Pen CheckBox is Not Selected");
		
		WebElement CHB2 = driver.findElement(By.xpath("//input[@value='Book']"));
		System.out.println(CHB2.isSelected()?"Book CheckBox is Selected":"Book CheckBox is Not Selected");
		
		WebElement CHB3 = driver.findElement(By.xpath("//input[@value='Laptop']"));
		System.out.println(CHB3.isSelected()?"Laptop CheckBox is Selected":"Laptop CheckBox is Not Selected");
		driver.findElement(By.xpath("//input[@value='Laptop']")).click();
		System.out.println(CHB3.isSelected()?"Laptop CheckBox is Selected":"Laptop CheckBox is Not Selected");
	}
}
