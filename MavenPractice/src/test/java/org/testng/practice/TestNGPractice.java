package org.testng.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGPractice {
	@BeforeClass
	private void launchBrowser() {
		System.out.println("Browser Launced...");
	}
	@AfterClass
	private void quitBrowser() {
		System.out.println("Browser Quited successfuly...");
	}
	@Test
	public void busineesLogic() {
		System.out.println("It Holds business logics");
	}
}
