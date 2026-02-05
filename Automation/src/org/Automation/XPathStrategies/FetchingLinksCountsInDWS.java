package org.Automation.XPathStrategies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingLinksCountsInDWS 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> count = driver.findElements(By.xpath("//a[@href]")); //a[@href] --> is used to get the all links present in web p4age
		System.out.println(count.size());  //to fetch the size of the elements in List
	}
}
