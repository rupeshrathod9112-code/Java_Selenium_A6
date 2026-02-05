package org.Automation.JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingScrollByFunction 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.zomato.com/pune");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,700)");  // screen will move down with value 0,700 pixel from origin 0,0
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,700)");  // screen will move down again with  value 0,700 pixel from cursor position i.e. 0,700.
	}
}
