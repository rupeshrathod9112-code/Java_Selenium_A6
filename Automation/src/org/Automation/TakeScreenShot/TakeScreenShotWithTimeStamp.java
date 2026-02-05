package org.Automation.TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotWithTimeStamp 
{
	public static void main(String[] args) throws IOException 
	{
		LocalDateTime ldt = LocalDateTime.now();
		String timeStamp = ldt.toString().replace(':', '-');
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		//Step 1: downcast to TakesScreenshot and save in ts Variable
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//Step 2: GetScreeshot of  opened web browser  and store in src variable 
		//where OutputType is input present in Selenium, File Package present in Java
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//Step 3: create object for File and provide path in format "pathName\\Filename.FileExtention"
		File dest = new File("./errorshots/Screenshot"+ timeStamp +".png");
		
		//copy the from source to destination using copy method from fileHandler package present in java 
		FileHandler.copy(src, dest);
	}
}
