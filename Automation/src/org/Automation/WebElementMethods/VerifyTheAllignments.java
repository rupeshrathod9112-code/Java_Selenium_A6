package org.Automation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheAllignments 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//storing Elements
		WebElement EmailTB = driver.findElement(By.id("email"));
		WebElement PasswordTB = driver.findElement(By.id("passContainer"));
		
		// Verifying left alignment--> if emailTB X position == PaasTB X Position then aligned
		if (EmailTB.getLocation().getX()==PasswordTB.getLocation().getX())
			System.out.println("left Side Allignment is Proper");
		else
			System.out.println("left Side Allignment is imProper");
		
		// Verifying Right alignment--> if (emailTB X position+EmailTB width) == (PaasTB X Position + PassTB width) then aligned
		if((EmailTB.getSize().getWidth()+EmailTB.getLocation().getX())==(PasswordTB.getSize().getWidth()+PasswordTB.getLocation().getX()))
			System.out.println("Right Side Allignment is Proper");
		else 
			System.out.println("Right Side Allignment is imProper");	
		
		// Verifying Overlapped issue--> if (PaasTB Y position- emailTB y Position + PassTB width)> 0 then not overlapped
		if(PasswordTB.getLocation().getY()-(EmailTB.getLocation().getY()+EmailTB.getSize().getHeight())>0)
			System.out.println("Elements Are not Overlapped");
		else
			System.out.println("Elements Are Overlapped");
				
	}

	
}
