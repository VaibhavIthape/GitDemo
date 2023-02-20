package Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;


public class Print1234 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Set<String> set=new HashSet<>();
		
		
		set.add("Vaibhav");
		set.add("Vaibhav");
		set.add("Varun");
		set.add(null);
		
		
		List<String> list=new ArrayList<>(set);
		System.out.println(list.get(1));
	}

}
