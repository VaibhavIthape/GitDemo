package Programs;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String[] links = null;
		int linksCount = 0;

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Doctor Near Me", Keys.ENTER);
		List<WebElement> linksize = driver.findElements(By.xpath("//div[@class='v7W49e']//h3"));

		driver.manage().window().maximize();
		System.out.println(linksize.size());

		for (WebElement webElement : linksize) {
			String name = webElement.getText();

			if (webElement.isDisplayed()) {
				webElement.click();
				driver.navigate().back();
				Thread.sleep(2000);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", webElement);
				System.out.println(name);
			}
		}

	}

}
