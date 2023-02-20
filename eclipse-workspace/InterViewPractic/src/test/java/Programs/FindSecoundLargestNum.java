package Programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindSecoundLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] ar= {4,3,5,2};
		int temp=0;
		
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					//System.out.println(ar[i]);
					System.out.println(Arrays.toString(ar));
				}
			}
		
		}
		//System.out.println(ar.length-2);
		int n=ar.length;
		int large=ar[n-2];
		System.out.println("Seconf largest num "+ large);
		

	}

}
