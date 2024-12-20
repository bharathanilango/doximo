package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPOJOClass extends BaseClass{
	public loginPOJOClass() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
	private WebElement userTxt;
	@FindBy(id="pass")
	private WebElement userPassword;
	@FindBy(name="login")
	private WebElement btnLogin;
	//getter method for accessing the pojo class variable from another class
	public WebElement getUserTxt() {
		return userTxt;
	}
	public WebElement getUserPassword() {
		return userPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
}
