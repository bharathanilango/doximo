package org.selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionOnMouse {
	public static void main(String[] args) throws InterruptedException {
		//browser configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium Oct\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the web page
		driver.manage().window().maximize();
		//open the URL by using get method
//driver.get("https://www.amazon.in/");
		
//driver.get("https://www.google.com/");
		
driver.get("https://demo.guru99.com/test/drag_drop.html");
		//action class used for mouse and key board actions
		Actions act = new Actions(driver);
		
//      ***********for amazon**********
/*      WebElement mouseOver = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
        act.moveToElement(mouseOver).perform();
*/		
//      ***********For Google**********
/*      Thread.sleep(2000);
        WebElement contextClk = driver.findElement(By.xpath("//a[text()='Gmail']"));
        act.contextClick(contextClk).perform();
		
        WebElement doubleClick = driver.findElement(By.xpath("//a[text()='Gmail']"));
        act.doubleClick(doubleClick).perform();
*/
//		***********For Demo guru *********
		WebElement src = driver.findElement(By.id("credit1"));
		WebElement destination =driver.findElement(By.id("loan"));
		act.dragAndDrop(src, destination).perform();
		Thread.sleep(3000);
		
		WebElement src1 =  driver.findElement(By.id("fourth"));
		WebElement destination1 = driver.findElement(By.id("amt8"));
		act.dragAndDrop(src1, destination1).perform();
	}
}
