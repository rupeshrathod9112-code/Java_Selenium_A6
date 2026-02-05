package org.Automation.Testscripts;

import java.time.Duration;

import org.Automation.GenericUtilities.Flib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTCinDWS 
{
	public static void main(String[] args) 
	{
		String url = Flib.getpropertyvalue("Url");
		String browser = Flib.getpropertyvalue("Browser");
		String email = Flib.getpropertyvalue("Email");
		String Password = Flib.getpropertyvalue("Password");
		
		System.out.println(url);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
	}
}
