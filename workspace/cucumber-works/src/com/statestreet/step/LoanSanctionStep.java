package com.statestreet.step;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoanSanctionStep {

	// background 
	@Given("^load the application$")
	public void load_the_application() {
		System.out.println("*****************************************");
		System.out.println("...........load the application..........");
		System.out.println("*****************************************");
	}
	
	@Given("^the company is registered in \"([^\"]*)\" act$")
	public void the_company_is_registered_in_act(String year) throws Throwable {
		System.out.println("the company is registered in " + year + " act.... ");
	}

	@Given("^in india$")
	public void in_india(DataTable dataTable) throws Throwable {
		System.out.println("in india.....");
		System.out.println("this will also have data table ");
		
		for(Map<String, String> temp : dataTable.asMaps(String.class, String.class)) {
			System.out.println(temp.get("state") +", " + temp.get("city"));
		}
	}

	@When("^the company is formed with atleast \"([^\"]*)\" years$")
	public void the_company_is_formed_with_atleast_years(String noOfYears) throws Throwable {
		System.out.println("the company is formed with atleast  " + noOfYears + " years.... ");
	}

	@Then("^\"([^\"]*)\" to issuing authority$")
	public void to_issuing_authority(String processStatus) throws Throwable {
		System.out.println(processStatus + "  to issuing authority..... ");
	}

}
