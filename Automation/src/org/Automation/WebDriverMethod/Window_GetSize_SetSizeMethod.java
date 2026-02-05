package org.Automation.WebDriverMethod;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_GetSize_SetSizeMethod 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.zomato.com/");
		System.out.println(driver.manage().window().getSize());		//get Method
		System.out.println("Height = " + driver.manage().window().getSize().getHeight());	//fetch height 
		System.out.println("width = "+ driver.manage().window().getSize().getWidth());		//fetch width 
		driver.manage().window().maximize();		//Maximize browser
		System.out.println("Height = " + driver.manage().window().getSize().getHeight());	//fetch height 
		System.out.println("width = "+ driver.manage().window().getSize().getWidth());		//fetch width
		
		Dimension targetsize = new Dimension(650, 650);
		driver.manage().window().setSize(targetsize);
		
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		System.out.println("x position: "+ position.getX());
		System.out.println("y position: "+ position.getY());
		
		Point targetpPosition = new Point(-100,300);
		driver.manage().window().setPosition(targetpPosition);
		
		driver.manage().window().setPosition(new Point(0, 0));
		driver.manage().window().setSize(new Dimension(200, 200));
		System.out.println(driver.manage().window().getSize());
	}
}
