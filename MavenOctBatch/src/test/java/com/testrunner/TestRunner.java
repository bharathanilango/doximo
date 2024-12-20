package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/feature/facebook.feature"},glue={"com.stepdefinition"},dryRun=false,
plugin= {"pretty","html:src/test/resources/feature/report.html","json:src/test/resources/feature/reportjson.json"},
monochrome=true,tags="@tag")
public class TestRunner {

}