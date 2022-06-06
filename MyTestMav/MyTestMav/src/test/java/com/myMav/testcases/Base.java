package com.myMav.testcases;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.myMav.utilities.Readproperties;



public class Base {
	
	ExtentHtmlReporter html;
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;
	Readproperties prop=new Readproperties();
	Logger log;
	String baseurl=prop.readurl();
	@BeforeClass()
	public void setup()
	{
	
		log=Logger.getLogger("MyTestMav");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GUNTUKU GEETHANJALI\\Downloads\\MyTestMav\\MyTestMav\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(baseurl);

}
	
	@AfterClass()
	public void tearDown()
	{
		driver.quit();
		extent.flush();
	
	
	}
	public void getScreenshot(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/screenshots/"+tname+".png");
		FileUtils.copyFile(src, target);
		
		
		
	}
	 @BeforeClass()
	public void extent()
	{
		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName="Test-Report-"+timeStamp+".html";
		html=new ExtentHtmlReporter("./reports/"+repName+".html");
		extent=new ExtentReports();
		extent.attachReporter(html);
	}
	@AfterMethod()
	public void get(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.fail(MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
			test.fail(result.getThrowable());
			String screenpath=System.getProperty("user.dir")+"\\screenshots\\"+result.getName()+".png";
			File f=new File(screenpath);
			if(f.exists())
			{
				try
				{
					test.fail("screenshot below:"+test.addScreenCaptureFromPath(screenpath));
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.pass(MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
			
		}
		else
		{
			test.skip(MarkupHelper.createLabel(result.getName(), ExtentColor.YELLOW));
			test.skip(result.getThrowable());
		} 
			
		
	}
	
	
	
}