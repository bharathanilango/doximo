package org.testng.framework;

import org.testng.annotations.Test;

public class TestngDemo1 {
	//least priority for the +ve value
	@Test(priority = 1)
	private void tc1() {
		System.out.println("Test case 1");
	}
	@Test//Default value of priority is 0
	private void tc2() {
		System.out.println("Test case 2");
	}
	//First Priority for -ve value
	@Test(priority = -1)
	private void tc3() {
		System.out.println("Test case 3");
	}
	//enabled is used for skip the test case
	@Test(enabled = false)
	private void tc4() {
		System.out.println("Test case 4");
	}
	/*repeat the test case based on the specified value
	with the help of invocationCount we can check the stability of 
	the test case*/
	@Test(invocationCount = 4)
	private void tc5() {
		System.out.println("Test case 5");
	}
	@Test
	private void tc6() {
		System.out.println("Test case 6");
	}
	
}
