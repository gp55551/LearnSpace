package JavaRelated;

import sun.security.util.Length;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1= "Sample";
		char s[] = s1.toCharArray();
		for(int i = s.length-1;i>=0;i--)
		{
			System.out.print(s[i]);
		}
		
		System.out.println("");
		System.out.println("====="); 
		
		
		String reverse = "" ; 
		for(int i = s1.length()-1;i>=0;i--)
		{
			reverse =reverse + s1.charAt(i);
		}
		
		System.out.println(reverse);
		
		System.out.println("====="); 
		
		StringBuilder strB = new StringBuilder("Gaurav");
		strB.reverse();
		System.out.println(strB);
		
		
		System.out.println("Gaurav"+1+2);
		System.out.println(1+32+"Gaurav");
		System.out.println(1+32+"Gaurav"+2+3);
		System.out.println("Gaurav"+2+3+"Gaurav");
		
		int x =12 ; 
		int y =23 ;
		int temp ;
		
		temp = x+y;
		x = temp-x;
		y= temp-y;
		System.out.println(+x+"-"+y);
		
		int a =12 ; 
		int b =23 ;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(+a+"-"+b);
		
		
		
		String str = "This this is is done by Saket Saket";
		
		String[] strS = str.split(" ");
		int count = 0 ;
		for(int i = 0 ; i<strS.length;i++)
		{
			if(str.contains(strS[i]))
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		
		

		
	}

}
