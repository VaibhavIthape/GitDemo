package Program_Interview_2023;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Vaibhav Ithape";
		
		str=str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(str);
	}

}
