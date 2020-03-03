package com.statestreet.day1.tests;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.statestree.driver.Driver;
import com.statestree.driver.DriverFactory;
import com.statestree.waits.WaitTypes;
import com.statestreet.screenshots.CaptureScreenShot;

public class OrangeHrmTest {
	private String URL="https://www.orangehrm.com/"; 
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
	public void test() {
		String regBtn_xpath="//*[@id=\"header-navbar\"]/ul[2]/li[2]/a"; 
		String subDomin_id="Form_submitForm_subdomain"; 
		String firstName_id="Form_submitForm_FirstName"; 
		String lastName_id="Form_submitForm_LastName"; 
		String email_id="Form_submitForm_Email";
		String jobTitle_id="Form_submitForm_JobTitle"; 
		
		
		String subDomainName="seleniumtest"; 
		
		driver.findElement(By.xpath(regBtn_xpath)).click();
		
		scrShot.takeScreenShot();

		driver.findElement(By.id(subDomin_id)).clear();
		driver.findElement(By.id(subDomin_id)).sendKeys(subDomainName);
		
//		driver.findElement(By.id(firstName_id)).clear(); 
//		driver.findElement(By.id(firstName_id)).sendKeys("Naveen");
		
		
		waitTypes.waitForElementVisibility(By.id(firstName_id), 10).sendKeys("Naveen");
		
		
		
		scrShot.takeScreenShot();
		
		
		driver.findElement(By.id(lastName_id)).clear(); 
		driver.findElement(By.id(lastName_id)).sendKeys("kumar");
		
		driver.findElement(By.id(email_id)).clear(); 
		driver.findElement(By.id(email_id)).sendKeys("adith.naveen@gmail.com");
		
		driver.findElement(By.id(jobTitle_id)).clear(); 
		driver.findElement(By.id(jobTitle_id)).sendKeys("Trainer");
		
		
		
 
	}
	

	
	@Ignore
	@Test
	public void jsSelectTest()  throws InterruptedException{
		
		
		String regBtn_xpath="//*[@id=\"header-navbar\"]/ul[2]/li[2]/a"; 
		String industryDropDown_id="Form_submitForm_Industry"; 
		
		
		JavascriptExecutor jse = (JavascriptExecutor) driver; 
		
		driver.findElement(By.xpath(regBtn_xpath)).click(); 
		
		
		jse.executeScript("window.scrollTo(0, 500)"); 
		
		Thread.sleep(3000);
		
		
		// to get all the values from the drop down 
		
		
		WebElement dropDownElement = driver.findElement(By.id(industryDropDown_id));
		
		Select selectIndustry = new Select(dropDownElement); 
		
		System.out.println("Number of options for Industry " + selectIndustry.getOptions().size());
		
		// selecting values 
		
		List<WebElement> options = selectIndustry.getOptions(); 
		for(WebElement temp : options) {
			System.out.println(temp.getText());
		}
		
		selectIndustry.selectByValue("Education");
		
		Thread.sleep(3000);
		
		selectIndustry.selectByValue("Electronics");
		
		
		
	}
	
	
}















