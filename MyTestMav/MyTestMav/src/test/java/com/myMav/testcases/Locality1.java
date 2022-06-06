package com.myMav.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.myMav.pageObjects.Locality;

public class Locality1 extends Base {
	@Test()
	public void loc() throws InterruptedException, IOException
	{
		Locality ol1=new Locality(driver);
		ol1.lo1().click();
		ol1.lo1().sendKeys("Karmanghat");
		Thread.sleep(8000);
		getScreenshot(driver,"loc");
		test=extent.createTest("loc");
	}


}
