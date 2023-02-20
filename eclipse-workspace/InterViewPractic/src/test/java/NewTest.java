import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver=null;
	  WebElement ele = null;
	  Select se=new Select(ele);
	  se.selectByIndex(0);
	  se.selectByValue(null);
	  se.selectByVisibleText(null); 
	  se.getAllSelectedOptions();
	  se.getFirstSelectedOption();
	  
	  
  }
}
