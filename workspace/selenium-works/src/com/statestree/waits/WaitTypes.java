package com.statestree.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
	private WebDriver driver;

	public WaitTypes(WebDriver driver) {
		this.driver = driver;
	}

	// 1. wait for visibility
	// driver.findElement(By.id("name")); 
	//                    Employee.setName("pooja"); 
	public WebElement waitForElementVisibility(By locator, int maxTimeOut) {
		try {
			WebDriverWait webDriverWait = new WebDriverWait(driver, maxTimeOut);

			WebElement element = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));

			return element;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public WebElement waitForElementToBeClickableReady(By locator, int maxTimeOut) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, maxTimeOut);

		return  webDriverWait.until(ExpectedConditions.elementToBeClickable(locator)); 
	}
	
	
	public WebElement waitForElementToBeClickableReady(WebElement webElement, int maxTimeOut) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, maxTimeOut);
		
		return  webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement)); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
