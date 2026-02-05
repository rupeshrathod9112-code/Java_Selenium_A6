package org.Automation.XPathStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_SVG_Tag_using_dependant_Independent_Element 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.name("q")).sendKeys("best Phone Under 5000", Keys.ENTER);
		driver.findElement(By.xpath("//div[contains(text(),'Nokia 3310')]/../../..//*[name()='svg' and @height='16' ]")).click();
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//input[@class='r4vIwl mYpCuj BV+Dqf']")).sendKeys("7022998266");
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
	}
}
