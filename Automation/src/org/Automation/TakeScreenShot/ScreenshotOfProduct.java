package org.Automation.TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.lang.foreign.Linker.Option;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOfProduct 
{
	public static void main(String[] args) throws IOException 
	{
		LocalDateTime ldt = LocalDateTime.now();
		String timestamp = ldt.toString().replace(':', '-');
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Cricket Bats for Men", Keys.ENTER);
		WebElement product = driver.findElement(By.xpath("//a[contains(text(),'Suitable Only')]/.."));
		
		//TakesScreenshot ts = (TakesScreenshot) driver;
		//File src = ts.getScreenshotAs(OutputType.FILE);
		//File dest = new File("./errorshots/screenshots"+timestamp+".png");
		//FileHandler.copy(src, dest);

		
		File src = product.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorshots/screenshots"+timestamp+".png");
		FileHandler.copy(src, dest);
		
	}
}
