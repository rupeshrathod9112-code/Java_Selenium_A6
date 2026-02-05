package org.Automation.TestNG.DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider 
{
	WebDriver driver;
	
	@DataProvider(name="Credentials")
	public String[][] dataprovidermethod()
	{
		String [] [] data = {
								{"Qspiders@gmail.com","Qspiders@123"},
								{"pyspiders@gmail.com","PYSPIders@456"},
								{"jspiders@gmail.com","JsPiDeRs@789"}
							};
		return data;
	}
	
	
	@Test(dataProvider = "Credentials", dataProviderClass = org.Automation.TestNG.DataProvider.dataProvider.class)
	public void login(String email, String password) throws InterruptedException
	{
		
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
	}
}
