package Programs;

public class ReverseeachWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name= "Vaibhav Jagannath Ithape";
		
		String[] aa = name.split(" ");
		char reverseword;
		
		
		
		
			
			for(int i=0;i<=aa.length-1;i++)
			{
				String reverse=aa[i];
				System.out.println(reverse.length());
				
				for(int j=reverse.length();j>=0;j--)
				{
					reverseword=reverse.charAt(j);
				}
			}
			
			
			
			
		}
		
		
	}


