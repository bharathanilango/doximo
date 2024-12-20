package org.testng.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterDemo {
	public static WebDriver driver;
	//passing the input by using testing.xml file
	@Parameters({"id","password"})
	@Test
	//if attributes name is mismatched we can default attribute name and value by using @Optional Annotation
	//public void testCase(@Optional("bharathan")String id,@Optional("Bharathan@123")String password)
	public void testCase(String id, String password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement userText = driver.findElement(By.id("email"));
		userText.sendKeys(id);
		WebElement userPass = driver.findElement(By.id("pass"));
		userPass.sendKeys(password);
	}
}
