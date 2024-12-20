package org.junit.practice;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class JunitFlipkart extends JunitBase{
	@Test
	public void flipkart() throws InterruptedException {
		//implicityWaits
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		//Assertion
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).click();
		
		//for console
		System.out.println("flipkart page");
	}
}
