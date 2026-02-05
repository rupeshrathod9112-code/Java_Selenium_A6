package org.Automation.TestNG.ConfigurationAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations 
{
	@AfterTest
	public void afterTest()
	{
		Reporter.log("This is @afterTest Method", true);
	}
	
	@AfterSuite
	public void aftersuite()
	{
		Reporter.log("This is @aftersuite Method", true);
	}
	
	@Test
	public void testcase1()
	{
		Reporter.log("This is @test Method 1", true);
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		Reporter.log("This is @BeforeMethod Method", true);
	}
	
	@BeforeClass
	public void beforeclass()
	{
		Reporter.log("This is @BEforeClass Method", true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("This is @BeforeTest Method", true);
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		Reporter.log("This is @Beforesuite Method", true);
	}
	
	@Test
	public void testcase2()
	{
		Reporter.log("This is @test Method 2", true);
	}
	
	@AfterMethod
	public void aftermethod()
	{
		Reporter.log("This is @AfterMethod Method", true);
	}
	
	@AfterClass
	public void afterclass()
	{
		Reporter.log("This is @afterClass Method", true);
	}
	
	@Test
	public void testcase3()
	{
		Reporter.log("This is @test Method 3", true);
	}
	
	
}
