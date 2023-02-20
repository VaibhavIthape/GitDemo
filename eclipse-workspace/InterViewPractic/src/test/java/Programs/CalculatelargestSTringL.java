package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculatelargestSTringL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = { "string1", "string2", "string3", "string4", "string5", "string6", "string7", "string8",
				"string9", "string101" };

		int maxlen=0;
		
		for(String s1:s)
		{
			if(s1.length()>maxlen)
			{
				maxlen=s1.length();
			}
		}
		System.out.println(maxlen);
	}
}