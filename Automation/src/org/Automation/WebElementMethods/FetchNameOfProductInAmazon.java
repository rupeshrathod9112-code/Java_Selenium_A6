package org.Automation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchNameOfProductInAmazon 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String textValue = driver.findElement(By.xpath("//span[contains(text(),'y; Black')]")).getText();
		System.out.println(textValue);
		
		textValue=driver.findElement(By.xpath("//span[contains(text(),'17 Pro 512')]/../../../..")).getText();
		System.out.println(textValue);
		
	}
}
