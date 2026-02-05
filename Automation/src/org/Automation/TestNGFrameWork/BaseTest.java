package org.Automation.TestNGFrameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	public static WebDriver driver;
	@BeforeClass
	public void browserSetup()
	{
		String browservalue = Flib.getpropertyvalue("chrome");
		String url = Flib.getpropertyvalue("Url");
		
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		} 
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browservalue.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	
	@BeforeMethod
	public void login()
	{
		String email = Flib.getpropertyvalue("Email");
		String password = Flib.getpropertyvalue("Password");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	
	@AfterClass
	public void browserTearDown()
	{
		driver.close();
	}
}
