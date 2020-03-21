package com.ss.selenium.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot {
	// the web driver information is supplied by the calling selenium script 
	private WebDriver driver; 
	
	
	 public CaptureScreenShot(WebDriver driver) {
		 this.driver = driver; 
	 }

	 
	 public void takeScreenShot(String fileName) {
		 String path ="/Volumes/Kanchan/MyTrainings/selenium-cucumber-state-street-2020/screen-shot/";
		 
		 try {
			 TakesScreenshot ts = (TakesScreenshot) driver; 
			 File file = ts.getScreenshotAs(OutputType.FILE); 
			 
			 FileUtils.copyFile(file, new File(path + fileName+".png"));
			 
		 }catch(IOException ioe) {
			 ioe.printStackTrace(); 
		 }
	 }
	 

	 public void takeScreenShot() {
		 String path ="/Volumes/Kanchan/MyTrainings/selenium-cucumber-state-street-2020/screen-shot/";
		 
		 
		 Calendar calendar = GregorianCalendar.getInstance(); 
		 
		 String fileName = calendar.get(Calendar.DATE) +"-" + 
				 			calendar.get(Calendar.HOUR) +"-" +
				 		   calendar.get(Calendar.MINUTE) +"-" +
				 		   calendar.get(Calendar.SECOND) +".png"; 
		 
		 try {
			 TakesScreenshot ts = (TakesScreenshot) driver; 
			 File file = ts.getScreenshotAs(OutputType.FILE); 
			 
			 FileUtils.copyFile(file, new File(path + fileName));
			 
		 }catch(IOException ioe) {
			 ioe.printStackTrace(); 
		 }
	 }
	 
}


















