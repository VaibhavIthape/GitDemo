package Program_Interview_2023;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateschar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="aadwwfassdg";
		
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<=word.length()-1;i++)
		{
			if(map.containsKey(word.charAt(i)))
			{
				int count =1;
				count=map.get(word.charAt(i));
				map.put(word.charAt(i), ++count);
				
			}
			else {
				
				map.put(word.charAt(i), 1);
			}
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()); 
			
		}
	}

}
