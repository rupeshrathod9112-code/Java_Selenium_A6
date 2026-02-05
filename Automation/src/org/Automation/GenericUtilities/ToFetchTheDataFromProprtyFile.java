package org.Automation.GenericUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ToFetchTheDataFromProprtyFile
{
	public static void main(String[] args) throws IOException 
	{
		File file = new File(FrameworkContants.PROPERTIES_PATH);
		FileInputStream fis = new FileInputStream(file);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String url = prop.getProperty("Url");
		String browser = prop.getProperty("Browser");
		String email = prop.getProperty("Email");
		String password = prop.getProperty("Password");
		
		
		System.out.println(url);
		System.out.println(browser);
		System.out.println(email);
		System.out.println(password);
	}
}
