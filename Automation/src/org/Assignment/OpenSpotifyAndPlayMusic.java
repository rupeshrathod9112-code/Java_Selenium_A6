package org.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenSpotifyAndPlayMusic 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://open.spotify.com/");
		
		driver.findElement(By.xpath("//input[@data-testid='search-input']")).sendKeys("Hindi Songs", Keys.ENTER);
		Thread.sleep(4000);
		
		WebElement playbutton = driver.findElement(By.xpath("(//div[text()='Top Hindi Tracks of 2025']/../../..//span)[4]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(playbutton).click().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'phone number')]")).click(); Thread.sleep(2000);
		driver.findElement(By.name("inputPhoneNumber")).sendKeys("7022998266");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
	}
}
