package com.statestreet.day2;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.statestree.driver.Driver;
import com.statestree.driver.DriverFactory;
import com.statestree.waits.WaitTypes;
import com.statestreet.pom.FlightPagePOM;
import com.statestreet.pom.FlightPagePOM01;
import com.statestreet.screenshots.CaptureScreenShot;

public class FligtTicketBookingTest {
	private WebDriver driver ; 
	private CaptureScreenShot scrShot; 
	private WaitTypes waitTypes; 
	private FlightPagePOM flightPagePom; 
	private FlightPagePOM01 pom1; 
	
	// this method will execute before every test case i.e., before @Test
	@Before
	public void setUp() {
		driver = DriverFactory.getDriver(Driver.BROWSER_CHROME);
		scrShot = new CaptureScreenShot(driver);
		waitTypes = new WaitTypes(driver); 
		flightPagePom = new FlightPagePOM(driver);
		pom1 = new FlightPagePOM01(driver); 
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close(); 	
	}
	
	@Ignore
	@Test
	public void test() throws InterruptedException{
		flightPagePom.loadPage(); 
		flightPagePom.clickFligtsTab();
		Thread.sleep(5000);
		flightPagePom.sendFlyFrom("Bengaluru, India (BLR-Kempegowda Intl.)");
		flightPagePom.sentFlyTo("Delhi, India (DEL-Indira Gandhi Intl.)");
		flightPagePom.clickAndSendDepartDate("13/03/2020");
		flightPagePom.clickAndSendreturnDate("17/03/2020");
		flightPagePom.selectNumberOfAdults(3);
	}
	
	
	
	@Test
	public void testPom1() throws InterruptedException{
		pom1.loadPage(); 
		pom1.clickFlightTab(); 
		pom1.sendFlyFrom("Bengaluru, India (BLR-Kempegowda Intl.)");
		pom1.sendFlyTo("Delhi, India (DEL-Indira Gandhi Intl.)");
		pom1.sendDeptDate("13/03/2020");
		pom1.sendRetDate("17/03/2020");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
