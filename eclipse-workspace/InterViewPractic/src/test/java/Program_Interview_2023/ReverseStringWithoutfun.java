package Program_Interview_2023;

public class ReverseStringWithoutfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Ranveer";
		
//		StringBuffer bf=new StringBuffer(str);
//		System.out.println(bf.reverse());
		//1 st way
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			System.out.print(str.charAt(i));
		//}
		
		//2nd way
		char[] ch=str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		

	}

}
