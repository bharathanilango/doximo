package org.rerun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class SetRetryPractice implements IAnnotationTransformer{

	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
		arg0.setRetryAnalyzer(RetryPractice.class);
		
	}

}
