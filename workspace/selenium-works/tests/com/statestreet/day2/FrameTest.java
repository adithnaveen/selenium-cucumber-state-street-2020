package com.statestreet.day2;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.statestree.driver.Driver;
import com.statestree.driver.DriverFactory;
import com.statestree.waits.WaitTypes;
import com.statestreet.screenshots.CaptureScreenShot;

public class FrameTest {

	
	
	
	private String URL="https://docs.oracle.com/javase/7/docs/api/"; 
	private WebDriver driver ; 
	private CaptureScreenShot scrShot; 
	private WaitTypes waitTypes; 
	
	// this method will execute before every test case i.e., before @Test
	@Before
	public void setUp() {
		driver = DriverFactory.getDriver(Driver.BROWSER_CHROME);
		scrShot = new CaptureScreenShot(driver);
		waitTypes = new WaitTypes(driver); 
		
		driver.get(URL);
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close(); 	
	}
	
	
	
	@Test
	public void test()  throws InterruptedException{
		
		String applet_xpath="/html/body/div[2]/ul/li[1]/a"; 
		
		String applectContext_xpath="/html/body/div/ul[1]/li[1]/a"; 
		
		Thread.sleep(4000);
		driver.switchTo().parentFrame().switchTo().frame("packageListFrame"); 
		waitTypes.waitForElementToBeClickableReady(By.xpath(applet_xpath), 10).click(); 

		 driver.switchTo().parentFrame().switchTo().frame("packageFrame"); 
		waitTypes.waitForElementToBeClickableReady(By.xpath(applectContext_xpath), 10).click();
		
	}

}
















