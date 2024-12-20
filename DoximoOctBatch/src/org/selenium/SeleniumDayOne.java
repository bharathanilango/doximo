package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDayOne {
	public static void main(String[] args) {
		
		//Browser Configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		
		//Launch The Browser - chrome
		WebDriver driver = new ChromeDriver();
		
		//open the browser by using get
		driver.get("https://www.facebook.com/login/");
		
		//TO get the title of web page
		String title = driver.getTitle();
		System.out.println(title);
		
		//TO get the URL of the web page
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//TO maximize the browser page
		driver.manage().window().maximize();
		
		//To close the web site page
		//driver.close();
		
		//To Close The all Tabs Of The Browser
		driver.quit();
	}
}
