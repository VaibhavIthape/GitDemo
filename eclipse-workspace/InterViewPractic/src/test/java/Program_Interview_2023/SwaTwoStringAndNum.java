package Program_Interview_2023;

public class SwaTwoStringAndNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//swap two numbers
//		int a=10;
//		int b=20;
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		
//		System.out.println("Value of a-"+a+" and Value of b-"+b);
		
		//Swap two strings
		
		String first="Hari";
		String second="Om";
		//hariom
		
		first=first.concat(second);
		System.out.println(first.length()+" "+second.length());
		second=first.substring(0,first.length()-second.length());
		first=first.substring(second.length(),first.length());
		
		System.out.println("Value of First-"+first);
		System.out.println("Value of Second-"+second);
	}

}
