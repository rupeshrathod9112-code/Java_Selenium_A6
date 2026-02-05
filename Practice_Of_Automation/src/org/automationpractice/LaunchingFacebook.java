package org.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingFacebook 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.switchTo().activeElement().sendKeys("Rupesh Rathod");
		driver.switchTo().activeElement().getText();
	}
}
