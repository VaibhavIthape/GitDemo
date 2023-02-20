package Programs;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = { "act", "cat", "tac", "keep", "peek" };

		HashMap<String, List<String>> map = new HashMap<>();

		for (String word : str) {
			char[] sortedChars = word.toCharArray();
			Arrays.sort(sortedChars);
			String key = new String(sortedChars);

			// Add the word to the corresponding anagram group
			if (map.containsKey(key)) {
				//
				map.get(key).add(word);
			} else {

				map.put(key, new ArrayList<>());
				map.get(key).add(word);
			}
		}

		// Print the anagram groups

		System.out.println(map.entrySet());

	}
}
