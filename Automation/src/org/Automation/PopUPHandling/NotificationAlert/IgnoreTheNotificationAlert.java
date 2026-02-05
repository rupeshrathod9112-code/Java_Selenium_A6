package org.Automation.PopUPHandling.NotificationAlert;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IgnoreTheNotificationAlert 
{
	public static void main(String[] args) 
	{
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(CO);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.easemytrip.com/");
		
		
	}
}
