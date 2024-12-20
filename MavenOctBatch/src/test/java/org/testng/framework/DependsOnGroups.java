package org.testng.framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups {
	@Test(groups="r1")
	public void tc1() {
		Assert.assertTrue(false);
		System.out.println("Test Case 1");
	}
	/*depends on group name of tc1 if tc1() method is fails 
	 *tc2() will be skipped because it depends on group name
	 */  
	/*we can over come skip issue by using alwaysRun=true if we use 
	 *alwaysRun=true it will not skip even failure occurs in tc1()
	*/
	@Test(dependsOnGroups="r1",alwaysRun=true)
	public void tc2() {
		System.out.println("Test Case 2");
	}
	@Test(groups="s1")
	public void tc3() {
		System.out.println("Test Case 3");
	}
	
}
