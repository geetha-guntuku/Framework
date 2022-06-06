package com.myMav.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.myMav.pageObjects.Property;

public class Property1 extends Base{
	@Test()
	public void prop() throws InterruptedException, IOException
	{
		Property j1=new Property(driver);
		j1.fr1().click();
		Thread.sleep(8000);
		getScreenshot(driver,"prop");
		test=extent.createTest("prop");
	

	}

}
