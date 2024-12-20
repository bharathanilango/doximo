package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		
		//browser configuration
				System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
				//launch the web page
				WebDriver driver = new ChromeDriver();
				//to maximize the browser
				driver.manage().window().maximize();
				//to open web page by using url
				driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
				
				driver.findElement(By.id("alertBox")).click();
				Alert al = driver.switchTo().alert();
				al.accept();
				
				Thread.sleep(2000);
				driver.findElement(By.id("confirmBox")).click();
				al.dismiss();
				
				Thread.sleep(2000);
				driver.findElement(By.id("promptBox")).click();
				al.sendKeys("bharathan");
				al.accept();
				String getText=al.getText();
				System.out.println(getText);
	}
}
