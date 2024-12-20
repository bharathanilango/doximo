package org.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsDemo {
	public static void main(String[] args) throws InterruptedException {
		//Browser Configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//open URL by using get method
		driver.get("https://www.snapdeal.com/");
		//add delay
		Thread.sleep(2000);
		
		WebElement input = driver.findElement(By.id("inputValEnter"));
		input.sendKeys("Hand Sanitizer");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		driver.findElement(By.xpath("(//img[@class='product-image '])[2]")).click();
		Thread.sleep(3000);		
		//getting parent id 
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		//getting parent id as well as child id
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		//access the parent window by using parentWindowId reference
		driver.switchTo().window(parentWindowId);
		Thread.sleep(3000);
		//access the child window1
		for(String cd : allWindow) {
			if(!parentWindowId.equals(cd)) {
				driver.switchTo().window(cd);
			}
		}
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();//to click add cart btn
		driver.switchTo().window(parentWindowId);//return back to the parent window
		driver.findElement(By.xpath("(//img[@class='product-image '])[2]")).click();//to click the product
		Thread.sleep(3000);
		driver.switchTo().window(parentWindowId);//return back to the parent window
		Thread.sleep(3000);
		Set<String> allWindow1 = driver.getWindowHandles();
		System.out.println(allWindow1);//getting the all window id's
		for(String cd : allWindow1) {//for the child window 2
			if(!parentWindowId.equals(cd)) {
				driver.switchTo().window(cd);
			}
//		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		}
	}
}
