package org.Automation.XPathStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Text_Method 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		//driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Noise Earbuds");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		WebElement priceElement = driver.findElement(By.xpath("//span[contains(text(),'VS104 Truly') and contains(text(),'Mint Green')]/../../../..//span[@class=\"a-price-whole\"]"));
		
		String price= priceElement.getText();
		
		System.out.println("price : "+ price);
		
		System.out.println("price : "+ driver.findElement(By.xpath("//span[contains(text(),'VS104 Truly') and contains(text(),'Mint Green')]/../../../..//span[@class=\"a-price-whole\"]")).getText());
		
		
	}
}



	
	