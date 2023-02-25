package Program_Interview_2023;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String Palindrome

		String str = "Madam";

		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		String reverse = String.valueOf(sb.reverse());
		if (reverse.equals(str)) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("String is not Palindrome");
		}

		// Number Palindrome

		int num = 221, temp = 0, re, og;

		og = num;

		while (og > 0) {
			re = og % 10;
			temp = (temp * 10) + re;
			og /= 10;

		}

		if (num == temp) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
