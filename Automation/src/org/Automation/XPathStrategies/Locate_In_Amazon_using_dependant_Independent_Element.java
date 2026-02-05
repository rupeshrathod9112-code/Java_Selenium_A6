package org.Automation.XPathStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_In_Amazon_using_dependant_Independent_Element 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Noise Earbuds");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'VS104 Truly') and contains(text(),'Mint Green')]/../../../..//button[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
		
		
		
		
	}
}
