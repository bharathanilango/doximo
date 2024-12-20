package org.pom.practice;

public class DriverPractice extends BaseClassPractice{
	
	public static void main(String[] args) {
		launchBrowser();
		maximizeWindow();
		loadUrl("https://www.facebook.com/login");
		loginPOJOPractice l=new loginPOJOPractice();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		type(l.getTxtUser().get(0), "bharathan");
//		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(30));
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		type(l.getTxtPass().get(0), "bharathan@123");
		btnClick(l.getBtnlogin().get(0));
		quit();
	}
}
