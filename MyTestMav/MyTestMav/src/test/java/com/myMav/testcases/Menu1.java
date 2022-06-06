package com.myMav.testcases;
import java.io.IOException;

import org.testng.annotations.Test;

import com.myMav.pageObjects.Menu;

public class Menu1 extends Base {
	@Test()
	public void getex() throws InterruptedException, IOException
	{
		Menu m1=new Menu(driver);
		m1.mn1().click();
		Thread.sleep(8000);
		getScreenshot(driver,"getex");
		test=extent.createTest("getex");
	}

}
