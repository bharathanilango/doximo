package org.testng.framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunDemo {
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
	}
	//To get the RetryDemo Class
	@Test(retryAnalyzer=RetryDemo.class)
//	@Test
	public void tc2() {
		System.out.println("Test Case 2");
//		Assert.asserstTrue(false);
		System.out.println("Test Case 3");
		System.out.println("Test Case 4");
	}
	@Test
	public void tc3() {
		System.out.println("Test Case 5");
	}
	
}
