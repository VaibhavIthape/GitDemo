package Program_Interview_2023;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10,firstnumber=0,secondnum=1;
		
		
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(firstnumber+" ,");
			
			int next=firstnumber+secondnum;
			firstnumber=secondnum;
			secondnum=next;
		}
	}

}
