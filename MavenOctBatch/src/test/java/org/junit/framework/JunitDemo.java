package org.junit.framework;

import org.junit.*;


public class JunitDemo {
	@BeforeClass
	public static void launchBrowser() {
		System.out.println("Browser launched");
	}
	@AfterClass
	public static void quit() {
		System.out.println("quit the browser");
	}
	@Before
	public void before() {
		System.out.println("launch before");
	}
	@After
	public void after() {
		System.out.println("launch After");
	}
	@Test
	public void test() {
		System.out.println("Test case 1");
	}
	@Test
	public void test1() {
		System.out.println("Test case 2");
	}
}
