package org.Automation.GenericUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ToFetchTheDataFromExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File file = new File(FrameworkContants.EXCELSHEET_PATH);
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("Register");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		String data = cell.toString();
		
		System.out.println(data);
		System.out.println(sheet.getRow(1).getCell(0).toString());
		System.out.println(sheet.getRow(1).getCell(1).toString());
		System.out.println(sheet.getRow(1).getCell(2).toString());
		System.out.println(sheet.getRow(1).getCell(3).toString());
	}
}
