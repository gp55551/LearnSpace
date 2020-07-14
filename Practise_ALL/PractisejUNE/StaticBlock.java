package PractisejUNE;

public class StaticBlock {

	static int a = 23;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("dds");
		abc(12);
	}
	
	static
	{
		System.out.println("a");
	}
	
	static
	{
		System.out.println("a1");
	}

	
	static
	{
		System.out.println("c");
	}
	
	public static void abc(int a)
	{
		System.out.println("static method");
		System.out.println(StaticBlock.a);

	}
	
 

}
