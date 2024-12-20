package com.stepdefinition;

import org.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends BaseClass{
	@Before
	public void beforeExecution() {
		launchBrowser();
		maximize();
		loadUrl("https://www.facebook.com/login/");
	}
	@After
	public void afterExecution() {
		quitBrowser();
	}
}
