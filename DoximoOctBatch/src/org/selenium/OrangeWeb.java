package org.selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeWeb {
	public static void main(String[] args) throws Exception{
		//Browser Configuration
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\User\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Selenium Oct\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
		//To launch browser -chrome
		WebDriver driver = new ChromeDriver();
		
		//To Open Web site by using get method 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//To maximize
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement userIn = driver.findElement(By.xpath("//input[@name='username']"));
		userIn.sendKeys("Admin");
		
		WebElement userPass = driver.findElement(By.xpath("//input[@type='password']"));
		userPass.sendKeys("admin123");
		
		WebElement buttLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		buttLogin.click();
		Thread.sleep(4000);
		
		WebElement css = driver.findElement(By.cssSelector("span[class='oxd-userdropdown-tab']"));
		css.click();
		
		WebElement about = driver.findElement(By.cssSelector("a[class='oxd-userdropdown-link']"));
		about.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='×']")).click();
		
//		 Alert a = driver.switchTo().alert();
//		 a.accept();
		
		
		WebElement tag = driver.findElement(By.tagName("a"));
		tag.click();
		
		WebElement linkTxt = driver.findElement(By.linkText("Book a Free Demo"));
		linkTxt.click();
		
		WebElement partialLinkTxt = driver.findElement(By.partialLinkText("Contact"));
		partialLinkTxt.click();
		
		WebElement contains = driver.findElement(By.id("navbarScrollingDropdown"));
		contains.click();;
		WebElement aboutUs = driver.findElement(By.xpath("(//a[contains(@class,'dropdown-item')])[1]"));
		aboutUs.click();
	}
}
