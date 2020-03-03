package com.statestreet.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsTest01 {
	public static void main(String args[]) {
		
		String URL="https://www.google.com/"; 
		WebDriver driver ; 
		
		// 1. Load the driver
		
		System.setProperty("webdriver.chrome.driver", 
			"/Volumes/Kanchan/MyTrainings/selenium-cucumber-state-street-2020/drivers/mac/chromedriver"); 
		
		driver = new ChromeDriver(); 
		
		// 2. open the site 
		
		driver.get(URL);
		
		// 3. process 
		String title = driver.getTitle(); 
		
		System.out.println("Title of the loaded Page -> " + title); 
		
		// 4. close / quit 
		
		driver.close(); 
		
	}
}
