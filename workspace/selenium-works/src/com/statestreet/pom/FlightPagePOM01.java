package com.statestreet.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPagePOM01 {
	private WebDriver driver; 
	
	public FlightPagePOM01(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "tab-flight-tab-hp")
	private WebElement flightTab; 
	
	@FindBy(id = "flight-origin-hp-flight")
	private WebElement flyFrom; 
	
	@FindBy(id="flight-destination-hp-flight")
	private WebElement flyTo; 
	
	@FindBy(id = "flight-departing-hp-flight")
	private WebElement deptDate; 
	
	@FindBy(id="flight-returning-hp-flight")
	private WebElement retDate; 
	
	@FindBy(xpath = "//*[@id=\\\"traveler-selector-hp-flight\\\"]/div/ul/li/button")
	private WebElement travllersBtn; 
	
	
	public void loadPage() {
		driver.get("https://www.expedia.co.in/");
	}
	
	public void clickFlightTab() {
		this.flightTab.click(); 
	}
	
	public void sendFlyFrom(String flyFrom) {
		this.flyFrom.click(); 
		this.flyFrom.clear(); 
		this.flyFrom.sendKeys(flyFrom);
	}
	
	public void sendFlyTo(String flyTo) {
		this.flyTo.click(); 
		this.flyTo.clear(); 
		this.flyTo.sendKeys(flyTo);
	}
	
	public void sendDeptDate(String date) {
		this.deptDate.clear(); 
		this.deptDate.sendKeys(date);
	}
	
	public void sendRetDate(String date) {
		this.retDate.clear();
		this.retDate.clear();
		this.retDate.sendKeys(date);
	}
	
	
}








