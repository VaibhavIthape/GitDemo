package TestNG;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SkipTestcase {
	
	@Test()
	public void me1()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.softwaretestingo.com/selenium-tricky-interview-questions/");
		
		List<WebElement> ele= driver.findElements(By.tagName("iframe"));
		
		for(WebElement name:ele)
		{
			String frm=name.getAttribute("name");
			System.out.println(frm);
		}
		System.out.println(ele.size());
		
	}
	
	@Test(enabled = false)
	public void me2()
	{
		Runtime.getRuntime().gc();
		System.gc();
		System.out.println("Skipped method 2");
	}
	
	@Test(enabled = false)
	public void me3()
	{
		System.out.println("me3");
	}

	
	
}
