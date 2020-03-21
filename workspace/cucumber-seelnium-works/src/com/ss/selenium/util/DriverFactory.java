package com.ss.selenium.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {

	static WebDriver driver = null;   
	public static WebDriver getDriver(String name) {
		if(name.equals(Driver.BROWSER_CHROME)) {
			System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);
			
			
			ChromeOptions cOpts = new ChromeOptions(); 
			
			cOpts.addArguments("--disable-extensions"); 
			cOpts.addArguments("--no-sandbox");
			cOpts.addArguments("enable-features=NetworkServiceInProcess");
			
			cOpts.setPageLoadStrategy(PageLoadStrategy.NONE); 
			
			
			
			driver = new ChromeDriver(cOpts);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			driver.manage().window().maximize(); 
			
			
		}else if(name.equals(Driver.BROWSER_IE)) {
			System.setProperty(Driver.IE_KEY, Driver.IE_PATH);
			
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer(); 
			
			caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
			caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
			caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
			caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			driver.manage().window().maximize(); 
			
			driver = new InternetExplorerDriver(caps); 
		}
		
		return driver;
	}
}
