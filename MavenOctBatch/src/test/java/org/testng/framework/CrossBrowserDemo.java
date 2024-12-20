package org.testng.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserDemo {
	public static WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void crossBrowserTest(String bws) {
		//For Chrome
		if(bws.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		//For InternetExplorer
		else if(bws.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("bharathan");
	}
}
