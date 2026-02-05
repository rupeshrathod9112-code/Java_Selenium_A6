package org.Automation.ActionClass.MouseoverEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.xpath("//button[(@class='No thanks')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Search')]")).sendKeys("Mobiles",Keys.ENTER);
		Thread.sleep(10000);
		WebElement pricebutton1 = driver.findElement(By.xpath("(//div[text()=' Price ']/../..//div[@class='vue-slider-dot-handle'])[1]"));
		WebElement pricebutton2 = driver.findElement(By.xpath("(//div[text()=' Price ']/../..//div[@class='vue-slider-dot-handle'])[2]"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(pricebutton2, -50, 0).perform();
		//action.dragAndDropBy(pricebutton1, 40, 0).perform();
		
		WebElement discountbutton1 = driver.findElement(By.xpath("(//div[text()=' Price ']/../..//div[@class='vue-slider-dot-handle'])[1]"));
		WebElement discountbutton2 = driver.findElement(By.xpath("(//div[text()=' Discount ']/../..//div[@class='vue-slider-dot-handle'])[2]"));
		
		action.dragAndDropBy(discountbutton2, -50, 0).perform();
		action.dragAndDropBy(discountbutton1, 40, 0).perform();
	}
}
