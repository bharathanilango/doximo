package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {
	public static void main(String[] args) throws InterruptedException {
		//browser configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\OneDrive\\Desktop\\Selenium Oct\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//open the URL by using the get method
		driver.get("https://www.redbus.in/");
		
		/*it is a interface , is fastest and easy to interact with hidden elements
		it is used to highlight the web elements
		if locators does not work properly we can go with the JavascriptExecutor
		*/
		//down casting 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
		//to pass the input to the web page from input field
		js.executeScript("arguments[0].setAttribute('value', 'chennai')", from);
		
		WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
		//to  pass the input to the web page to input field
		js.executeScript("arguments[0].setAttribute('value', 'pattukkottai')", to);
		Object o = js.executeScript("return arguments[0].getAttribute('value')", to);
		System.out.println(o);
		Thread.sleep(2000);
		
		//For scroll up and scroll down by using scrollIntoView method
		WebElement scrollDown = driver.findElement(By.xpath("//h2[text()='ENJOY THE APP!']"));
		//for scrolling down
		js.executeScript("arguments[0].scrollIntoView('true')", scrollDown);
		Thread.sleep(2000);
		WebElement scrollUp = driver.findElement(By.xpath("//h2[text()='TRENDING OFFERS']"));
		//for scrolling up
		js.executeScript("arguments[0].scrollIntoView('false')", scrollUp);
	}
}
