package org.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		//implicit waits
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		driver.findElement(By.id("email")).sendKeys("bharathan");
//		driver.findElement(By.name("pass")).sendKeys("bharathan@123");
//		driver.findElement(By.name("login")).click();
		
		//Explicit waits 1.WebDriverWait , 2.FluentWait
//		
		//1.Explicit waits
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
//		driver.findElement(By.id("email")).sendKeys("bharathan");
//		
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("pass")));
//		driver.findElement(By.name("pass")).sendKeys("bharathan@123");
		
		//2.FluentWaits
		FluentWait<WebDriver> f = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(Throwable.class);
		f.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		driver.findElement(By.id("email")).sendKeys("bharathan");
		
		f.until(ExpectedConditions.visibilityOfElementLocated(By.name("pass")));
		driver.findElement(By.name("pass")).sendKeys("bharathan@123");
	}
}
