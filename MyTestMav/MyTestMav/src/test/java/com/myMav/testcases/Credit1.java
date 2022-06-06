package com.myMav.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.myMav.pageObjects.Credit;

public class Credit1 extends Base{
	@Test()
	public void cred() throws InterruptedException, IOException
	{
		Credit k1=new Credit(driver);
		k1.cr1().click();
		Thread.sleep(8000);
		getScreenshot(driver,"cred");
		test=extent.createTest("cred");
	}


}
