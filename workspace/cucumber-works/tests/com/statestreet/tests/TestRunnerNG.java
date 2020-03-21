package com.statestreet.tests;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"resources/com/statestreet/features"}, 
		glue = {"com.statestreet.step"}, 
		plugin = {"pretty", "html:target/cucumber-html-report", 
					"json:target/cucumber-json-report"} , 
		monochrome = true, 
		tags = {"@login"}
	)
@Test
public class TestRunnerNG extends AbstractTestNGCucumberTests {

}
