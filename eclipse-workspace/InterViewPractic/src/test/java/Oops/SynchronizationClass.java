package Oops;

class counter{
	int count;
	public void increment() {
		count++;
	}
}

public class SynchronizationClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		counter c=new  counter();
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<=1000;i++)
				{
					c.increment();
				}
			}
		});
		
		t.start();
		t.join();
		System.out.println("Count :"+c.count);
		

	}

}
