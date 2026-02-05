package org.Automation.PopUPHandling.ChildWindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToChildWidnowHandlePopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		String ExpectedChildWindowTitle = "New Widnow";
		
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		for(String wi : allwindows)
		{ 
			driver.switchTo().window(wi);
			if(driver.getTitle().equals(ExpectedChildWindowTitle)) 
			{
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				break;
			}
			
		}
		driver.close();
	}
}
