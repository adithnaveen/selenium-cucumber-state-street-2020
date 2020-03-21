package com.ss.cucumber.step;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.ss.selenium.pom.ElearningLoginPOM;
import com.ss.selenium.util.DriverFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ElearningStep {

	private String url ="http://elearning.ohbreaks.com/"; 
	private WebDriver driver = null; 
	private ElearningLoginPOM elearningLoginPom = null; 
	// background 
	@Given("^the application is loaded$")
	public void the_application_is_loaded() throws Throwable {
	 this.driver = DriverFactory.getDriver("chrome"); 
	 
	 this.elearningLoginPom = new ElearningLoginPOM(driver); 
	 
	 // open the browser 
	 this.driver.get(url);
	}

	@Given("^the user name and password is entered$")
	public void the_user_name_and_password_is_entered() throws Throwable {
		Thread.sleep(2000);
		 this.elearningLoginPom.clickHomeLoginBtn();
		 Thread.sleep(200);
		 this.elearningLoginPom.sendMobileNumber("8989898989");
		 Thread.sleep(200);
		 this.elearningLoginPom.sendPassword("secret12345");
		 Thread.sleep(200);
		 this.elearningLoginPom.clickSignInBtn(); 
	}

	@When("^the user credentials are valid$")
	public void the_user_credentials_are_valid() throws Throwable {
		// TODO Success! Authentication Verified
		// create a new step, make an entry in pom with xpath / id 
		// assert 
		assertEquals("hi", "hi");
	}

	@Then("^take user to home page$")
	public void take_user_to_home_page() throws Throwable {
		 //  My Course Library - check if this link is available 
	}

	@Then("^check the name of the user$")
	public void check_the_name_of_the_user() throws Throwable {
		String expectedString = "Mr. Gordan"; 
		System.out.println("from site logged in Name " + this.elearningLoginPom.getLoginName());

		 assertEquals("sorry the logged in name is wrong", 
				 expectedString, this.elearningLoginPom.getLoginName());
		 this.driver.close(); 
	}

}
