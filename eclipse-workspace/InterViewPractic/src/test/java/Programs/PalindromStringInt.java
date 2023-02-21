package Programs;

public class PalindromStringInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name = "madam";
//		String reverse = "" ;
//		int length = name.length();
//
//		for (int i = length - 1; i >= 0; i--) {
//			reverse = reverse + name.charAt(i);
//		}
//		System.out.println(reverse);
//		if (name.equals(reverse)) {
//			System.out.println("String palindrom");
//		} else {
//			System.out.println("Not");
//		}
		
		
//------------------------------------------------------------------------------------
		
		
		
		int num=122;
		
		int temp=0,re,og;
		og=num;
		while(og>0)
		{
			re=og%10;
			temp=(temp*10)+re;
			og=og/10;
			
			
		}
		
		System.out.println(temp);
		
	}

}
