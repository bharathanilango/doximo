	package org.testng.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesDemo {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\MavenOctBatch\\data.properties");
		WebDriverManager.chromedriver().setup();
		Properties p = new Properties();
		p.load(file);
		String s = p.getProperty("browser");
		System.out.println(s);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		
	}
}
