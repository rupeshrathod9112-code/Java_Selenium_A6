package org.Automation.XPathStrategies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("trending lighters");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> addToCartButton = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for( WebElement X:addToCartButton)
		{
			Thread.sleep(500);
			//X.click();
			System.out.println("Price:" + X.getText());
		}
	}
}
