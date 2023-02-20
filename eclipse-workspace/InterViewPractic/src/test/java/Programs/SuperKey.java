package Programs;

class Parent {

	public void disp() {
		System.out.println("Parent class method");
	}

}

public class SuperKey extends Parent {

	public void disp() {
		super.disp();
		System.out.println("Child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SuperKey sup=new SuperKey();
		sup.disp();
		
		/*
		 * In this example, if you create an object of Child class and call its disp()
		 * method, it will first call the parent class's disp() method using
		 * "super.disp()" and then execute the code within the child class's disp()
		 * method.
		 */

	}

}
