package com.selenium.code.TestNGDemo.xml.log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4JClassDemo {

	Logger log = LogManager.getLogger("Log4JClassDemo");
	
	@Test
	public void test() {
		System.out.println("Logging demo started...");
		log.info("log info------------------- ");
	}
}
