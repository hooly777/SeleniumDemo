package com.qa.util;

import java.io.FileReader;
import java.util.Properties;

public class PropertyLoader {
	

	FileReader src;
	Properties p;
	public PropertyLoader()
	{
		
		try 
		{
			src=new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\Resource\\commonVariables.properties");
			p=new Properties();
			p.load(src);
		}
		catch(Exception e)
		{
			System.out.println("Error message is "+ e.getMessage());;
		}
	}
	
	public String getBaseURL()
	{
		return p.getProperty("base_url");
		
	}
	public String getUsername()
	{
		return p.getProperty("username");
		
	}
	
	public String getPassword()
	{
		return p.getProperty("password");
		
	}
	
	public String getBrowsertype()
	{
		return p.getProperty("browsertype");
		
	}

}
