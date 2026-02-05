package org.Automation.TestNGFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{
	/**
	 * This Method Accept the key and it will fetch the value from the properties file from given Path
	 * @param key
	 * @return
	 */
	
	public static String getpropertyvalue(String key)
	{
		File file = new File(FrameworkContants.PROPERTIES_PATH);
		
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
		}
		
		Properties prop = new Properties();
		try
		{
			prop.load(fis);
		}
		catch(IOException e)
		{
		}
		
		return prop.getProperty(key) ;
	}
	
	public static String readCellValueFromExcel(String sheet, int row, int cell)
	{
		File file = new File("./TestData/DWS.xlsx");
		FileInputStream fis = null;
		
		try
		{
			fis = new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			
		}
		
		Workbook wb = null;
		try
		{
			wb = null;
		}
		catch(Exception e)
		{
			
		}
		
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return data;
	}
	
	
	
	
}
