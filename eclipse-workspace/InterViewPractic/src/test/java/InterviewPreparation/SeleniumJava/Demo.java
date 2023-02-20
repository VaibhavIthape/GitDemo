package InterviewPreparation.SeleniumJava;

import java.lang.reflect.Array;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args)
	{
		String name="VAibhav";
		
		String[] arr = {"a","e","i","o","u","A","E","I","O","U"};
		
		int count = 0;
		
		for(int i=0;i<name.length();i++)
		{
		char ch=name.charAt(i);
		
		
		if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A'){
            count ++;
         }
		}
		System.out.println("Total Vowels "+ count);
		
	}
	

	}
