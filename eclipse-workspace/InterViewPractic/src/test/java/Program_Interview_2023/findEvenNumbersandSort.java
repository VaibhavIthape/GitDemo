package Program_Interview_2023;

import java.util.Arrays;
import java.util.List;

public class findEvenNumbersandSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(2,4,7,8,10,3,1);
	     numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	}

}
