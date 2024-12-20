package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public void maiximize() {
		driver.manage().window().maximize();
	}
	public void launchUrl(String url) {
		driver.get(url);
	}	
	public void type(WebElement e,String value) {
		e.sendKeys(value);
	}
	public void clickBtn(WebElement e) {
		e.click();
	}
	public void quitBrowser() {
		driver.quit();
	}
	
}