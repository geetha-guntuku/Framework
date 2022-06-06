package com.myMav.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.myMav.pageObjects.Login;

public class Login1 extends Base {
	@Test()
	public void log() throws InterruptedException, IOException
	{
		Login l1=new Login(driver);
		l1.ln1().click();
		Thread.sleep(8000);
		getScreenshot(driver,"log");
		test=extent.createTest("log");
	}


}
