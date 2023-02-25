package Program_Interview_2023;

import java.util.HashMap;

public class FindfirstRepetedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="geeksforgeeks";
		
		char[] ch=str.toCharArray();
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(int i=0;i<ch.length;i++)
		{
			if(map.containsKey(ch[i]))
			{
				System.out.println("first Repeted Character is="+ch[i]);
				break;
			}
			else {
				map.put(ch[i], 1);
			}
		}

	}

}
