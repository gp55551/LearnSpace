

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class CollectionsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> abc = new ArrayList<>();
		abc.add("Gaurav");
		abc.add("Patnaik");
		System.out.println(abc);
		abc.remove(0);
		System.out.println(abc);

		abc.remove("Patnaik");
		System.out.println(abc);
		abc.add("Gaurav");
		abc.add("Gaura");
		abc.add("Gaur");

		abc.add("Patn");
		abc.add("PATN");
		abc.add("PATn");
		abc.add("Patnai");


		for (String num : abc) {
			System.out.println(num);
		}

		for (int counter = 0; counter < abc.size(); counter++) {
			System.out.println(abc.get(counter));
		}
		
		Enumeration<String> abcd = Collections.enumeration(abc);
		
		while(abcd.hasMoreElements())
		      System.out.println(abcd.nextElement());
		
		System.out.println("Initial size: "+abc.size());
		
		
		Collections.sort(abc);
		
		for (String num : abc) {
			System.out.println(num);
		}
		
		Collections.sort(abc, Collections.reverseOrder());
		
		for (String num : abc) {
			System.out.println(num);
		}
		
		abc.add(4, "GG");
		System.out.println("---------------");
		for (String num : abc) {
			System.out.println(num);
		}
		
		ArrayList<String> xyz = new ArrayList<>();
		
		xyz.addAll(abc);
		System.out.println(xyz);
		
		System.out.println(xyz.subList(0, 4));

		//IndexOutOfBoundsException
		//illegalArguementException

		System.out.println("Last occurrence of element 1: "+xyz.lastIndexOf("Gaurav"));
		
		System.out.println(xyz.get(0));
		System.out.println(xyz.indexOf("Gaurav"));
		
		System.out.println(xyz.contains("GAurav"));

		
		

		
		
	}

}
