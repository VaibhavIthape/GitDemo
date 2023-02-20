package SeleniumInterviewQ;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunFiledTestCases {

	protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void befortest(String browser) {
		switch (browser.toLowerCase()) {
		case "chrome":

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "edge":

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "ie":

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		}
	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}

	public static WebDriver getdriver() {
		return threadLocalDriver.get();
	}

	@Test()
	public void Testcase1() {

		threadLocalDriver.set(driver);

		getdriver().get("https://www.google.co.in/");
		String title = driver.getTitle();
		assertEquals(title, "Google");

	}

	@Test()
	public void Testcase11() {

		getdriver().get("https://www.google.co.in/");
		String title = driver.getTitle();
		assertEquals(title, "Google");
	}

	@Test()
	public void Testcase10() {

		getdriver().get("https://www.google.co.in/");
		String title = driver.getTitle();
		assertEquals(title, "Google");
	}

	@Test()
	public void Testcase9() {

		getdriver().get("https://www.google.co.in/");
		String title = driver.getTitle();
		assertEquals(title, "Google");
	}

	@Test()
	public void Testcase8() {

	
		getdriver().get("https://www.google.co.in/");
		String title = driver.getTitle();
		assertEquals(title, "Google");
	}

	@Test()
	public void Testcase7() {

		getdriver().get("https://www.google.co.in/");
		String title = driver.getTitle();
		assertEquals(title, "Google");
	}

	@Test()
	public void Testcase6() {

		getdriver().get("https://www.google.co.in/");
		String title = driver.getTitle();
		assertEquals(title, "Google");
	}

	@Test()
	public void Testcase5() {

		getdriver().get("https://www.google.co.in/");
		String title = driver.getTitle();
		assertEquals(title, "Google");
	}

	@Test()
	public void Testcase4() {

		getdriver().get("https://www.google.co.in/");
		String title = driver.getTitle();
		assertEquals(title, "Google");
	}

	@Test()
	public void Testcase3() {

		getdriver().get("https://www.google.co.in/");
		String title = driver.getTitle();
		assertEquals(title, "Google");
	}

	@Test()
	public void Testcase2() {

		getdriver().get("https://www.google.co.in/");
		String title = driver.getTitle();
		assertEquals(title, "Google");
	}

}
