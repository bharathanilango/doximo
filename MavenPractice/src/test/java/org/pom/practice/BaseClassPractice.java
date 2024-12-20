package org.pom.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassPractice {
	public static WebDriver driver;
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void type(WebElement e, String value) {
		e.sendKeys(value);
	}
	public static void btnClick(WebElement e) {
		e.click();
	}
	public static void quit() {
		driver.quit();
	}
}
