package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotDemo {
	public static void main(String[] args) throws IOException {
		//browser configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		//launch the browser 
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//open URL by using get method
		driver.get("https://www.facebook.com/login/");
		
		//To take the screenshot we have to use the TakeScreenshot interface
		//we need to downcast the WebDriver Interface with the help of reference address 
		//we can access the method of the TakeScreenshot interface and take screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		//taking screenshot by using getScreenshotAs method 
		File src = ts.getScreenshotAs(OutputType.FILE);
		//copy the src and save it in the destination folder
		File destination = new File("C:\\Users\\User\\eclipse-workspace\\DoximoOctBatch\\Screenshotpage\\facelogin1.jpeg");
		FileUtils.copyFile(src, destination);
	}
}
