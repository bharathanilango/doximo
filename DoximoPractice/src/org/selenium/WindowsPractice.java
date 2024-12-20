package org.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(2000);

		driver.findElement(By.id("inputValEnter")).sendKeys("hand sanitizer");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='product-image '])[3]")).click();

		String parentId = driver.getWindowHandle();
		System.out.println(parentId);

		driver.switchTo().window(parentId);

		Set<String> childId = driver.getWindowHandles();
		System.out.println(childId);
		for(String s: childId) {
			if(!parentId.equals(childId)) {
				driver.switchTo().window(s);
			}
		}
	}
}


