package org.selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class TestRedbusApp {
	public static void main (String[] args)throws Exception{
		//Browser configuration
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\User\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Selenium Oct\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		WebElement fromIn = driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]"));
		fromIn.sendKeys("chennai");
		
		WebElement toIn = driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]"));
		toIn.sendKeys("pattukkottai");
		Thread.sleep(3000);
		
		WebElement date = driver.findElement(By.xpath("//div[@tabindex='3']"));
		date.click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement date1 = driver.findElement(By.className("dateText"));
		act.doubleClick(date1).perform();
//		driver.findElement(By.xpath("//text[text()='2024']")).click();
		
		WebElement search = driver.findElement(By.xpath("//button[contains(@tabindex,'5')]"));
		search.click();
		
		
	}
}
