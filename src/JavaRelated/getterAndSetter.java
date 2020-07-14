package JavaRelated;

public class getterAndSetter {

	private int a  ; 
	public void setter(int a)
	{
		this.a = a; //this used to point to local variable
	}
	//getter and setter methods are used to access private data and modifies the data accordingly
	
	public void getter()
	{
		System.out.println(this.a);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getterAndSetter a = new getterAndSetter();
		a.setter(11);
		a.getter();
		
		getterAndSetter a1 = new getterAndSetter(); // accessing without setting values
		a1.getter();
	}
	
	

}
