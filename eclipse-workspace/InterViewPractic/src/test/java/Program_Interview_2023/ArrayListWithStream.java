package Program_Interview_2023;

import java.util.Arrays;
import java.util.List;

public class ArrayListWithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(2,4,7,8,10,3,1);
		
		
//		numbers.forEach((e)->{
//			System.out.println(e+", ");
//		});
		
		
		numbers.stream().forEach(s->{System.out.println(s);});
	}

}
