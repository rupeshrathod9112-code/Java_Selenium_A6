package ClassMock1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 17", Keys.ENTER);
		driver.findElement(By.xpath("//span[contains(text(),'iPhone 17 Pro 256 GB') and contains(text(),' Silver')]/../../../..//button[text()='Add to cart']")).click();
		
		String Price = driver.findElement(By.xpath("//span[contains(text(),'iPhone 17 Pro 256 GB') and contains(text(),' Silver')]/../../../..//span[@class='a-price-whole']")).getText();
	
			System.out.println("Price of the product = "+ Price);
	
	
	}
}
