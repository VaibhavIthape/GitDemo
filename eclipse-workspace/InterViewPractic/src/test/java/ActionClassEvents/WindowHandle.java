package ActionClassEvents;

import java.util.Iterator;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class WindowHandle {

	@Test
	public void handle() throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://nxtgenaiacademy.com/multiplewindows/");

		String Parent = driver.getWindowHandle();
		Thread.sleep(2000);

		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"))
				.sendKeys("Automation");

		driver.switchTo().window(Parent);
		driver.findElement(By.xpath("//button[contains(text(),'New Message Window')]")).click();

//		String message = "Welcome to Vinoth Rathinam Tutorials. Happy Learning";
//		Set<String> set = driver.getWindowHandles();
//
//		System.out.println(set.size());
//		Iterator<String> I1 = set.iterator();
//
//		while (I1.hasNext()) {
//			String Childwin = I1.next();
//
//			if (!Parent.equals(Childwin)) {
//				driver.switchTo().window(Childwin);
//
//				String title = driver.getTitle();
//				System.out.println(title);
//				Assert.assertEquals(message, "Welcome to Vinoth Rathinam Tutorials. Happy Learning");
//				// String title=driver.getTitle();
//				// System.out.println(title);
//
//				driver.close();
//			}
//
//		}
		driver.switchTo().window(Parent);

	}

}
