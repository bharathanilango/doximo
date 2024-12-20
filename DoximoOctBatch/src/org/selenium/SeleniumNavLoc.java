package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Examples For Navigation and Locators
public class SeleniumNavLoc {
	public static void main(String[] args) throws Exception{
		
		//Browser Configuration
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\User\\\\Desktop\\\\Selenium Oct\\\\chromedriver_win32\\\\chromedriver.exe");
		
		//TO Launch The Browser
		WebDriver driver = new ChromeDriver();
		
		//To open the URL of the application by using navigate method
		driver.navigate().to("https://www.facebook.com/login/");
		
		//To maximize the web page
		driver.manage().window().maximize();
		
		//To delay the process
		Thread.sleep(2000);
		
		//To return back to the previous page of browser
		driver.navigate().back();
		
		//To forward the page 
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//To refresh the page
		driver.navigate().refresh();
		
		//Create the reference address to test the UI
		WebElement userId = driver.findElement(By.id("email"));
		//Send the keys to the input Tag of ID field
		userId.sendKeys("Bharathan@gmail.com");
		Thread.sleep(2000);
		
		WebElement userPass = driver.findElement(By.id("pass"));
		//Send the Keys to the input Tag of password field
		userPass.sendKeys("Bharathan@00");
		Thread.sleep(2000);
		
		WebElement click = driver.findElement(By.name("login"));
		//For Click the login button
		click.click();
	}
}
