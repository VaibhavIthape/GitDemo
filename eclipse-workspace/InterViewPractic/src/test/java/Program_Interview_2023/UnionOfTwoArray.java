package Program_Interview_2023;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Integer arr1[] = { 0, 5, 11, 7, 9, 3};
	      
	      //Declare and initialize the second array elements
	      Integer arr2[] = { 1, 2, 4, 5, 12, 7 };
	      
	      
	      HashSet<Integer> set=new HashSet<>();
	      
	      set.addAll(Arrays.asList(arr1));
	      set.addAll(Arrays.asList(arr2));
	      
	      Integer[] union= {};
	    		  union=set.toArray(union);
	      
	      System.out.println(Arrays.toString(union));
	}

}
