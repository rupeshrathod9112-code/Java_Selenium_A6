package org.Automation.TestNG.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReadMulltipleDatasFromExcel 
{
	@DataProvider(name = "Credentials")
	public  String[][] invalidlogincreds() throws EncryptedDocumentException, IOException 
	{
		File file= new File("./TestData/DWS.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("invalidcreds");
		
		int rowcount = sheet.getPhysicalNumberOfRows()-1;
		System.out.println(rowcount);
		int cellcount = sheet.getRow(1).getPhysicalNumberOfCells();
		System.out.println(cellcount);
		
		String [] [] data = new String [rowcount] [cellcount];
		
		for(int i =1; i<=rowcount; i++)
		{
			for (int j=0; j<cellcount; j++)
			{
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		
		return data;
	}
		
		@Test(dataProvider = "Credentials")
		public void invalidLogin(String email, String password)
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			
			driver.quit();
			
		}
}


