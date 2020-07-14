package lexJava;

import org.openqa.selenium.firefox.GeckoDriverService;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//basicsArray();
		arryGreatestAndLeast();
		
	}
	
	public static void basicsArray() {
		
		//store multiple values of same data type
		//use array when no of elements are fixed
		//Array is preferred when there is no frequent checks and comparisons made on the array elements
		//Return an empty array instead of null to avoid runtime exceptions
		
		
		String[] abc ;
		int[] a; 
		abc = new String[3]; // declaration
		abc[0] = "asdsa"; // initialization
		abc[1] = "sc";
		abc[2] = "ASDC";
		
		for(int i =0 ; i<abc.length;i ++)
		{
			System.out.println(abc[i]);
		}
		
		//it is a data structure where multi dimensional arrays are array of arrays
		//here array will having rows and columns
		String[][] def ; 
		def = new String [2][3];
		
		//column size is not mandatory 
		String[][] z  = new String[2][];
		//columns size is given later
		z[0] = new String [2]; // column size is 2 for first row
		
		//array can initialized and declared together
		int[] aaa = {2,2,3,4};
	}

	public static void arryGreatestAndLeast() {

		int abc[] = { 12, 43, 54, 34, 87, 3, 45, 99 };
		int max = abc[0];
		for (int i = 1; i < abc.length; i++) {
			if (abc[i] > max) {
				max = abc[i];
			}
		}
		System.out.println(max);
		
		int min = abc[0];
		for (int i = 1; i < abc.length; i++) {
			if (abc[i] < min) {
				min = abc[i];
			}
		}
		System.out.println(min);
		
	}
	
	
	
	
}
