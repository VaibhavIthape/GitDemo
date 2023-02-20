package Programs;

import java.util.HashMap;

public class ArrayDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= {1,4,2,6,2,4,8,1,11};
		
		HashMap<Integer, Integer> hs=new HashMap<>();
		for(int i=0;i<arr.length-1;i++)
		{
		if(hs.containsKey(arr[i])) {
			int count = hs.get(arr[i]);
			hs.put(arr[i], ++count);
			
		}else {
			hs.put(arr[i], 1);
		}

	}
		System.out.println(hs.entrySet());

}
}