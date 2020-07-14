package JavaRelated;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.sun.media.sound.InvalidFormatException;

import javax.swing.text.AbstractDocument.LeafElement;
import javax.xml.parsers.*;
import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;*/


public class Basics {
	// TODO Auto-generated method stub
	public static String globalVar = null;

	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, InvalidFormatException {
		// TODO Auto-generated method stub
		// pallindrom("DAD");
		// pallindromNumber(121);
		// pattern();
		// fibonacci(10);
		primeNumber(19);
		// factorial(3);
		// armstrongNumber(153);
		// largestNumberInArray();
		// secondLargestNumberInArray();
		// smallestNumberInArray();
		// floydsTriangle(5);
		// reverseString("java is a programming language");
		// stringFunc();
		// garbageCollection();
		// dateTime();
		// getIP();
		// FahrenheiToCelsius();
		// oddEven(24);
		// printPrimeNumbers(23);
		// print10NumbersWithoutLoops(1);
		// hourGlassStar1();
	}

	public static void pattern() {
		// pattern
		int i, j = 0;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

	public static void pallindrom(String value) {

		String str = value;
		int length = str.length();
		int start = 0;
		int end = length - 1;
		int middle = (start + end) / 2;
		int i2;
		for (i2 = start; i2 <= middle; i2++) {
			if (str.charAt(start) == str.charAt(end)) {
				start++;
				end--;
			} else {
				break;

			}
		}
		System.out.println(i2);
		if (i2 == middle + 1) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

	public static void pallindromNumber(int num1) {
		int num = num1;
		int r, sum = 0;
		int temp;
		temp = num;
		while (num > 0) {
			r = (num % 10);
			sum = (sum * 10) + r;
			num = num / 10;

		}
		System.out.println(temp + ":" + sum);
		if (temp == sum) {
			System.out.println("its a pallindrome");
		} else {
			System.out.println("its not");
		}

	}

	public static void fibonacci(int count1) {
		int i = -1;
		int j = 1;
		int k;
		System.out.println(count1);
		int sum = 0;
		for (k = 1; k <= count1; k++) {

			sum = i + j;
			System.out.print(sum + "  ");
			i = j;
			j = sum;
		}

	}

	public static void primeNumber(int num) {

		System.out.println(num);
		int flag = 0;
		int i = 0;
		int j = 0;
		int n = num / 2;
		for (i = 2; i <= n; i++) {

			if (num % i == 0) {
				flag = 1;
				break;
			}

		}
		if (flag == 1) {
			System.out.println("not a prime");
		} else {
			System.out.println("prime");
		}

	}

	public static void factorial(int num) {
		System.out.println(num);
		int i;
		int factorial = 1;

		for (i = 1; i <= num; i++) {
			factorial = factorial * i;

		}

		System.out.println("the factorial of number " + num + " is : " + factorial);
	}

	public static void armstrongNumber(int num) {
		System.out.println(num);
		int d;
		int arm = 0;
		int temp = num; // to compare

		while (num > 0) {
			d = num % 10;
			// System.out.println(d);
			num = num / 10;
			// System.out.println(num);
			arm = arm + (d * d * d);
			// System.out.println(arm);
		}

		System.out.println(arm);

		if (arm == temp) {
			System.out.println("its an armstrong number");
		} else {
			System.out.println("its not a armstrong number");
		}
	}

	public static void largestNumberInArray() {
		int arr[] = { 21, 2, 3, 4, 5, 6, 1, 23 };
		int largest;
		int length = arr.length;
		int i;
		int j;
		for (i = 0; i < length; i++) {
			for (j = i + 1; j < length; j++) {
				if (arr[i] > arr[j]) {
					largest = arr[i];
					arr[i] = arr[j];
					arr[j] = largest;
				}

			}

		}
		System.out.println(arr[length - 1]);

	}

	public static void secondLargestNumberInArray() {
		int arr[] = { 21, 2, 3, 4, 5, 6, 1, 23 };
		int largest;
		int length = arr.length;
		int i;
		int j;
		for (i = 0; i < length; i++) {
			for (j = i + 1; j < length; j++) {
				if (arr[i] > arr[j]) {
					largest = arr[i];
					arr[i] = arr[j];
					arr[j] = largest;
				}
			}
		}
		System.out.println(arr[length - 2]);

	}

	public static void smallestNumberInArray() {
		int arr[] = { 21, 2, 3, 4, 5, 6, 1, 23 };
		int largest;
		int length = arr.length;
		int i;
		int j;
		for (i = 0; i < length; i++) {
			for (j = i + 1; j < length; j++) {
				if (arr[i] > arr[j]) {
					largest = arr[i];
					arr[i] = arr[j];
					arr[j] = largest;
				}
			}
		}
		System.out.println(arr[0]);

	}

	public static void floydsTriangle(int count) {
		int i = 1;
		int j = 1;
		int k = 1;
		System.out.println("the floyd's triangle for " + count + " count");
		System.out.println("=============================================================");

		for (i = 1; i <= count; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}

	}

	public static void reverseString(String input) {
		String r = "";
		// char r = 0;

		int l = input.length();
		System.out.println(l);
		int i;
		for (i = l - 1; i >= 0; i--) {
			r = r + input.charAt(i);
		}

		System.out.println(r);

	}

	public static void stringFunc() {

		String new1 = "gaurav patnaik";
		StringBuffer buff = new StringBuffer(new1);
		System.out.println(buff.reverse());

		// compare string
		String s1;
		String s2;
		s1 = "gauravp";
		s2 = "gauravP";

		if (s1.compareTo(s2) > 0)
			System.out.println("The first string is greater than the second.");
		else if (s1.compareTo(s2) < 0)
			System.out.println("The first string is smaller than the second.");
		else
			System.out.println("Both the strings are equal.");

	}

	public static void garbageCollection() {
		Runtime rs = Runtime.getRuntime();
		System.out.println("Free memory in JVM before Garbage Collection = " + rs.freeMemory());
		rs.gc();
		System.out.println("Free memory in JVM after Garbage Collection = " + rs.freeMemory());
	}

	public static void dateTime() {
		int day, month, year;
		int second, minute, hour;
		GregorianCalendar date = new GregorianCalendar();

		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR);

		second = date.get(Calendar.SECOND);
		minute = date.get(Calendar.MINUTE);
		hour = date.get(Calendar.HOUR);

		System.out.println("Current date is  " + day + "/" + (month + 1) + "/" + year);
		System.out.println("Current time is  " + hour + " : " + minute + " : " + second);
	}

	public static void getIP() throws UnknownHostException {
		System.out.println(InetAddress.getLocalHost());
	}

	public static void FahrenheiToCelsius() {
		float temperatue;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter temperatue in Fahrenheit");
		temperatue = in.nextInt();

		temperatue = ((temperatue - 32) * 5) / 9;

		System.out.println("Temperatue in Celsius = " + temperatue);
	}

	public static void oddEven(int num) {
		if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
	
	public static void printPrimeNumbers(int count) {

		System.out.println(count);
		int flag = 0;
		int i;
		int j;
		int n;

		for (j = 1; j <= count; j++) {
			n = j / 2;
			for (i = 2; i <= n; i++) {

				if (j % i == 0) {
					flag = 1;
					break;
				}

			}
			if (flag == 0) {
				System.out.println("prime  - " + j);
			}
			flag = 0;

		}
	}

	public static void print10NumbersWithoutLoops(int num)
	{
		 if(num <= 10) {
			 
		       System.out.println(num); 
		       print10NumbersWithoutLoops(num+1);   }
	}
	
	public static void hourGlassStar()
	{		
		int input = 5;
		// Write your code here
		for (int i = 1; i <= input; i++) {
			for (int j = i; j <= input; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i=input-1 ; i >=1; i--) {
			for (int j = i; j <= input; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	
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

}
