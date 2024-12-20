package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame("firstFr");
		
		WebElement fname = driver.findElement(By.name("fname"));
		fname.sendKeys("bharathan");
		WebElement lname = driver.findElement(By.name("lname"));
		lname.sendKeys("ilango");
		
		WebElement emailFrame = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(emailFrame);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("bharathan@123");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		WebElement watchT = driver.findElement(By.xpath("//a[text()='Watch tutorial']"));
		watchT.click();
		
	}
}
