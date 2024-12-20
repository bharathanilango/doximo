package org.testng.framework;

import org.testng.annotations.*;


public class TestngDemo {
	@BeforeClass
	private void launchBrowser() {
		System.out.println("Launch the browser");
	}
	@AfterClass
	private void quitBrowser() {
		System.out.println("quit the browser");
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before method");
	}
	@AfterMethod
	private void afterMethod() {
		System.out.println("After method");
	}
	@Test
	private void tc1() {
		System.out.println("test case 1");
	}

}
