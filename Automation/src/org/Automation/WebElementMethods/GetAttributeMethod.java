package org.Automation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String email="sourabh.teli99@gmail.com";
		WebElement Emailtextbox = driver.findElement(By.id("email"));
		
		System.out.println(Emailtextbox.getAttribute("class"));
		
		Emailtextbox.sendKeys(email);
		String EnterEmail=Emailtextbox.getAttribute("value");
		
		
		if (email.equals(EnterEmail))
			System.out.println("Email Entered Successfully");
		else
			System.err.println("Email Entered is incorrect");
		 
		
		
		
	}
}
