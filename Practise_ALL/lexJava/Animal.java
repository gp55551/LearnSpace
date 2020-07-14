package lexJava;

import JavaRelated.PractiseForLex;

public class Animal {

	public Animal()
	{
		System.out.println("animal creation");
	}
	
	void eat()
	{
		System.out.println("animal eat");
	}
	
	void work()
	{
		System.out.println("animal work");

	}
	final void ride()
	{
		System.out.println("ride");
	}
	static int var1 = 10 ;
	public static void m1()
	{
		System.out.println("m1animal");
		System.out.println(var1);

	}
	private void wor1k()
	{
		System.out.println("animal work");

	}
	public void abcd()
	{
		System.out.println("animal work");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	PractiseForLex s = new PractiseForLex();
	
	Animal a = new PractiseForLex();
	a.wor1k();
	
	}
}




