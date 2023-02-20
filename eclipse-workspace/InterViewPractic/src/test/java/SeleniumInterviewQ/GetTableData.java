package SeleniumInterviewQ;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTableData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		Collection<String> coll=new ArrayList<String>();
		
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/h3"));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		
		for(int i=0;i<list.size();i++)
		{
			
			WebElement E1=list.get(i);
			String text=E1.getText();
			
			System.out.println(text);
		}
		
		
		
		

	}

}
