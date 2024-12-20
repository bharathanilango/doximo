package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> tr = table.findElements(By.tagName("tr"));
//		for(WebElement w : tr) {
//			System.out.println(w.getText());
//		}
//		List<WebElement> th = table.findElements(By.tagName("th"));
//		for(WebElement w : th) {
//			System.out.println(w.getText());
//		}
//		List<WebElement> td = table.findElements(By.tagName("td"));
//		for(WebElement w : td) {
//			System.out.println(w.getText());
//		}
		for(int i=0; i<tr.size(); i++) {
			WebElement row = tr.get(i);
			System.out.println(row.getText());
		}
	}
}
