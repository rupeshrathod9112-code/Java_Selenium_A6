package org.Automation.WebDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_OpenNewWindowAndArrange 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
		int x = driver.manage().window().getPosition().getX();
		int y = driver.manage().window().getPosition().getY(); 
		int height = driver.manage().window().getSize().getHeight();
		int width = driver.manage().window().getSize().getWidth();
		System.out.println(height);
		System.out.println(width);
			Point targetposition = new Point(x, y);						//1st window
			driver.manage().window().setPosition(targetposition);
			Dimension Targetsize = new Dimension(width/3, height);
			driver.manage().window().setSize(Targetsize);
			//driver.get("https://www.zomato.com/");
			
		int wi= (width/3)*1;
		driver.switchTo().newWindow(WindowType.WINDOW);
		Point targetposition1 = new Point(wi, y);
		driver.manage().window().setPosition(targetposition1);
		
		wi=  (width/3)*2;
		driver.switchTo().newWindow(WindowType.WINDOW);
		Point targetposition2 = new Point(wi, y);
		driver.manage().window().setPosition(targetposition2);
		wi= driver.manage().window().getSize().getWidth();
		
		
		System.out.println(driver.manage().window().getSize());
		
		
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
	}
}
