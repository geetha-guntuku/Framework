package com.myMav.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.myMav.pageObjects.Profile;

public class Profile1 extends Base {
	
	@Test()
	public void prof() throws InterruptedException, IOException
	{
		Profile p1=new Profile(driver);
		p1.pra1().click();
		Thread.sleep(8000);
		getScreenshot(driver,"prof");
		test=extent.createTest("prof");
	

	}

}
