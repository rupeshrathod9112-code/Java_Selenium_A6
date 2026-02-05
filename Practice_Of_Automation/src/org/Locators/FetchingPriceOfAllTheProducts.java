package org.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingPriceOfAllTheProducts 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Noise watches for men");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> prices = driver.findElements(By.className("a-price-whole"));
		for(WebElement Price : prices )
		{
			System.out.println(Price.getText());
		}
		driver.close();
		}
			
}
