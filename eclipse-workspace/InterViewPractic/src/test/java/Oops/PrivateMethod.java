package Oops;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class UserClass{
   
    private int abc = 11;
     
   
    private void msg1(){
        System.out.println("Hello private Msg!");
    }
    
    public void noprt() {
    	abc=10;
    }
     
    private void msg2(String msgText){
        System.out.println(msgText);
    }
     
    private String msg3(String msgText){
        return "[" + msgText + "]";
    }
}
public class PrivateMethod {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, SecurityException, NoSuchMethodException {
		// TODO Auto-generated method stub
		// This object will be used for access
       
         
    }
	}



