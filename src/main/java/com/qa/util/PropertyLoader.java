package com.qa.util;

import java.io.FileReader;
import java.util.Properties;

public class PropertyLoader {
	
	/** Reading the commonVariables.properties file using File Reader **/
	FileReader src;
	Properties p;
	/**Creating a constructor to initialize the properties**/
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
	
	/**Reading base url from property file and returning to base class**/
	public String getBaseURL()
	{
		return p.getProperty("base_url");
		
	}
	/**Reading user name from property file and returning to base class**/
	public String getUsername()
	{
		return p.getProperty("username");
		
	}
	/**Reading password from property file and returning to base class**/
	public String getPassword()
	{
		return p.getProperty("password");
		
	}
	/**Reading Browser type from property file and returning to base class**/
	public String getBrowsertype()
	{
		return p.getProperty("browsertype");
		
	}

}
