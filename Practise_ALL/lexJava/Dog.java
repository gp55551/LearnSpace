package lexJava;

public class Dog extends Animal{

	public Dog()
	{
		super();
		System.out.println("dog creation");
	}
	void eat()
	{
		System.out.println("dog eat");
	}
	
	void work()
	{
		super.work();

	}
	static int var1 = 20 ;
	public static void m1()
	{
		System.out.println("m1dog");
		System.out.println(var1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Dog();
		a.eat();
		a.work();
		System.out.println("=======================================");
		Dog d =new Dog();
		d.eat();
		d.work();
		System.out.println("=======================================");
		Animal av = new Animal();
		av.eat();
		av.work();
		
		Animal aa = new Dog();
		aa.m1();
		
		Dog dd =new Dog();
		dd.m1();
		
		System.out.println(var1);
		
		String val1 = "gaurav";
		String val2 = new String("gaurav");
		String val3 = val2.intern();
		System.out.println(val1==val3);
		System.out.println(val1==val2);
		System.out.println(val2==val3);
		System.out.println(val2.equals(val3));

		
	}
	
	
	

}
