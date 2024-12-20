package org.testng.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParaPractice {
	public static WebDriver driver;
	@Parameters({"name","password"})
	@Test
	public void facebookLogin(String name,String password) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement textUser=driver.findElement(By.id("email"));
		textUser.sendKeys(name);
		WebElement textPass=driver.findElement(By.id("pass"));
		textPass.sendKeys(password);
		driver.quit();
	}
	@Parameters({"name","password"})
	@Test(priority=1)
	public void instaLogin(String name, String password) throws InterruptedException {
		WebDriverManager.operadriver().setup();
		OperaOptions options=new OperaOptions();
		driver=new OperaDriver(options);
		options.setBinary("C:\\Users\\User\\AppData\\Local\\Programs\\Opera\\launcher.exe");
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(2000);
		WebElement userText=driver.findElement(By.name("username"));
		userText.sendKeys(name);
		WebElement userPass=driver.findElement(By.name("password"));
		userPass.sendKeys(password);
		driver.quit();
	}
}
