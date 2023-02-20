package InterviewPreparation.SeleniumJava;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearTextBoxText {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		
		
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts=((TakesScreenshot)driver);
		
		File fs=ts.getScreenshotAs(OutputType.FILE);
		
		WebElement ele= driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		Thread.sleep(2000);
		//ele.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		//ele.sendKeys(Keys.BACK_SPACE);
		
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].value='Removed'", ele);
		
		driver.findElement(By.xpath(""));
		   
		
		
		
		

	}

}
