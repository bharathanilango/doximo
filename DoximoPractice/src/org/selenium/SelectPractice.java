package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");

		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s = new Select(fruits);
		boolean b = s.isMultiple();
		System.out.println(b);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByVisibleText("Mango");
		Thread.sleep(2000);
		s.selectByValue("3");
		Thread.sleep(2000);
		List<WebElement> getAll = s.getOptions();
		for(WebElement w : getAll) {
			System.out.println(w.getText());
		}
		WebElement getFirst = s.getFirstSelectedOption();
		System.out.println(getFirst.getText());
		
		WebElement superHeros = driver.findElement(By.id("superheros"));
		Select s1 = new Select(superHeros);
		s1.selectByIndex(1);
		s1.selectByIndex(2);
		s1.selectByIndex(4);
		s1.selectByIndex(3);
		s1.deselectAll();
		Thread.sleep(2000);
		s1.selectByIndex(1);
		s1.selectByIndex(2);
		s1.selectByIndex(4);
		s1.selectByIndex(3);
		s1.deselectByIndex(3);
		s1.deselectByValue("3");
	}
}
