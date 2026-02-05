package org.Automation.TestNG.Parameterized;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization 
{
	@Parameters("bname")
	@Test
	public void LaunchAndNavigate(@Optional("Edge") String browsername)
	{
		WebDriver driver = null;
		
		if (browsername.equalsIgnoreCase("chrome"))
				driver = new ChromeDriver();
		else if (browsername.equalsIgnoreCase("Edge"))
			driver = new EdgeDriver();
		else if (browsername.equalsIgnoreCase("FireFox"))
			driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
}
