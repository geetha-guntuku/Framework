package com.myMav.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.myMav.pageObjects.Refresh;

public class Refresh1 extends Base {
	@Test()
	public void Refres() throws InterruptedException, IOException
	{
		Refresh n1=new Refresh(driver);
		n1.fr1().click();
		Thread.sleep(8000);
		getScreenshot(driver,"Refres");
		test=extent.createTest("Refres");
	

	}

}
