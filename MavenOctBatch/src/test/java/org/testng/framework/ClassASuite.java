package org.testng.framework;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class ClassASuite {
	@Test(groups="reg")
	public void tc1() {
//		Assert.assertTrue(false);
		System.out.println("Test Case 1");
		
	}
	@Test(groups="smoke")
	public void tc2() {
		System.out.println("Test Case 2");
	}
	@Test(groups="sanity")
	public void tc3() {
		System.out.println("Test Case 3");
	}
	
}
