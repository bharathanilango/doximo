package org.testng.framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	public static WebDriver driver;
	@Test
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	//get the data from DataProvider 
	@Test(dataProvider="sampleData")
	public void setValues(String id, String password) {
//		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/login/");
//		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("email")));
		driver.findElement(By.id("email")).sendKeys(id);
//		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("password")));
		driver.findElement(By.name("pass")).sendKeys(password);
	}
	//Send the bulk of data to the @test method
	//merge with the help of data provider method name
	@DataProvider(name="sampleData")
	public Object[][] sendValues(){
		return new Object[][] {
			{"xyz", "xyz@123"},
			{"abc", "abc@123"},
			{"ijk", "ijk@123"},
		};
	}
//	@Test
//	public void quit() throws InterruptedException {
//		Thread.sleep(15000);
//		driver.quit();
//	}
}
