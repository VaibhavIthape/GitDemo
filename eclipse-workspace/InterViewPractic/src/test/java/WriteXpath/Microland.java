package WriteXpath;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Microland {
	WebDriver driver;

	@Test
	public void Method() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.findElement(By.xpath("//*[@id=\"mw-side"
				+ ""
				+ "bar-button\"]")).click();

		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"p-tb\"]/div[2]/ul/li"));
		System.out.println(list.size());

		for (WebElement ele : list) {
//			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.click();

			Assert.assertEquals(driver.getTitle(), "Pages that link to \"Main Page\" - Wikipedia");

			driver.quit();

		}

	}
}
