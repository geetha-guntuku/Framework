package com.myMav.testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import com.myMav.pageObjects.Owner;

public class Owner1 extends Base {
	@Test()
	public void Own() throws InterruptedException, IOException
	{
		Owner o1=new Owner(driver);
		o1.ow1().click();
		Thread.sleep(8000);
		getScreenshot(driver,"Own");
		test=extent.createTest("Own");
	}

}
