package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop> lap=new ArrayList<>();
		
		lap.add(new Laptop("Dell",14,2000));
		lap.add(new Laptop("Apple",16,20000));
		lap.add(new Laptop("Lenovo", 8, 40000));
		
		Collections.sort(lap);
		
		for(Laptop l:lap)
		{
		System.out.println(l);
		}
		
	}

}
