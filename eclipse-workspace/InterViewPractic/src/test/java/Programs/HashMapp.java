package Programs;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HashMapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = null;
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//js.executeScript("argument[0].value='m';," WebElement);
		
		Actions action=new Actions(driver);
		
		action.click().sendKeys(args).build().perform();
		
		
		HashMap<String, String> map=new HashMap<>();
		
		map.put("first", "hab");
		
		if(map.containsKey("first"))
		{
			System.out.println("ok");
		}else {
			System.out.println("no");
		}

	}

}
