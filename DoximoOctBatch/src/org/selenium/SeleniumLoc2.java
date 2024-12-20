package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLoc2 {
	public static void main(String[] args) throws Exception{
		//Browser Configuration
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\User\\\\\\\\Desktop\\\\\\\\Selenium Oct\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		
		//To launch the browser
		WebDriver driver = new ChromeDriver();
		
		//To Open web site by get method 
		driver.get("https://www.facebook.com/login/");
		
		//To maximize the web page
		driver.manage().window().maximize();
		
		//TO pass the input to the user field
		WebElement textUser = driver.findElement(By.xpath("//input[@id='email']"));
		textUser.sendKeys("bharathan@gmail.com");
		Thread.sleep(2000);
		
		//For sign up page
		WebElement signUp = driver.findElement(By.xpath("//a[@rel='nofollow']"));
		signUp.click();
		Thread.sleep(2000);
		
		//To return back to the previous page
		driver.navigate().back();
		
		//To pass the input to password field
		WebElement txtPass = driver.findElement(By.xpath("//input[@name='pass']"));
		txtPass.sendKeys("Bharathan@147");
		Thread.sleep(2000);
		
		//To Click the button
		WebElement click = driver.findElement(By.xpath("//button[@name='login']"));
		click.click();
		
	}
}
