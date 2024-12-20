package org.pojo;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends Base{
	public LoginPOJO() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
	private WebElement textUser;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement btnClick;
	public WebElement getTextUser() {
		return textUser;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getBtnClick() {
		return btnClick;
	}
	
}
