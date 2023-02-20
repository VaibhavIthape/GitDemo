package SeleniumInterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLinksWhichContainText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PageFactory
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		
		List<WebElement> list=new ArrayList<>();
		
		list=driver.findElements(By.tagName("a"));
		list.removeAll(Arrays.asList(" ",null));
		System.out.println(list);
		
		ArrayList<String> arr=new ArrayList<>();
		Iterator lt=list.iterator();
		
		for(int i=0;i<list.size();i++)
		{
			WebElement link=list.get(i);
			
			
			System.out.println(link.getText());
			//System.out.println(link.getSize());
			
//			if(!link.getText().isBlank() || !link.getText().contains("(0)"))
//			{
//			
//				arr.add(link.getText());
//				System.out.println(arr.toString());
//			}
		}driver.quit();
		
		
	}
	
	}


