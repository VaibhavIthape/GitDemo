package Program_Interview_2023;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=11;
		boolean val=true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%2==0)
			{
				val=false;
				break;
			}
			
		}
		if(val) {
		System.out.println("Prime Number");
		}else {
			System.out.println("No a Prime Number");
		}
	}

}
