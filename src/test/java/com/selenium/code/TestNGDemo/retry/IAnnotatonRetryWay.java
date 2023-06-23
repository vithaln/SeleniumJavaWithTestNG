package com.selenium.code.TestNGDemo.retry;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

//but this class we need to use in xml file in listener tag.
public class IAnnotatonRetryWay implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod,
			Class<?> occurringClazz) {
		
		annotation.setRetryAnalyzer(RetryAnalyzerWay.class);
	}

}
