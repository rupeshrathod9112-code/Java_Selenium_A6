package org.Automation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement TB1 = driver.findElement(By.id("textbox1"));
		System.out.println(TB1.isEnabled()?"TextBox1 is Enabled":"TextBox1 is Disabled");
		
		WebElement TB2 = driver.findElement(By.id("tb2"));
		System.out.println(TB2.isEnabled()?"TextBox2 is Enabled":"TextBox1 is Disabled");
		
		WebElement TB3 = driver.findElement(By.name("userid"));
		System.out.println(TB3.isEnabled()?"TextBox3 is Enabled":"TextBox1 is Disabled");
	}
}
