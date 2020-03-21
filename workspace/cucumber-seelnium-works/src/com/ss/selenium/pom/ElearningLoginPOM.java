package com.ss.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ss.selenium.waits.WaitTypes;

public class ElearningLoginPOM {

	private WebDriver driver;

	public ElearningLoginPOM(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "login_main_btn")
	private WebElement homeLoginBtn;

	@FindBy(xpath = "//*[@id=\"log_in_form\"]/form/div[1]/div[2]/input")
	private WebElement mobileNumber;

	@FindBy(xpath = "//*[@id=\"log_in_form\"]/form/div[2]/input")
	private WebElement password;

	@FindBy(xpath = "//*[@id=\"log_in_form\"]/form/div[4]/div[1]/button")
	private WebElement signInBtn;

	
	
	@FindBy(xpath = "//*[@id='My_Books']/div[2]/h2/span")
	private WebElement loginName;

	public void clickHomeLoginBtn() {
		this.homeLoginBtn.click();
	}

	public void sendMobileNumber(String mobileNumber) {
		this.mobileNumber.clear();
		this.mobileNumber.sendKeys(mobileNumber);
	}

	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	public void clickSignInBtn() {
		this.signInBtn.click();
	}

	public String getLoginName() {
	return new WaitTypes(driver).
			waitForElementToBeClickableReady(this.loginName, 10).getText();  
	}
}
