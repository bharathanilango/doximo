package org.pom.framework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJOClass extends BaseClass {
	//To handle the StaleElementReferenceException
	public LoginPOJOClass() {
		PageFactory.initElements(driver, this);
	}
	
	//For User ID input field 
	@FindBys({
		@FindBy(id="email")
	})
	private List<WebElement> textUser;
	//For User Password field
	@FindBy(id="pass")
	private List<WebElement> textPass;
	//For Button login
	@FindBy(xpath="//button[@name='login']")
	private List<WebElement> btnLogin;
	
	//getter method for access the private variables
	public List<WebElement> getTextUser() {
		return textUser;
	}
	public List<WebElement> getTextPass() {
		return textPass;
	}
	public List<WebElement> getBtnLogin() {
		return btnLogin;
	}
}
