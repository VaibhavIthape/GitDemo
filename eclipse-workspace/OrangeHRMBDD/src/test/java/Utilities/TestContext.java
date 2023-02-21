package Utilities;

import org.openqa.selenium.WebDriver;

public class TestContext {

	public WebDriver driver;
	// public PageObjectManager pageobManager;
	public TestBase testbase;

	public TestContext() {
		testbase = new TestBase();
	}

}
