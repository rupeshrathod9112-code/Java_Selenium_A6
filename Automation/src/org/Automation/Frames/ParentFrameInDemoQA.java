package org.Automation.Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentFrameInDemoQA 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/nestedframes");													//open URl
		driver.switchTo().frame("frame1");				//switch From main page to Parent Frame
		
		driver.switchTo().frame(0);		//switch From Parent Frame to Child Frame
		String text1 = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText(); //locate Element from child frame
		System.out.println(text1); // print child frame text
		
		driver.switchTo().parentFrame(); //switch from Child Frame to Parent Frame
		String text2 = driver.findElement(By.tagName("body")).getText(); //locate Element from Parent frame
		System.out.println(text2);  // print Parent frame text
		
		driver.switchTo().frame(0);  //switch From Parent Frame to Child Frame again
		String text3 = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();  //locate Element from child frame
		System.out.println(text3);  // print child frame text
		
		driver.switchTo().defaultContent();  //switch from Child Frame to Main Page 
		String text4 = driver.findElement(By.xpath("//h1[text()='Nested Frames']")).getText();  // locate Element from Main Page
		System.out.println(text4);  //Print Main page text i.e. Nested Frame
		
		
		/* 	output
	 		Child Iframe
		   	Parent frame
			Child Iframe
			Nested Frames
		 */
	}
}
