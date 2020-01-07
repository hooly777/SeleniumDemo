package com.qa.util;

import java.io.FileReader;
import java.util.Properties;

/**
 * @author Govardhan & Team
 * @version 1.0
 * @date 06-01-2020
 * 
 *
 */
public class PropertyLoader {
	
	/** Reading the commonVariables.properties file using File Reader **/
	public static FileReader src;
	public static Properties p;
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
			System.out.println("Error message is "+ e.getMessage());
		}
	}
	
	
	/**
	 * @author Govardhan & Team
	 * Method to get Base URL property from properties file
	 */
	/**Reading base url from property file and returning to base class**/
	public static String getBaseURL()
	{
		return p.getProperty("base_url");
		
	}
	
	/**
	 * @author Govardhan & Team
	 * Method to get  Userename property from properties file
	 */
	/**Reading user name from property file and returning to base class**/
	public static String getUsername()
	{
		return p.getProperty("username");
		
	}
	
	/**
	 * @author Govardhan & Team
	 * Method to get Password property from properties file
	 */
	/**Reading password from property file and returning to base class**/
	public static String getPassword()
	{
		return p.getProperty("password");
		
	}
	
	/**
	 * @author Govardhan & Team
	 * Method to get Browser Type property from properties file
	 */
	/**Reading Browser type from property file and returning to base class**/
	public static String getBrowsertype()
	{
		return p.getProperty("browsertype");
		
	}

}
