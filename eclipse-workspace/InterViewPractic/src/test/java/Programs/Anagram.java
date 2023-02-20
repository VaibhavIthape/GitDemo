package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {

	public Anagram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String[] words = { "cat", "tac", "dog", "act", "god", "sun" };

		// Map to store anagram groups
		Map<String, List<String>> anagramGroups = new HashMap<>();

		// Group the anagrams together
		for (String word : words) {
			// Sort the word's characters to use as a key
			char[] sortedChars = word.toCharArray(); 
			Arrays.sort(sortedChars);
			String key = new String(sortedChars);

			// Add the word to the corresponding anagram group
			if (!anagramGroups.containsKey(key)) {
				anagramGroups.put(key, new ArrayList<>());
			}
			anagramGroups.get(key).add(word);
		}

		// Print the anagram groups
		for (List<String> group : anagramGroups.values()) {
			System.out.println(group);
		}
	}
}
