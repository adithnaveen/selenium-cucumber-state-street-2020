package com.statestreet.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.statestree.waits.WaitTypes;

public class FlightPagePOM {

	private WebDriver driver; 
	
	public FlightPagePOM(WebDriver driver) {
		this.driver = driver; 
	}

	
	// openining the page
	
	public void loadPage() {
		driver.get("https://www.expedia.co.in/");
	}
	
	
	// click flights link(button) 
	
	public void clickFligtsTab() {
//		driver.findElement(By.id("tab-flight-tab-hp")).click(); 
		new WaitTypes(driver).waitForElementToBeClickableReady(By.id("tab-flight-tab-hp"), 20).click(); 
		
	}
	
	// flying from 
	
	public void sendFlyFrom(String flyFrom) {
		driver.findElement(By.id("flight-origin-hp-flight")).click();
		driver.findElement(By.id("flight-origin-hp-flight")).clear();
		driver.findElement(By.id("flight-origin-hp-flight")).click();
		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys(flyFrom);
	}
	
	// flying to 
	public void sentFlyTo(String flyTo) {
		driver.findElement(By.id("flight-destination-hp-flight")).clear(); 
		driver.findElement(By.id("flight-destination-hp-flight")).sendKeys(flyTo);
	}
	// departing date 
	public void clickAndSendDepartDate(String date) {
		driver.findElement(By.id("flight-departing-hp-flight")).click(); 
		driver.findElement(By.id("flight-departing-hp-flight")).clear();
		driver.findElement(By.id("flight-departing-hp-flight")).sendKeys(date);
		
	}
	// returning date 
	public void clickAndSendreturnDate(String date) {
		driver.findElement(By.id("flight-returning-hp-flight")).click();
		driver.findElement(By.id("flight-returning-hp-flight")).clear();
		driver.findElement(By.id("flight-returning-hp-flight")).sendKeys(date);
	}
	
	public void selectNumberOfAdults(int noOfAdults) {
		String travellers_xpath ="//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/button"; 
		driver.findElement(By.xpath(travellers_xpath)).click(); 
		
		// loop number of time -1 for adults to travel 
		
		String adult_xpath ="//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/div/div/div[1]/div[4]/button/span[1]"; 
		
		for(int i=1; i<noOfAdults; i++) {
			driver.findElement(By.xpath(adult_xpath)).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}












