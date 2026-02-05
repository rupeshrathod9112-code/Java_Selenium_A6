//navigate to Demo Web Shop Application and add product in Cart using tool tip text

package org.Automation.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingImageUsingToolTipTextInDWS 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("APPAREL & SHOES")).click();
		driver.findElement(By.cssSelector("img[title='Show details for Blue and green Sneaker']")).click();
		driver.findElement(By.cssSelector("input[value='Add to cart']")).click();
	}
}
