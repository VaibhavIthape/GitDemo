package SeleniumInterviewQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationsSeq {

	
	
	@BeforeSuite
	public void me1()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeSuite
	public void me14()
	{
		System.out.println("Before Suite");
		
		
	}
	@BeforeTest
	public void me13()
	{
		System.out.println("Before Test");
	}
	@BeforeTest
	public void me15()
	{
		System.out.println("Before Test");
	}
	@BeforeMethod
	public void me2()
	{
		System.out.println("Before Method");
	}
	@BeforeMethod
	public void me16()
	{
		System.out.println("Before Method");
	}
	@BeforeClass
	public void me3()
	{
		System.out.println("Before Class");
	}
	@AfterSuite
	public void me4()
	{
		System.out.println("After Suite");
	}
	@AfterTest
	public void me5()
	{
		System.out.println("After Test");
	}
	@AfterClass
	public void me6()
	{
		System.out.println("After Class");
	}
	@AfterMethod
	public void me7()
	{
		System.out.println("After Method");
	}
	@Test
	public void me8()
	{
		System.out.println("Test");
	}

	@Test
	public void me9()
	{
		System.out.println("Test");
	}
}
