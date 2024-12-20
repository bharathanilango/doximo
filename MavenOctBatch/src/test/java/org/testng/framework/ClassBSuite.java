package org.testng.framework;

import org.testng.annotations.Test;

public class ClassBSuite {
	//groups attribute for giving the 
	//value for the methods with the help of 
	//the value we can call in <include>tag
	@Test(groups="reg")
	public void tc4() {
		System.out.println("Test Case 4");
	}
	@Test(groups="smoke")
	public void tc5() {
		System.out.println("Test Case 5");
	}
	@Test(groups="sanity")
	public void tc6() {
		System.out.println("Test Case 6");
	}
	
}
