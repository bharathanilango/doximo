package org.junit.framework;

import org.junit.Ignore;
import org.junit.Test;

public class Sample1 {
	@Test
	public void testCase3() {
		System.out.println("Test Case 3");
	}
	@Ignore//for ignoring the testcase4 - this annotation used for skip the method
	@Test
	public void testCase4() {
		System.out.println("Test Case 4");
	}
	@Test
	public void testCase5() {
		System.out.println("Test Case 5");
	}
}
