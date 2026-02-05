package org.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Open_Insta_And_like_Page 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("teli_sourabh");
		driver.findElement(By.name("password")).sendKeys("Sour7699");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//div[text()='Not now']")).click();
		driver.findElement(By.xpath("//div[text()='OK']")).click();
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		driver.switchTo().activeElement().sendKeys("sourabh_teli");
		driver.findElement(By.xpath("//span[text()='sourabh__teli']")).click();
		
		Actions action = new Actions(driver);
		WebElement post1 = driver.findElement(By.xpath("//img[contains(@alt,'वर्ष २८ वे')]"));
		action.moveToElement(post1).click().perform();
		driver.findElement(By.xpath("(//button[@type='button']/../..//*[name()='svg'])[5]")).click();
		
		
		
	}
}
