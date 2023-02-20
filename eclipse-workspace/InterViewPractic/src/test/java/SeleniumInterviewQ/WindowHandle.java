package SeleniumInterviewQ;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.channel.MessageSizeEstimator.Handle;
import junit.framework.Assert;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		Thread.sleep(2000);
		JavascriptExecutor js=((JavascriptExecutor)driver);
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.xpath("//*[contains(text(),'Button4')]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='newTabsBtn']")).click();
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	//	Set<String> set=driver.getWindowHandles();
	//	System.out.println(set.size());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
		//wait.until(ExpectedConditions.alertIsPresent());
				
		
		int count=1;
		Iterator<String> it=tabs.iterator();
		for(String chile:tabs)
		{
			
			if(chile !=parent)
			{
			Thread.sleep(2000);
			 driver.switchTo().window(tabs.get(count));
			 Thread.sleep(2000);
			 boolean val=driver.findElement(By.xpath("//*[contains(text(),'Basic Controls in HTML')]")).isDisplayed();
			 
			 if(val==true)
			 {
				 driver.findElement(By.id("firstName")).sendKeys("Demo");
				 driver.findElement(By.id("lastName")).sendKeys("Man");
				 driver.findElement(By.id("femalerb")).click();
				 driver.findElement(By.id("hindichbx")).click();
				 driver.findElement(By.id("email")).sendKeys("Demo@test.com");
				 driver.findElement(By.id("password")).sendKeys("Demo@123");
				 driver.findElement(By.id("registerbtn")).click();
				 Thread.sleep(1000);
				 String msg=driver.findElement(By.id("msg")).getText();
				 
				 Assert.assertEquals("Registration is Successful", msg);
				 
			 }else {
				 count++;
				 driver.switchTo().defaultContent();
			 
		}
			 count++;
			 driver.switchTo().defaultContent();
			 
		}
		}
	}

}
