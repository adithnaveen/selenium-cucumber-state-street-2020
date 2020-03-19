package com.statestreet.step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WorkFromHomeStep {

	@Given("^the public transport is not available$")
	public void the_public_transport_is_not_available() {
		System.out.println("the public transport is not available>>>>>>");
	}

	@And("^the office is not opened$")
	public void the_office_is_not_opened() {
		System.out.println("the office is not opened>>>>>>>");
	}
	
	
//    When work from home option is "allowed"

	
	@When("^work from home option is \"([a-zA-Z0-9]{1,})\"$")
	public void work_from_home_option_is_allowed(String value) {
		System.out.println("work from home option is "+value+">>>>");
	}
	
	@Then("^the work is done$")
	public void the_work_is_done() {
		System.out.println("the work is done>>>>>");
	}

	@But("need to fill time sheet")
	public void need_to_fill_time_sheet() {
		System.out.println("need to fill time sheet>>>>>");
	}


	@Then("^need managers approval$")
	public void need_managers_approval() throws Throwable {
		System.out.println("need managers approval>>>>>>>>>>>>");
	}

}
