package JavaRelated;

import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int n , temp;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
		n = s.nextInt();
		int a[] = new int[n];
		
        System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
		
		for(int i = 0 ; i <n ; i ++)
		{
			for(int j = 0 ; j<0 ; j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j]= temp;
					
				}
			}
		}
		
		System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        
        
        System.out.println(a[n - 1]);*/
	
        int abc[] ={12,13,32,14,15,16};
    	
    	int n1 = abc.length;
    	
    	int largest = 0 ; 
    	for(int i = 0 ; i <n1;i++)
    	{
    		for(int j = i+1 ; j <n1;j++)
        	{
        		if(abc[i]>abc[j])
        		{
        			largest = abc[i];
        			abc[i] = abc[j];
        			abc[j] = largest;
        		}
        	}
    	}
    	
    	System.out.println(abc[n1-1]);
    	
    	
        
	}
	
	
	
	
	
	
	
}
