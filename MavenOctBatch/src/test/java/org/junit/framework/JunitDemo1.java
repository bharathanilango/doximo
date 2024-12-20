package org.junit.framework;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitDemo1 {
	public static WebDriver driver;
	@Test
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("bharathan");
		String name = txtUser.getAttribute("value");
		//compare and check the expected and actual String
		Assert.assertEquals("Verify", "bharathan", name);
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Bharathan@123");
		
		WebElement btnLog = driver.findElement(By.name("login"));
		btnLog.click();
		
		String title = driver.getTitle();
		System.out.println(title);
		//Check the condition it accept only true if it's false it will throw error
		boolean b = title.contains("Log in to Facebook");
		Assert.assertTrue("verify title", b);
	}
}
