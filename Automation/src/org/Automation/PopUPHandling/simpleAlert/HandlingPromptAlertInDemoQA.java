package org.Automation.PopUPHandling.simpleAlert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingPromptAlertInDemoQA 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/alerts");
		
		WebElement Promptbutton = driver.findElement(By.id("promtButton"));
		Actions action = new Actions(driver);
		action.scrollToElement(Promptbutton).scrollByAmount(0, 250).perform();
		Promptbutton.click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Alert Massage : " +alert.getText());
		alert.sendKeys("Sourabh");
		alert.accept();
	}
}
