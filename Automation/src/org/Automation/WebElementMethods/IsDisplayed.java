package org.Automation.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement CustomGenderTB = driver.findElement(By.name("custom_gender"));
		
		if (CustomGenderTB.isDisplayed())   //verify Gender Custom text field is displayed in View Port Area or not
			CustomGenderTB.sendKeys("LGBTQ");    // if yes pass sendkeys LGBTQ
		else
		{
			driver.findElement(By.xpath("//label[text()='Custom']/input")).click(); //if false click on custom radio button 
			CustomGenderTB.sendKeys("LGBTQ");  //and then sendkeys LGBTQ
		}
	}
}
