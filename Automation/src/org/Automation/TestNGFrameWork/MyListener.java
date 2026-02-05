package org.Automation.TestNGFrameWork;

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

public class MyListener extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("TestCase "+ result.getName()+ " Has Started.", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TestCase "+ result.getName()+ " has Successfully Executed.", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TestCase " + result.getName() + " has Failed.", true);
		String ldt = LocalDateTime.now().toString();
		String datetime = ldt.replaceAll(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest  =new File("./errorshots/" + result.getName()+ datetime + ".png");
		try
		{
			FileHandler.copy(src, dest);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TestCase " + result.getName() + "has Skipped.", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("TestCase " + result.getName() + "has Failed with Some success percentage.", true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("TestCase " + result.getName() + " has Failed fdue to Timeout.", true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("<Test> " + context.getName() + " has Started.", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("<Test> " + context.getName() + "has Finished.", true);
	}

}
