package org.Automation.WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_ToURLMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.zepto.com/");  //ToString Method
		Thread.sleep(2000);
		driver.navigate().to("https://www.zomato.com/"); // To URL method.
	}
}
