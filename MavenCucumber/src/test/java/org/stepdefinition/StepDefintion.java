package org.stepdefinition;

import org.base.Base;
import org.pojo.LoginPOJO;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintion extends Base{
	LoginPOJO log;
	@Given("user is on login page")
	public void user_is_on_login_page() {

	}
	@When("user enters the username,password and click the login button")
	public void user_enters_the_username_password_and_click_the_login_button() {
	  log=new LoginPOJO();
	  type(log.getTextUser(), "bharathan");
	  type(log.getPassword(), "bharathan@123");
	  clickBtn(log.getBtnClick());
	}
	@Then("User get success message")
	public void user_get_success_message() {
		System.out.println("success..............");
	}


}
