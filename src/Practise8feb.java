import java.util.Scanner;

import org.eclipse.jetty.util.Scanner.ScanCycleListener;

public class Practise8feb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		//fibonacci
		int i = 0 ;
		int j = 1 ;
		int n = 100 ;
		int s = 0 ;
		for(int m = 1 ;m<=10;m++)
		{
			if(i<n)
			{
				s = i+j;
				System.out.print(s+"-");
				i=j;
				j=s;
				
			}
		}
		System.out.println("==========================================");
		
		//prime
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int n1 = number/2;
		int flag = 1 ;
		for(int i1 = 2 ; i1<n1;i1++)
		{
			if(number%i1==0)
			{
				flag = 0;
			}
		}
		
		if(flag==1)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
		*/
		System.out.println("==========================================");
		
		//pallindrome
		
		String a = "BOBOB";
		int flag1 = 0 ;
		for(int  i1 = 0 ; i1<a.length()/2;i1++)
		{
			for(int  j1 = (a.length()/2)+1 ; j1<=a.length()-1;j1++)
			{
				if(a.charAt(i1)==a.charAt(j1))
				{
					flag1 = 1;
				}
				else
				{
					flag1=0;
				}
					
				
			}
		}
		
		if(flag1==1)
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("not pallindrome");
		}
		
		
		System.out.println("==========================================");

		
		//integer pallindrome
		
		/*int number = 1234321;
		int pallindrome  = number ; 
		int reverse = 0 ;
		int r ;
		while(number!=0)
		{
			r = pallindrome%10;
			reverse = reverse*10 + r ;
			pallindrome = pallindrome / 10;

		}
		System.out.println(pallindrome);
		if(number==pallindrome)
			
		{
			System.out.println("pallindrome");
		}*/
		
	}

}
