package org.Automation.Frames;

import java.time.Duration;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementInDream11 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  
		driver.get("https://www.dream11.com/fantasy-sports");
		
		//using frame(int index)
		driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("12345678901");
		Thread.sleep(2000);
		driver.findElement(By.id("regEmail")).clear();
		driver.switchTo().parentFrame();
		
		
		driver.switchTo().frame("send-sms-iframe");
		driver.findElement(By.id("regEmail")).sendKeys("0987654321");
		Thread.sleep(2000);
		driver.findElement(By.id("regEmail")).clear();
		driver.switchTo().parentFrame();
		
		WebElement frameelement = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(frameelement);
		driver.findElement(By.id("regEmail")).sendKeys("67890543");
		Thread.sleep(2000);
		driver.findElement(By.linkText("GET APP LINK")).click();
	}
}
