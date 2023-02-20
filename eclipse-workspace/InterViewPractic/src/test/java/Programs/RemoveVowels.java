package Programs;

import java.util.ArrayList;
import java.util.List;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Vaibhav";

		// System.out.println(s.replaceAll("[aeiouAEIOU]", ""));

		for(int i=0;i<s.length();i++)
		{
			 if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
		                || s.charAt(i) == 'i' || s.charAt(i) == 'o'
		                || s.charAt(i) == 'u' || s.charAt(i) == 'A'
		                || s.charAt(i) == 'E' || s.charAt(i) == 'I'
		                || s.charAt(i) == 'O'
		                || s.charAt(i) == 'U') {
				 continue;
		}
		else {
			
			System.out.println(s.charAt(i));
		}
	}
	}}
