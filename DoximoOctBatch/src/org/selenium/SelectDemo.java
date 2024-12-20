package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
	public static void main(String[] args) throws InterruptedException {
		//browser configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//open URL by using get method
		driver.get("https://letcode.in/dropdowns");
		//add delay
		Thread.sleep(2000);
		
		WebElement btnDropdown = driver.findElement(By.id("fruits"));
		//Select is a predefined class and it is used to perform drop down in web pages
		Select s = new Select(btnDropdown);
		//check the drop down is multiple selection option 
		boolean isMultiple = s.isMultiple();
		System.out.println(isMultiple);
		Thread.sleep(2000);
		//select based on the index
		s.selectByIndex(1);
		Thread.sleep(2000);
		//select based on the value
		s.selectByValue("1");
		Thread.sleep(2000);
		//select based on the visible text
		s.selectByVisibleText("Orange");
		
		WebElement btnDropdown1 = driver.findElement(By.id("superheros"));
		Select s1 = new Select(btnDropdown1);
		
		boolean isMultiple1 = s1.isMultiple();
		System.out.println(isMultiple1);
		Thread.sleep(2000);
		s1.selectByIndex(0);
		Thread.sleep(2000);
		s1.selectByValue("aq");
		Thread.sleep(2000);
		s1.selectByVisibleText("The Avengers");
		Thread.sleep(2000);
		s1.selectByVisibleText("Batman");
		Thread.sleep(2000);
		s1.deselectByIndex(2);
		Thread.sleep(2000);
		
		System.out.println("*******Get First Selected Option********");
		WebElement firstOption = s1.getFirstSelectedOption();
		System.out.println(firstOption.getText());
		
		System.out.println("*****Get Selected Options*******");
		List<WebElement> getAllSelectedOption = s1.getAllSelectedOptions();
		for(WebElement i : getAllSelectedOption) {
			System.out.println(i.getText());
		}
		System.out.println("*******Get All Option From The DropDown**********");
		List<WebElement> getAll = s1.getOptions();
		for(WebElement i : getAll) {
			System.out.println(i.getText());
		}
	}
}
