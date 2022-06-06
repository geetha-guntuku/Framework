package com.myMav.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.myMav.pageObjects.Rent;

public class Rent1 extends Base {
	@Test()
	public void rental() throws InterruptedException, IOException
	{
		Rent r1=new Rent(driver);
		r1.re1().click();
		Thread.sleep(8000);
		getScreenshot(driver,"rental");
		test=extent.createTest("rental");
	}

}
