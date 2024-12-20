package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisiblityDemo {
	public static void main(String[] args) throws InterruptedException {
		//browser configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//open URL by using get method
		driver.get("https://www.facebook.com/login/");
		//add delay
		Thread.sleep(2000);
		
		//checking the visibility of the element by using methods
		WebElement btnLogin = driver.findElement(By.name("login"));
		//check the element is present or not,if it displayed it return true else false
		boolean isDisplayed = btnLogin.isDisplayed();
		System.out.println(isDisplayed);
		
		//check the element is enabled or not,if it enabled it return true else false
		boolean isEnabled = btnLogin.isEnabled();
		System.out.println(isEnabled);
		
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		WebElement gender = driver.findElement(By.id("sex"));
		gender.click();
		//check the element is selected or not it returns true if element is selected else it
		//returns false
		boolean isSelected = gender.isSelected();
		System.out.println(isSelected);
		
	}
}
