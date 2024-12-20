package org.testng.framework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssert {
	@Test
	private void tc1(){
		System.out.println("test case 1");
	}
	@Test
	private void tc2(){
		System.out.println("test case 2");
		System.out.println("test case 3");
		// when we use Soft assert remaining lines will be execute
		SoftAssert s = new SoftAssert();
		s.assertTrue(false);
		System.out.println("test case 4");
		System.out.println("test case 5");
		//when we use Hard assert remaining lines will be not execute
		Assert.assertTrue(false);
		System.out.println("test case 6");
		System.out.println("test case 7");
		//By using the assertAll method, we can highlight SoftAssert failure 
		//at the particular @test, it only works with SoftAssert
		s.assertAll();
		
	}
	@Test
	private void tc3(){
		System.out.println("test case 8");
	}
	
	
}
