package org.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser 
{
	public static void main(String[] args) 
	{
		WebDriver driver;
		
		if(true)
		{
			driver =new ChromeDriver();
		}
		else if(2==1)
		{
			driver =new EdgeDriver();
		}
		else if(1!=3)
		{
			driver =new FirefoxDriver();
		}
		else
		{
			System.out.println("asdnjewkhfew");
		}
	}
}
