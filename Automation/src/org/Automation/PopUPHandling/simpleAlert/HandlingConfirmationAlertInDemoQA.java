package org.Automation.PopUPHandling.simpleAlert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingConfirmationAlertInDemoQA 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/alerts");
		
		WebElement ConfirmButton = driver.findElement(By.id("confirmButton"));
		Actions action = new Actions(driver);
		action.scrollToElement(ConfirmButton).scrollByAmount(0, 250).perform();
		ConfirmButton.click();
		
		driver.switchTo().alert().accept(); //OK
		
		ConfirmButton.click();
		
		driver.switchTo().alert().dismiss(); //CANCEL
	}
}
