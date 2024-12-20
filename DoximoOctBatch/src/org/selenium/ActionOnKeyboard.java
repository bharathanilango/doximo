package org.selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionOnKeyboard {
	public static void main(String[] args) throws Exception{
		//Browser configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the web page
		driver.manage().window().maximize();
		//open the URL by using get method
		driver.get("https://www.facebook.com/login/");
		//create reference for the action class to perform key board actions
		Actions act = new Actions(driver);
		
		WebElement txt = driver.findElement(By.id("email"));
		act.keyDown(Keys.SHIFT).sendKeys(txt, "b").keyUp(Keys.SHIFT).sendKeys("harathan").perform();
		Thread.sleep(2000);
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("bharathan@123");
		Thread.sleep(4000);
		
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
	}
}
