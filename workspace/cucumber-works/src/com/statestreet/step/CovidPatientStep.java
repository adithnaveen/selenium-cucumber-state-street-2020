package com.statestreet.step;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CovidPatientStep {

	@Given("^the patient is fell ill$")
	public void the_patient_is_fell_ill() throws Throwable {
		System.out.println("the patient is fell ill------------");
	}

	@When("^has repeated \"([a-zA-Z0-9]{1,})\"$")
	public void has_repeated_caughing(String problem) throws Throwable {
		System.out.println("has repeated " + problem +"-------------");
	}

	@Then("^do a body checkout$")
	public void do_a_body_checkout() throws Throwable {
		System.out.println("do a body checkout-------------");
	}

	@Then("^keep patient in isolation$")
	public void keep_patient_in_isolation() throws Throwable {
		System.out.println("keep patient in isolation---------------");
	}

}
