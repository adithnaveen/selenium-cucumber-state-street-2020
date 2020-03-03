package com.statestreet.day2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	@Test(priority = 0, testName = "This test is with priority 0 ")
	public void f() {

		Assert.assertEquals("bye", "bye");
	}

	@Test(priority = 1,  testName = "This test is with priority 1 ")
	public void f1() {

		Assert.assertEquals("bye", "bye");
	}

	@Test(priority = 2, testName = "This test is with priority 2 ")
	public void f2() {

		Assert.assertEquals("bye", "bye");
	}
}
