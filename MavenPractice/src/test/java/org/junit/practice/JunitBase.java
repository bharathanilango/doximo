package org.junit.practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitBase {
	public static WebDriver driver;
	@BeforeClass
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("launch browser....");
	}
	@AfterClass
	public static void quitBrowser() throws InterruptedException {
		Thread.sleep(500);
		driver.quit();
		System.out.println("quit browser....");
	}
	@Before
	public void loadUrl() {
		System.out.println("Loadig url....");
	}
	@After
	public void DoneMsg() {
		System.out.println("Test Completed....");
	}
}
