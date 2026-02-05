package org.Automation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Clear_Method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();   //click()
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("sourabh.teli99@gmail.com"); //Sendkeys() to enter Email
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Incorrect Password");  //Sendkeys() to enter Password
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).clear();		//Clear()
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Incorrect Password", Keys.CONTROL+"A" , Keys.BACK_SPACE, "Sourabh@99");
		//Sendkeys() to enter Password then clear it using control A and backspace and again add password
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Sourabh@99");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).submit(); //Submit()
		System.out.println(driver.findElement(By.xpath("//input[@value='Log in']")).getTagName());
		
	}
}
