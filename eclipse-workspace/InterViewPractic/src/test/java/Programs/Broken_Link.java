package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class Broken_Link {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			WebElement E1 = links.get(i);
			String url1 = E1.getAttribute("href");
			try {
			URL url = new URL(url1);

				// Abstract Class
				HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
				httpURLConnect.setConnectTimeout(5000);
				httpURLConnect.connect();

				if (httpURLConnect.getResponseCode() >= 400) {
					System.out.println("link is broken " + httpURLConnect.getResponseMessage());
				} else {

					System.out.println("Link not broken " + httpURLConnect.getResponseMessage());

				}

			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				
			}

		}
	}
}