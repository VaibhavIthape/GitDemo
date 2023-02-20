package SeleniumInterviewQ;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		// if type is equal to file use sendkey
		driver.get("https://demo.guru99.com/test/autoit.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement ele= driver.findElement(By.xpath("//*[@id=\"input_5\"]"));
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 1000);", ele);
		
		
				
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"input_5\\\"]")));
		Actions action=new Actions(driver);
		action.moveToElement(ele);
		Thread.sleep(1000);
		ele.click();
		ele.sendKeys("C:\\Users\\ADMIN\\Downloads\\Persistent.txt");
	
		
		
	}

}
