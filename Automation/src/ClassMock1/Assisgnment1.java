package ClassMock1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assisgnment1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/admin/Downloads/Assign.html");
		
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		String Actualtitle = "https://www.swiggy.com/";
		Set<String> allWindowID = driver.getWindowHandles();
		
		String Exp;
				
		for( String windowid : allWindowID)
		{
			driver.switchTo().window(windowid);
			Exp = driver.getCurrentUrl();
			
			if (Actualtitle.equals(Exp))
			{
				driver.manage().window().maximize();
				driver.close();
			}
			
		}
	}
}
