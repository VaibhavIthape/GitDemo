package Program_Interview_2023;

public class RemoveNumberFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "nhhg54hgjh76gh868";

		str = str.replaceAll("[0-9]", "");

		System.out.println(str);

	}

}
