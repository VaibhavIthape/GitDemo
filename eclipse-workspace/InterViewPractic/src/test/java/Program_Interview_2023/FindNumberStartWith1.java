package Program_Interview_2023;

import java.util.Arrays;
import java.util.List;

public class FindNumberStartWith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> numbers = Arrays.asList(12,24,71,18,10,3,1,43,56);
		
		numbers.stream().
		map(s->s+"").
		filter(s->s.startsWith("1")).
		forEach(System.out::println);;
	}

}
