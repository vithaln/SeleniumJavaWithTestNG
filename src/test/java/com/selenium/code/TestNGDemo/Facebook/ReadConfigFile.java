package com.selenium.code.TestNGDemo.Facebook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {

	// this class is used to read the data from properties and text files data we
	// can use correct extension like text,prperties.
	String path = "D:\\New folder\\JAVA Exploring\\selenium\\TestNGDemo\\src\\test\\java\\com\\selenium\\code\\TestNGDemo\\Facebook\\Config.properties";

	Properties properties;

	ReadConfigFile() {

		properties = new Properties();
		try {
			FileInputStream fi = new FileInputStream(path);
			try {
				properties.load(fi);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// get the URL from properties/text file
	public String getBaseURL() {

		String url = properties.getProperty("url");

		if (!url.isEmpty()) {
			return url;
		} else {
			return new String("Url is not specified...");
		}
	}

	// get the username from properties/text file
	public String getUsename() {

		String uname = properties.getProperty("username");

		if (!uname.isEmpty()) {
			return uname;
		} else {
			return new String("uname is not specified...");
		}
	}

	// get the password from properties/text file
	public String getPassword() {

		String pwd = properties.getProperty("password");

		if (!pwd.isEmpty()) {
			return pwd;
		} else {
			return new String("pwd is not specified...");
		}
	}

}
