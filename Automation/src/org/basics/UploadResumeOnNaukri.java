package org.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadResumeOnNaukri 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		driver.findElement(By.id("usernameField")).sendKeys("sourabh.teli70@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Sourabh@70", Keys.ENTER);
		driver.findElement(By.linkText("View profile")).click();
		
		driver.findElement(By.id("attachCV")).sendKeys("C:\\Users\\admin\\Desktop\\Resume\\Sourabh Teli.pdf");
		
	}

}
