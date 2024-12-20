package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDemo {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		//browser configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		//launch the web page
		WebDriver driver = new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//to open web page by using url
		driver.get("https://www.facebook.com/login/");
		
		Robot r = new Robot();
		
		//for user id
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_SHIFT);
		
		Thread.sleep(2000);
		//for move to the next field
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		//for password
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_2);
		r.keyPress(KeyEvent.VK_3);
		r.keyRelease(KeyEvent.VK_3);
		
		
	}
}
