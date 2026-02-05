package org.Automation.XPathStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Indexing 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("best phone under 5000", Keys.ENTER);
		WebElement Amount =driver.findElement(By.xpath
				("(//div[contains(text(),'DS Keypad Mobile')]/../..//div[contains(text(),'₹')])[2]"));
		//Applied Indexing concept for above Xpath Strategy --> here we are fetching 2nd item
		
		String price= Amount.getText();
		System.out.println("Price : "+price);
	}
}
