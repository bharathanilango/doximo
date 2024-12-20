package org.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsExplicitDemo {
	public static void main(String[] args) {
		//Browser configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//Open the URL by using get method
		driver.get("https://www.facebook.com/login/");
		
		//add Explicit delay for web elements it can't handle timeout Exception
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
//		w.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		
		//Fluent Wait and it can handle time out exception
		FluentWait<WebDriver> fw = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(Throwable.class);
		
		fw.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		driver.findElement(By.id("email")).sendKeys("bharathan@gmail.com");
		
		fw.until(ExpectedConditions.elementToBeClickable(By.id("pass")));
		driver.findElement(By.id("pass")).sendKeys("bharathan@123");
		
		fw.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		driver.findElement(By.name("login")).click();
	}
}
