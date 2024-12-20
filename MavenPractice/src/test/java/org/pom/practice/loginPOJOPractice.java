package org.pom.practice;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPOJOPractice extends BaseClassPractice{
	public loginPOJOPractice() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
	private List<WebElement> txtUser;
	@FindBy(id="pass")
	private List<WebElement> txtPass;
	@FindBy(name="login")
	private List<WebElement> btnlogin;
	public List<WebElement> getTxtUser() {
		return txtUser;
	}
	public List<WebElement> getTxtPass() {
		return txtPass;
	}
	public List<WebElement> getBtnlogin() {
		return btnlogin;
	}
}
