package com.selenium.code.liberty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

public class ReadCredentials {

	 Properties properties;
	String path = "D:\\New folder\\JAVA Exploring\\selenium\\TestNGDemo\\src\\test\\java\\com\\selenium\\code\\liberty\\credentials.properties";

	
	
	  public ReadCredentials() throws IOException { properties = new Properties();
	  FileInputStream fileInputStream = new FileInputStream(path);
	  properties.load(fileInputStream); }
	  
	  public String getLoginURL() {
	  
	  String URL = properties.getProperty("loginURL"); return URL; }
	  
	  public String getUserName() {
	  
	  String username = properties.getProperty("username"); return username; }
	  
	  public String getPassword() {
	  
	  String password = properties.getProperty("password"); return password; }
	 
	
	/*public static String getValueFromPropertiesFileByKey(String key) throws IOException {
		String path = "D:\\New folder\\JAVA Exploring\\selenium\\TestNGDemo\\src\\test\\java\\com\\selenium\\code\\liberty\\credentials.properties";

		FileInputStream fis=new FileInputStream(path);
		properties.load(fis);
		
		String value = properties.get(key).toString();
		if(StringUtils.isEmpty(value)) {
			throw new RuntimeException("Value is not present..");
		}
		
		return value;
		*/
		
	

	
}
