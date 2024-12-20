package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {
	public static void main(String[] args) throws InterruptedException {
		//Browser Configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//open URL by using get method
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//static delay
		Thread.sleep(2000);
		//for accessing the entire table
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		//for access the table rows 
		List<WebElement> tr = table.findElements(By.tagName("tr"));
		
		for(int i=0; i<tr.size(); i++) {
			WebElement row = tr.get(i);
			//for accessing the table headers
			List<WebElement> th = row.findElements(By.tagName("th"));
			for(int j=0; j<th.size(); j++) {
				String text = th.get(j).getText();
				System.out.println(text);
			}
			//for accessing the table data's
			List<WebElement> td = row.findElements(By.tagName("td"));
			for(int k=0; k<td.size(); k++) {
				String text = td.get(k).getText();
				System.out.println(text);
			}
		}
	}
}
