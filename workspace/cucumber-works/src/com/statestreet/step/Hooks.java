package com.statestreet.step;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	
	// before 
	@Before
	public void setUp() {
		System.out.println("------------------------------");
		System.out.println("i'm from setUp");
		System.out.println("------------------------------");
	}
	
	// after 
	@After
	public void tearDown() {
		System.out.println("------------------------------");
		System.out.println("i'm from tearDown");
		System.out.println("------------------------------");
		
	}
}
