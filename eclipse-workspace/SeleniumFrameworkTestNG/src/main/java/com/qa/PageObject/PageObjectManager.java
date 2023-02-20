package com.qa.PageObject;

import org.openqa.selenium.WebDriver;

import com.qa.Base.TestBase;

public class PageObjectManager {
	

	public WebDriver driver;	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}

	public TestBase testbase;
	public LoginPage login;

	public LoginPage log() {

		login = new LoginPage(driver);

		return login;

	}

}
