package JavaCodes;

public class Array_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arrayList[] = {12,2,4,34,2,1,0,55,3,-11};
		for(int i =0; i<arrayList.length;i++)
		{
			System.out.println(arrayList[i]);
		}
		
		System.out.println("=================================================");
		
		
		int duplicate = 0 ; 
		int count = 0 ;
		for(int i =0; i<arrayList.length;i++)
		{
			for(int j =i+1; j<arrayList.length;j++)
			{
				if(arrayList[i]==arrayList[j])
				{
					duplicate = arrayList[i];
					count++;
				}
				
			}
		}
		
		System.out.println(duplicate);
		System.out.println(count);
	}

}
