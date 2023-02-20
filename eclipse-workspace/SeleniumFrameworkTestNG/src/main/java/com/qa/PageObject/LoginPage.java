package com.qa.PageObject;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {

	public static WebDriver driver;
	public static Properties prop;
	public static HomePage homepage;
	
	
	
	


	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement Username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement Loginbtn;

	@FindBy(xpath = "")
	WebElement ValidationMessage;

	// Initialize Page FCTORY

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String un, String pwd) {
		
		Username.sendKeys(un);
		Password.sendKeys(pwd);
		Loginbtn.click();
//		    	JavascriptExecutor js = (JavascriptExecutor)driver;
//		    	js.executeScript("arguments[0].click();", loginBtn);

		return new HomePage();
	}

}
