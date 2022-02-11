package com.salesforcenew.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;

	public ReadConfig() {
		
		File src= new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		}
		catch(Exception e){
			System.out.println("Exception is " +e.getMessage());
		}
	}
		
		public String getApplicationURL()
		{
			String url =prop.getProperty("url");
			return url;
		}
		
		public String getUsername()
		{
			String userName =prop.getProperty("userName");
			return userName;
		}
		
		public String getPassword() {
			String password =prop.getProperty("password");
			return password;
			
		}
		
		public String getChromepath() {
			String chromepath =prop.getProperty("chromepath");
			return chromepath;
		}
		
		public String getDummyID() {
			return prop.getProperty("dummyUserName");			
		}
		
		
		public String getDummyPwd() {
			return prop.getProperty("dummyPassword");
		}
		
		public String getdummyPath() {
			return prop.getProperty("dummyPath");
		}
		
	}
	
	
	


