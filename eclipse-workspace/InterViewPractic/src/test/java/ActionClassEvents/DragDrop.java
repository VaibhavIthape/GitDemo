package ActionClassEvents;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		WebElement ele=driver.findElement(null);
		

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(
//			"#post-2669 > div.twelve.columns > div > div > div.single_tab_div.resp-tab-content.resp-tab-content-active > p > iframe")));
//
//	WebElement sourceLocator = driver.findElement(By.cssSelector("#gallery > li:nth-child(4) > h5"));
//    
//		WebElement targetLocator = driver.findElement(By.cssSelector("#trash"));
//
//		action.dragAndDrop(sourceLocator, targetLocator).build().perform();
		Thread.sleep(2000);

		
		
		WebElement sourceLocator = driver.findElement(By.xpath("//select[1]"));

		Select sel = new Select(sourceLocator);

		List<WebElement> str = sel.getAllSelectedOptions();

		//System.out.println(sel.getOptions());// It will display all options available in drop down
		
		boolean result=sel.isMultiple();
		System.out.println(result);
		
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByVisibleText("Nepal");
		
		Thread.sleep(2000);
		sel.selectByValue("IND");		
		driver.quit();

	}

}
