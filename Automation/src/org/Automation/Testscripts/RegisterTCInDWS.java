package org.Automation.Testscripts;

import java.time.Duration;

import org.Automation.GenericUtilities.Flib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTCInDWS 
{
	public static void main(String[] args) 
	{
		String url =Flib.readCellValueFromExcel("Register", 1, 0);
		System.out.println(url);
		String gender =Flib.readCellValueFromExcel("Register", 1, 4);
		String FirstName = Flib.readCellValueFromExcel("Register", 1, 5);;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
		driver.findElement(By.linkText("Register")).click();
		
		if (gender.equalsIgnoreCase("male"))
		{
			driver.findElement(By.id("gender-male")).click();
		}
		else
		{
			driver.findElement(By.id("gender-female")).click();
		}
		
		driver.findElement(By.id("FirstName")).sendKeys(FirstName);
		driver.findElement(By.id("LastName")).sendKeys("QWE");
		driver.findElement(By.id("Email")).sendKeys(Flib.readCellValueFromExcel("Register", 1, 1));
		driver.findElement(By.id("Password")).sendKeys(Flib.readCellValueFromExcel("Register", 1, 2));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(Flib.readCellValueFromExcel("Register", 1, 2));	
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
	}
}
