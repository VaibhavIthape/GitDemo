package SeleniumInterviewQ;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CleartextWithoutClear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Automation");
		Thread.sleep(2000);

		// ele.sendKeys(Keys.chord(Keys.CONTROL,"a"), Keys.BACK_SPACE);

		Actions action = new Actions(driver);
		action.click(ele).sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE).build().perform();

	}

}
