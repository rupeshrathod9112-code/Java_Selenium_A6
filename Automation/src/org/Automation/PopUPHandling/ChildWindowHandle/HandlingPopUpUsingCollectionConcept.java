package org.Automation.PopUPHandling.ChildWindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopUpUsingCollectionConcept 
{
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.sbi.bank.in/retail/login.htm");
		
		String ParentWindowHandle = driver.getWindowHandle();  //Fetching Parent Window Handle
		
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username")).click();
		
		Set<String> Allwindow = driver.getWindowHandles();
		Allwindow.remove(ParentWindowHandle);
		
		for(String wi :Allwindow)
		{
			driver.switchTo().window(wi);
		}
		
		driver.findElement(By.id("nextStep")).click();
		//driver.close();
		
	}
}
