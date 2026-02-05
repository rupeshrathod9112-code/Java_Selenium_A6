package org.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PlayVideoonYouTube 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("April May 99", Keys.ENTER);
		driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'#aprilmay 99')]")).click();
		
		Actions action =new Actions(driver);
		WebElement fullscreen = driver.findElement(By.xpath("//button[@data-title-no-tooltip='Full screen']"));
		action.moveToElement(fullscreen).click().perform();
		
	}
}
