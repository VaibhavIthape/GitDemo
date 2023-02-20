package Programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Countofeachoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String val = "Vaibhav Jagannath Ithapee";

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i <= val.length() - 1; i++) {
			char ch = val.toLowerCase().charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}

		System.out.println(map);

	}

}
