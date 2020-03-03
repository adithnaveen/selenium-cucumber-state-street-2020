package com.statestreet.day1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.statestree.driver.Driver;
import com.statestree.driver.DriverFactory;

public class ActionAmazonTest {

	
	String URL="https://www.amazon.in/"; 
	WebDriver driver ; 
	
	// this method will execute before every test case i.e., before @Test
	@Before
	public void setUp() {
		driver = DriverFactory.getDriver(Driver.BROWSER_CHROME); 
		driver.get(URL);
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close(); 	
	}
	
	
	
	@Test
	public void test() throws InterruptedException{

		String accountAndList_Xpath="//*[@id=\"nav-link-accountList\"]/span[2]"; 
		String primeVideo_xpath="//*[@id=\"nav-al-your-account\"]/a[6]/span"; 
		String register30Days="//*[@id=\"a9aff880-a0b6-4dcd-b4c1-4d8a6b46efeb\"]/div/div[2]/div[2]/a[1]/span[2]"; 
		
		
		WebElement accountAndListElement = driver.findElement(By.xpath(accountAndList_Xpath)); 
		
		Actions action = new Actions(driver); 
		
		action.moveToElement(accountAndListElement).perform(); 
		
		Thread.sleep(2000);
		
		WebElement primeVideoElement = driver.findElement(By.xpath(primeVideo_xpath));
		action.moveToElement(primeVideoElement).click().perform();  
		
		driver.findElement(By.xpath(register30Days)).click(); 
		
		
	}

}





















