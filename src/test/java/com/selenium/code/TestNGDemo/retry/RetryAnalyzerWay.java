package com.selenium.code.TestNGDemo.retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerWay implements IRetryAnalyzer{

//	keep track retry attempts
	int countRetryAttempts=0;
//	set max limit of retry
	int setMaxLimit=3;
	
	
	@Override
	public boolean retry(ITestResult result) {
	
		if(!result.isSuccess()) {
			
			if(countRetryAttempts<setMaxLimit) {
				
				countRetryAttempts++;
				return true;
				
			}
		}
		
		return false;
	}

}
