package lexJava;

public class staticBlock {

	static int a =10 ; 
	static 
	{
		System.out.println("static block");
	}
	static 
	{	}
	static 
	{	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		staticBlock s = new staticBlock();
		staticBlock s1 = new staticBlock();

	}
	
	public staticBlock()
	{
		a++;
		System.out.println(a);
	}
	
	final void ride()
	{
		System.out.println("ride");
	}
	

}
