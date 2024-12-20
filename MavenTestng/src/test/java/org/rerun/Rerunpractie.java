package org.rerun;

import org.testng.annotations.Test;

public class Rerunpractie {
	@Test
	public void tc1() {
		System.out.println("testcase1");
	}
//	@Test(retryAnalyzer=RetryPractice.class)
	@Test
	public void tc2() {
		System.out.println("testcase2");
//		Assert.assertTrue(false);
		System.out.println("testcase3");
		System.out.println("testcase4");
		System.out.println("testcase5");
	}
	@Test
	public void tc3() {
		System.out.println("testcase6");
	}
}
