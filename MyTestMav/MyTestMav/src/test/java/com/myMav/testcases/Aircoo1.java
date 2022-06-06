package com.myMav.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.myMav.pageObjects.Aircoo;

public class Aircoo1 extends Base {
	@Test()
	public void Air() throws InterruptedException, IOException
	{
		Aircoo A1=new Aircoo(driver);
		A1.ac1().click();
		Thread.sleep(8000);
		getScreenshot(driver,"Air");
		test=extent.createTest("Air");
	}


}
