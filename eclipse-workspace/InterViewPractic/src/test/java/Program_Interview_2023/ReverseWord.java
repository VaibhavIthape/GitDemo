package Program_Interview_2023;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// output:- Is Name My
		String word = "My Name Is";

	//	String[] word1 = word.split("\\s");

//		for (int i = word1.length - 1; i >= 0; i--) {
//
//			System.out.print(word1[i]+" ");
//		}
		
		//Output:= yM emaN sI
		
//		for(String newword:word1)
//		{
//			for(int i=newword.length()-1;i>=0;i--)
//			{
//				System.out.print(newword.charAt(i));
//			}
//			System.out.print(" ");
//		}
		
		//Output:- sI emaN yM

		for(int i=word.length()-1;i>=0;i--)
		{
			
			System.out.print(word.charAt(i));
		}
		

	}

}
