package com.statestreet.day1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	String URL="https://www.google.com/"; 
	WebDriver driver ; 
	
	// this method will execute before every test case i.e., before @Test
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", 
				"/Volumes/Kanchan/MyTrainings/selenium-cucumber-state-street-2020/drivers/mac/chromedriver"); 
		driver = new ChromeDriver(); 
		driver.get(URL);
	}
	
	@After
	public void tearDown() {
		driver.close(); 	
	}
	
	@Test
	public void test() {
		String title = driver.getTitle(); 
		System.out.println("Title of the loaded Page -> " + title);
		
		
	}
	

}
