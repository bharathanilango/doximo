package org.testng.framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void tc1() {
		Assert.assertTrue(false);
		System.out.println("Test Case 1");
	}
	//depends on method tc1 if tc1() method is fails 
	//tc2() will be skipped because it
	//depends on method tc1()
	@Test(dependsOnMethods= {"tc1"})
	public void tc2() {
		System.out.println("Test Case 2");
	}
	@Test
	public void tc3() {
		System.out.println("Test Case 3");
	}
	
}
