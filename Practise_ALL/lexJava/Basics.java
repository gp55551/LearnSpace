package lexJava;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a2= 'A';
		char a3= 'A';
		System.out.println(a2+a3);

		System.out.println("========================");
		//switch
		int abcd = 12 ; 
		switch(abcd)
		{
		case 0: System.out.println("aa");
		case 1: System.out.println("bb"); 
		case 2:	System.out.println("cc");
		default : System.out.println("default");
		}
		
		System.out.println("========================");

		int z= 1;
		
		//do-while
		do
		{
			System.out.println("sdafsd");
			z++;
		}
		while(z<2);
		
	
		for(int i = 0 ; i<3 ; i ++)
		{
			switch(i)
			{
			case 0 : break;
			case 1 : System.out.print("one ");
			case 2 : System.out.print("two ");
			case 3 : System.out.print("three ");

			}
		}
		System.out.println("done");
	
	}

}
