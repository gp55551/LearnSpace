package lexJava;

public class Trainee {
	int traineeId ; 
	String  name ;
	float fee;
	
	static String companyName = "infosys";
	static void change()
	{
		companyName = "Infy" ; 
	}
	
	Trainee(int traineeId ,	String  name ,	float fee)
	{
		this.traineeId = traineeId;
		this.name =name;
		this.fee=fee;
		
	}

	void display()
	{
		System.out.println(traineeId);
		System.out.println(name);
		System.out.println(fee);
		
		System.out.println(companyName);


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trainee t1 = new Trainee(111, "a", 1000.0f);
		t1.change();
		t1.display();
		System.out.println("-----------------------------------------");

		Trainee t2 = new Trainee(112, "b", 2000.0f);
		t2.change();
		t2.display();
		
		
	}

}
