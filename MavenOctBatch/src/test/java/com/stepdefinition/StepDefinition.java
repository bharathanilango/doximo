package com.stepdefinition;

import org.baseclass.BaseClass;
import org.pojo.loginPOJOClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	loginPOJOClass log;
	@Given("User is on login page")
	public void user_is_on_login_page() {

	}
	@When("User enters the username,password and click login button")
	public void user_enters_the_username_password_and_click_login_button() {
		log=new loginPOJOClass();
		type(log.getUserTxt(),"Bharathan");
		type(log.getUserPassword(), "Bharathan@123");
		buttonClick(log.getBtnLogin());
	}
	@Then("User get success message")
	public void user_get_success_message() {
		System.out.println("success....");
	}
	//for tag arun
	@Given("User is on login page1")
	public void user_is_on_login_page1() {
		
	}
	@When("User enters the username,password and click login button1")
	public void user_enters_the_username_password_and_click_login_button1() {
		log=new loginPOJOClass();
		type(log.getUserTxt(),"Arun");
		type(log.getUserPassword(), "Arun@123");
		buttonClick(log.getBtnLogin());
	}
	@Then("User get success message1")
	public void user_get_success_message1() {
	   
	}

}
