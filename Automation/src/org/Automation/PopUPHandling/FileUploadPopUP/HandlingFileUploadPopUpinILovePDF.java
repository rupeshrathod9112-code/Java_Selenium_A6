package org.Automation.PopUPHandling.FileUploadPopUP;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopUpinILovePDF 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		driver.findElement(By.id("pickfiles")).click();
		Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\AutoEdit Files\\uploadResume.exe");
	}
}
