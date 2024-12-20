package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public void maximize() {
		driver.manage().window().maximize();
	}
	public void loadUrl(String url) {
		driver.get(url);
	}
	public void type(WebElement e, String value) {
		e.sendKeys(value);
	}
	public void buttonClick(WebElement e) {
		e.click();
	}
	public void quitBrowser() {
		driver.quit();
	}
}
