package org.pom.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	//launch the browser
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	//maximize the window
	public static void maximize() {
		driver.manage().window().maximize();
	}
	//launch the URL
	public static void loadUrl(String url) {
		driver.get(url);
	}
	//For input field
	public static void type(WebElement element, String name) {
		element.sendKeys(name);
	}
	//For click the button
	public static void btnLogin(WebElement element) {
		element.click();
	}
}
