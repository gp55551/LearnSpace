package lexJava;

import java.util.Scanner;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reverseNumber(1234421);
		//amstrongNumber(153);
		//hourGlassStar1();
		
		//getLowestvalue();
		
		
	}
	
	//similar to pallindrom
	public static void reverseNumber(int n)
	{
		System.out.println("the number is: "+n);	
		int reverse = 0;
		int a;
		while(n>0)
		{
			a= n%10;
			reverse = reverse*10+a;
			n = n/10;
		}	
		System.out.println("reverse number: "+reverse);
	}
	
	public static void amstrongNumber(int n)
	{
		System.out.println("the number is: "+n);
		
		int armstrong = 0 ; 
		int a ; 
		while(n>0)
		{
			a = n%10;
			armstrong = armstrong + (a*a*a);
			n = n/10;	
		}
		System.out.println("armstrong number: "+armstrong);	
	}	
	
	 /** * * * * 
	  * * * * 
	   * * * 
	    * * 
	     * 
	    * * 
	   * * * 
	  * * * * 
	 * * * * * */
	
	public static void hourGlassStar1()
	{		
		int input = 5;
		// Write your code here
		
		for (int i=input ; i >=1; i--) {
			for (int j = i; j <= input; j++) {
			System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 2; i <= input; i++) {
			for (int j = i; j <= input; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	
	
	//Bouncy number is a positive integer which has its digits un-ordered.
	//14752 is a bouncy number where 95321 is not a bouncy number.
	
	
	
	public static void getLowestvalue()
	{
		int arr[] = {12,14,5,4,2,7};
		int lowestvalue = arr[0];
		for(int i =1 ; i<arr.length;i++)
		{
			if(lowestvalue>arr[i])
			{
				lowestvalue = arr[i];
			}
		}
		
		System.out.println(lowestvalue);
	}
	
	
	
	
	
}
