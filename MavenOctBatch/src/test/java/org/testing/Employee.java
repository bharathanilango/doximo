package org.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Employee {
	public static void main(String[] args) {
		//Browser Configuration
		WebDriverManager.chromedriver().setup();
		//To launch the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//TO open the URL by using get method
		driver.get("https://www.facebook.com/login/");
	}
}
