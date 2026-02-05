package ModularFramework_POM;

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
	
	@SuppressWarnings("null")
	public static String readCellValueFromExcel(String sheet, int row, int cell)
	{
		File file = new File(FrameworkContants.EXCEL_PATH);
		FileInputStream fis = null;
		
		try
		{
			fis = new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			
		}
		
		Workbook wb= null;
		try
		{
			wb = WorkbookFactory.create(fis);
		}
		catch(Exception e)
		{
			
		}
		
		String value = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return value;
	}
	
	public static String getNumericCellValueMethod(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(FrameworkContants.EXCEL_PATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
	 	double data = cell.getNumericCellValue();
	 	
	    int data1 = (int) data;
	 	String value = String.valueOf(data1);
	 	return value;
		
	}
	
	public static int generateRandomNO()
	{
		Random random = new Random();
		int rn = random.nextInt(1000, 9999);
		return rn;
		
	}
}