package com.myMav.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readproperties {
	Properties pro;
	public Readproperties()
	{
		File src=new File("./configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			}catch(Exception e)
		{
				System.out.println("exception occured");
		}
		
	}
	public String readurl()
	{
		String url=pro.getProperty("baseurl");
		return url;
	}
	public String getchromepath()
	{
		String path=pro.getProperty("chromepath");
		return path;
	}


}
