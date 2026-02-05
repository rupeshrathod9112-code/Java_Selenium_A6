package org.Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAndAllignTabs 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		int width = driver.manage().window().getSize().getWidth();
		int hight = driver.manage().window().getSize().getHeight();
		System.out.println(width);
		System.out.println(hight);
		int x = driver.manage().window().getPosition().getX();
		int y = driver.manage().window().getPosition().getY();
		
		
		
		Dimension sd = new Dimension(width/4, hight);
		driver.manage().window().setSize(sd);
		
		width = driver.manage().window().getSize().getWidth();
	
		driver.switchTo().newWindow(WindowType.WINDOW);
		Point position = new Point(x+width,y);
		driver.manage().window().setPosition(position);
		
		width = driver.manage().window().getSize().getWidth();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		Point position1 = new Point(x+width*2,y);
		driver.manage().window().setPosition(position1);
		
		width = driver.manage().window().getSize().getWidth();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		Point position3 = new Point(x+width*3,y);
		driver.manage().window().setPosition(position3);
	}
}
