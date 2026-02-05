package Org.GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import static Org.GenericLibrary.FrameWorkConstant.*;  
/**
 * The Class Flib Mainly Used To Interact with the file And Feythch The Test Data needed For Automating Any Application
 * 
 * @author Tejas
 */
public class Flib {
	/**
	 * This Method Accepts The Key And Accepts The Value Of the Respective Key In The Given Properties File 
	 * @param key
	 * @return
	 */
	public static String getPropertyValue(String propPath, String key)
 
	{
		File file = new File(propPath);
		FileInputStream fis = null;
		//here we declare fis as a null because when we declare fis in try block we got error so that we declare null
		
		// we use try and catch block to handle exceptions like file not found exception and IOexception
		try
		{
			fis = new FileInputStream(file); //
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			//print error
		}
		Properties prop = new Properties();
		try
		{
			prop.load(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
		String value = prop.getProperty(key);
		return value;
	}
	
	public static String readCellValueFromExcel(String excelPath, String Sheet1, int row, int cell)
	{
		File file = new File(excelPath);
		FileInputStream fis = null;
		
		try
		{
			fis = new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		Workbook wb = null;
		try
		{
			wb = WorkbookFactory.create(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		String data = wb.getSheet(Sheet1).getRow(row).getCell(cell).toString();
		return data;
	}
	
	
	public static String readCellValueFromExcelinint(String excelPath, String Sheet1, int row, int cell) throws EncryptedDocumentException, IOException
	{
		File file = new File(excelPath);
		FileInputStream fis  = new FileInputStream(file);
		Workbook wb =  WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheet1);
		Row rw = sh.getRow(row);	
		Cell cl = rw.getCell(cell);
		double data = cl.getNumericCellValue();
		
		// Upcasting Because We Get Pincode In double datatype 
		int data1 = (int) data;
		String value = String.valueOf(data1);// Here we convert int in to String 
		return value;
	}
	
	public static int generateRandonNo()
	{
		Random random = new Random();
		int rn = random.nextInt(1000, 9999);
		return rn;
	}


}
