package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.time.DurationUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver Drivermanager() throws IOException {
		WebDriver driver = null;
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//Resources//Locators.properties");

		Properties prop = new Properties();
		prop.load(fis);

		String url = prop.getProperty("url");
		if (driver == null) {
			if (prop.getProperty("Browser").equalsIgnoreCase("Chrome")) {
				if (url.equals("Chrome")) {
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();

				} else if (url.equals("FireFox")) {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				} else if (url.equals("Edge")) {
					WebDriverManager.edgedriver().setup();
					driver = new InternetExplorerDriver();
				}

			}

		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		return driver;
	}
}