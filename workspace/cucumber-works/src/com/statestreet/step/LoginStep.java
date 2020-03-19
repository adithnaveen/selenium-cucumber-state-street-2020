package com.statestreet.step;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	@Given("^the application is running$")
	public void the_application_is_running() throws Throwable {
		System.out.println("the application is running********");
	}

	@When("^the username and password is entered$")
	public void the_username_and_password_is_entered(DataTable arg1)
				throws Throwable {
	
		System.out.println("the username and password is entered*******");
		// ctrl + 2 + l 
		
		List<Map<String, String>> list = 
				arg1.asMaps(String.class, String.class); 

//		System.out.println("User Name " + list.get(0).get("username"));
//		System.out.println("Password " + list.get(0).get("password"));
		
		
		for(Map<String, String> temp : list) {
			System.out.println(temp.get("username") +", " + temp.get("password"));
		}
	}

	@Then("^take user to home screen$")
	public void take_user_to_home_screen() throws Throwable {
		System.out.println("take user to home screen**********");
	}
}
