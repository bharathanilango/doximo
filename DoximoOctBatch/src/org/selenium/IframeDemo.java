package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {
	public static void main(String[] args) throws InterruptedException {
		//Browser Configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//open URL by using get method
		driver.get("https://letcode.in/frame");
		//add delay
		Thread.sleep(2000);
		driver.switchTo().frame("firstFr");
		
		WebElement fname = driver.findElement(By.name("fname"));
		fname.sendKeys("Bhrathan");
		WebElement lname = driver.findElement(By.name("lname"));
		lname.sendKeys("Ilango");
		
		WebElement emailFrame = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(emailFrame);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("abc@gmail.com");
		
//		this method is used for immediately jump back to the parent frame
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		
		WebElement lname1 = driver.findElement(By.name("lname"));
		lname1.sendKeys("I");
		//method used for get back to main frame from child frame
		driver.switchTo().defaultContent();
		
		//This line will execute after all the child frame get back to the main frame 
		//else it will throw exception
		WebElement watchT = driver.findElement(By.xpath("//a[text()='Watch tutorial']"));
		watchT.click();
	}
}
