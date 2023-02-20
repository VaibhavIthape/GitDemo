package Programs;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MCQ {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		String url1 = "Something?first=1&second=2";
		String url2 = "Something?first=11&second=22";
		String url3 = "Something?second=222&first=111";

		List<String> urls = new ArrayList<>();
		urls.add(url1);
		urls.add(url2);
		urls.add(url3);

		List<Integer> firstValues = new ArrayList<>();
		List<Integer> secondValues = new ArrayList<>();

		for (String url : urls) {
			String patternString = "(first|second)=[0-9]+";
			Pattern pattern = Pattern.compile(patternString);
			Matcher matcher = pattern.matcher(url);

			while (matcher.find()) {
				String[] keyValue = matcher.group().split("=");
				if (keyValue[0].equals("first")) {
					firstValues.add(Integer.parseInt(keyValue[1]));
				} else if (keyValue[0].equals("second")) {
					secondValues.add(Integer.parseInt(keyValue[1]));
				}
			}
		}

		System.out.println("first: " + firstValues);
		System.out.println("second: " + secondValues);
	}

}
