package org.Automation.ActionClass.MouseoverEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PassingDataInOrangeHRM 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));   //Duration from Java.time Package
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement usernameTextField = driver.findElement(By.name("username"));
		WebElement PasswordTextField = driver.findElement(By.name("password")); 
		WebElement LoginButton = driver.findElement(By.xpath("//button[text()=' Login ']"));
		
		Actions action = new Actions(driver);
		
		//action.sendKeys(usernameTextField, "admin").sendKeys(PasswordTextField, "admin123").keyDown(Keys.ENTER).perform();
		
		//action.moveToElement(usernameTextField).sendKeys("admin").moveToElement(PasswordTextField).click().sendKeys("admin123").keyDown(Keys.ENTER).perform();
		
		action.moveToElement(usernameTextField).sendKeys("admin").moveToElement(PasswordTextField).click().sendKeys("admin123").moveToElement(LoginButton).click().perform();
	}
}
