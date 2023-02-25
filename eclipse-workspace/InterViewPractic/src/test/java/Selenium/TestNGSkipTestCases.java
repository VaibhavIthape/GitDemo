package Selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGSkipTestCases {
	
	
	@Test(enabled=false)
	public void skip1()
	{
		
		Actions actions=new Actions(null);
		
		actions.sendKeys();
		actions.sendKeys(Keys.ARROW_UP);
		
	//	argument[0].click();
	}
	
	@Test
	public void skip2()
	{
		throw new SkipException("Message");
	}
	
	

}
