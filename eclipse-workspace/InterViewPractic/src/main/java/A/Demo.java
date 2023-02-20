package A;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	
	@Test(enabled=false)
	   public void testcase1(){
	      System.out.println("Testcase 1 - Not executed");
	   }
	   @Test
	   public void testcase2(){
	      System.out.println("Testcase 2 - skip exception example");
	      throw new SkipException("Skipping this exception");
	   }
	   @Test
	   public void testcase3(){
	      boolean DataAvailable=false;
	      System.out.println("Test Case3 - Conditional Skip");
	      if(!DataAvailable)
	      throw new SkipException("Skipping this exception");
	      System.out.println("Executed Successfully");
	   }
	

	public static void main(String[] args) {
		int[] aa = { 4, 38, 62, 28 };
		// TODO Auto-generated method stub
		
System.out.println(aa.length);
		
		
		
		 
		}

}