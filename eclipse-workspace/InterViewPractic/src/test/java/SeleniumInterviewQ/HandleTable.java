package SeleniumInterviewQ;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", ele);
		Thread.sleep(2000);
		List<WebElement> count=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr"));
		
		
		System.out.println(count.size());
		
	}

}
