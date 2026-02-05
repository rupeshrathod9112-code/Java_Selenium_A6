package org.Automation.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterAndLoginDWSUsingTestAnotationPriority 
{
	String url = "https://demowebshop.tricentis.com/";
	String firstname = "Sourabh";
	String Lastname = "Test";
	String gender = "male";
	String email = "sourabh456@gmail.com";
	String password = "sourabh123";		
	
	@Test (priority = 1)
	public void register()
	{
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

		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(Lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		driver.findElement(By.id("register-button")).click();	

	}
	
	@Test (priority = 2, invocationCount = 6, threadPoolSize = 2 )
	public void Login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
	}
}
