package Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

public class Persistent {

	
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url1 = "www.persistent.com?first=1&second=2";
		String url2 = "www.persistent.com?first=11&second=22";
		String url3 = "www.persistent.com?second=222&first=111";

		System.out.println("ok");
		List<String> list = new ArrayList<>();

		list.add(url1);
		list.add(url2);
		list.add(url3);

		HashMap<String, List<Integer>> map = new HashMap<>();
		for (int i = 0; i <= list.size() - 1; i++) {
			String name = list.get(i);

			name = name.substring(name.indexOf("?") + 1, name.length());

			String[] name1 = name.split("&");

			for (String a : name1) {
				String[] nxt = a.split("=");
				List<Integer> list1 = new ArrayList<>();
				String newone = nxt[0].trim();
				if (map.containsKey(newone)) {

					list1 = map.get(newone);

					list1.add(Integer.parseInt(nxt[1]));

				} else {

					list1.add(Integer.parseInt(nxt[1]));
					map.put(newone, list1);
				}

			}

		}
		System.out.println(map);
	}

}
