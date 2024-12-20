package org.stepdefinition;

import org.base.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	@Before
	public void beforeLaunch() {
		launchBrowser();
		maiximize();
		launchUrl("https://www.facebook.com/login/");
	}
	@After
	public void afterLaunch() {
		quitBrowser();
	}
}
