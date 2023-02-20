package com.qa.Util;

import java.io.IOException;

import com.qa.Base.TestBase;
import com.qa.PageObject.LoginPage;
import com.qa.PageObject.PageObjectManager;



public class WebDriverContext {

	public TestBase testbase;
	public LoginPage login;
	public PageObjectManager pom;
	
	public WebDriverContext() throws IOException
	{
		//testbase=new TestBase();
	//	login=new LoginPage(testbase.Initilizer());
		//pom=new PageObjectManager(testbase.Initilizer());
	}
	

	
}
