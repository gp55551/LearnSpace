package Collections;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer, String> abc = new HashMap<Integer, String>();
		abc.put(1, "Gaurav");
		abc.put(12, "rahul");
		
		
		
		System.out.println(abc);
		System.out.println(abc.keySet());
		System.out.println(abc.get(12));
	}

}
