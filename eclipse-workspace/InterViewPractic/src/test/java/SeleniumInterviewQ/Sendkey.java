package SeleniumInterviewQ;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sendkey {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.name("q"));
		//action.click(ele).sendKeys("Automation").build().perform();
		
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].value='Selenium';", ele);
		
		
	}

}
