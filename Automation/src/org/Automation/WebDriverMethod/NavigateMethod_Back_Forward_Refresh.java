package org.Automation.WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod_Back_Forward_Refresh 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.zomato.com/");
		 Thread.sleep(2000);
		 driver.get("https://www.zepto.com/");
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
	}
}
