package com.statestreet.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"resources/com/statestreet/features"}, 
		glue = {"com.statestreet.step"}, 
		plugin = {"pretty", "html:target/cucumber-html-report", 
					"json:target/cucumber-json-report"} , 
		monochrome = true, 
		tags = {"@loansanction,@workfromhome"}
	)
public class TestRunner {
	// this class is only used 
	// as place holder 
	// NO BUSINESS LOGIC 
}
