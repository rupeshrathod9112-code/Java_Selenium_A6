package org.Automation.TestNGFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.Automation.TestNGFrameWork.MyListener.class)
public class TC001_AddToCartTest extends BaseTest
{
	@Test
	public void addToCart() 
	{
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		driver.findElement(By.xpath("//img[@alt='Picture for category Cell phones']")).click();
		driver.findElement(By.xpath("//a[text()='Smartphone']/../..//inpu")).click();
		//driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		WebElement addToCartMsg = driver.findElement(By.xpath("//p[text()='The product has been added to your ']"));
		
		if(addToCartMsg.isDisplayed())
			Reporter.log("Product added to Cart!!!", true);
		else
			Reporter.log("Product Not added to Cart!!!", true  );
		
	}
}
