package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsImplicitDemo {
	public static void main(String[] args) {
		//Browser configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//open URL by using get method
		driver.get("https://www.facebook.com/login/");
		
		//implicit delay for all web element 
		//it is common for all lines
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("bharathan@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("bharathan@123");
		
		driver.findElement(By.name("login")).click();
	}
}
