package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsEPractice {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
		js.executeScript("arguments[0].setAttribute('value','chennai')", from);
		
		WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
		js.executeScript("arguments[0].setAttribute('value', 'thanjavur')", to);
		
//		WebElement btnLog = driver.findElement(By.name("login"));
//		js.executeScript("arguments[0].click()", btnLog);
		
		Thread.sleep(2000);
		
		WebElement scrollDown = driver.findElement(By.xpath("//h2[text()='ENJOY THE APP!']"));
		js.executeScript("arguments[0].scrollIntoView('true')", scrollDown);
	}
}
