package org.junit.practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class JunitFacebook extends JunitBase{
	@Test
	public void facebookLogin() {
		
		driver.get("https://www.facebook.com/login/");
		
		//For getting the title
		String title = driver.getTitle();
		System.out.println("Title of facebook :-"+title);
		
		//assert equal to verifies the values are equal
		Assert.assertEquals("Verifying the title of web page is same", "Log in to Facebook", title);
		driver.findElement(By.id("email")).sendKeys("bharathan");
		driver.findElement(By.id("pass")).sendKeys("Bharathan@123");
		System.out.println("facebook login page");
	}
}
