package InterviewPreparation.SeleniumJava;

public class Print_Odd_Even_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=0;
		
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				a=a+i;
			}
			else {
				b=b+i;
			}
		}
		System.out.println("Addition of even no: "+a+ " Addition of odd no "+b);
		
		
	}

}
