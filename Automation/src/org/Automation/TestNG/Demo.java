package org.Automation.TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo 
{
	@Test
	public void test()
	{
		Reporter.log("test1 case executed", true);
	}

	@Test
	public void m1()
	{
		Reporter.log("m1 case executed", true);
	}
	
	@Test
	public void method1()
	{
		Reporter.log("method1 case executed", true);
	}
}
