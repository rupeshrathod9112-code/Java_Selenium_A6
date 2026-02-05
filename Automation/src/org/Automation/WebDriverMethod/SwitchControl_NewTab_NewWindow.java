package org.Automation.WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchControl_NewTab_NewWindow 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://manamchocolate.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.ferrerorocher.com/in/en/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.cadbury.co.uk/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://fantasiechocolate.com/");
	}
}
