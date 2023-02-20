package testCases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.PageObject.HomePage;
import com.qa.PageObject.LoginPage;
import com.qa.Util.Propertiesfile;
import com.qa.Util.WebDriverContext;


public class Logintestcases extends TestBase {

	public class LoginPageTest extends TestBase{
		LoginPage loginPage;
		HomePage homePage;
		
		public LoginPageTest(){
			super();
		}
		
		@BeforeMethod
		public void setUp() throws IOException{
			initialization();
			loginPage = new LoginPage();	
		}
		
		
		@Test(priority=0,enabled=true)
		public void loginTest(){
			
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			
			JavascriptExecutor javascript = (JavascriptExecutor) driver;
			String todisable = "document.getElementsByName('fname')[0].setAttribute('disabled', '');";
			javascript.executeScript(todisable);
			
		}
	}
		
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		
		
		

	}
