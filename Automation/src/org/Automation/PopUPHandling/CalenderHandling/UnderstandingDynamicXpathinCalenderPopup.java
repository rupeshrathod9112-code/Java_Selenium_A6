package org.Automation.PopUPHandling.CalenderHandling;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingDynamicXpathinCalenderPopup 
{
	public static void main(String[] args) 
	{
		LocalDateTime ltd =LocalDateTime.now();
		int date = ltd.getDayOfMonth();
		String monthtemp = ltd.getMonth().toString(); //DECEMBER
		
		String month = monthtemp.charAt(0) + monthtemp.substring(1).toLowerCase(); //December
		
		System.out.println("//div[text()='"+month+"']/../..//span[text()='"+date+"']");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.com/");
		
		
		driver.findElement(By.id("date-box")).click();
		driver.findElement(By.xpath("//div[text()='"+month+"']/../..//span[text()='"+date+"']")).click();
		
		driver.findElement(By.id("return-box")).click();
		driver.findElement(By.xpath("//div[text()='"+month+"']/../..//span[text()='"+(date+2)+"']")).click();
		
	}
}
