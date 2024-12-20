package org.testng.framework;

import org.testng.annotations.Test;

public class ClassCSuite {
	@Test(groups="reg")
	public void tc7() {
		System.out.println("Test Case 7");
	}
	@Test(groups="smoke")
	public void tc8() {
		System.out.println("Test Case 8");
	}
	@Test(groups="sanity")
	public void tc9() {
		System.out.println("Test Case 9");
	}
	
}
