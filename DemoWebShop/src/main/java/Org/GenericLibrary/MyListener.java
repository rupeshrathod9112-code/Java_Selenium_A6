package Org.GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListener extends BaseTest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("[TestCase "+result.getName()+" Has Started]",true);

	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("[TestCase "+result.getName()+" Has Successfully executed]",true);
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("[TestCase "+result.getName()+" Has Been Failed]",true);
		
		String idt = LocalDateTime.now().toString();
		String dateTime = idt.replaceAll(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShoot/"+result.getName()+dateTime+".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("[TestCase "+result.getName()+" Has Skippedd]",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		Reporter.log("[TestCase "+result.getName()+" Has Failed With Some Success Percentage]",true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		Reporter.log("[TestCase "+result.getName()+" Has Failed Due To Timeout]",true);
	}

	@Override
	public void onStart(ITestContext context) 
	{
		Reporter.log("<test> "+context.getName()+" Has Started",true);
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		Reporter.log("<test> "+context.getName()+" Has Finished",true);
	}

}
