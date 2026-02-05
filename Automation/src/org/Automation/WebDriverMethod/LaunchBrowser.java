package org.Automation.WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.out.println(driver);
	}
}
