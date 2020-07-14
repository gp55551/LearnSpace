package Collections; 

import java.util.ArrayList;
import java.util.Collections;
public class ArrayLList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrList = new ArrayList<String>();
		
		System.out.println(arrList);
		
		arrList.add("abc");
		arrList.add("rajesh");
		arrList.add("def");
		arrList.add("san");
		
		System.out.println(arrList);

		for(String a : arrList)
		{
			System.out.println(a);
		}
		
		arrList.remove("abc");
		
		System.out.println(arrList);
		/*
		System.out.println(arrList.get(2));
		System.out.println(arrList.contains("san"));
		System.out.println(arrList.indexOf("san"));
		System.out.println(arrList.size());
		System.out.println(arrList.isEmpty());
		
		ArrayList<String> arrList1 = new ArrayList<String>();
		
		System.out.println(arrList1);
		
		arrList1.add("supreet");
		System.out.println(arrList1);
		
		arrList.addAll(arrList1);
		System.out.println(arrList);

		arrList1.add(0, "malay"); // returns void
		System.out.println(arrList1);
		
		arrList.addAll(arrList1);
		System.out.println(arrList);
		
		Collections.sort(arrList, Collections.reverseOrder());
		System.out.println(arrList);

		System.out.println(arrList.add("fds")); //return boolean
	
		arrList.set(1, "gauravpatnaik");
		System.out.println(arrList);

		arrList.addAll(1, arrList1);
		System.out.println(arrList);*/
		
	}
	

}
