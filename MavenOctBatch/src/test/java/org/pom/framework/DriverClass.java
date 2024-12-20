package org.pom.framework;

public class DriverClass extends BaseClass{
	public static void main(String[] args) {
		//Browser configuration
		launchBrowser();
		maximize();
		loadUrl("https://www.facebook.com/login/");
		
		//passing the inputs by using BaseClass methods 
		LoginPOJOClass l = new LoginPOJOClass();
		type(l.getTextUser().get(0), "Bharathan");
		type(l.getTextPass().get(0), "Bharathann@123");
		btnLogin(l.getBtnLogin().get(0));
	}
}
