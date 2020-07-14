package JavaRelated;

import java.util.Calendar;

//import org.testng.asserts.SoftAssert;

import lexJava.Animal;

 public class PractiseForLex extends Animal{

	 public PractiseForLex()
	 {		
		 System.out.println("construtor");
	 }
	 private void wor1k()
		{
			System.out.println("animal work");

		}
	 public void wor1k1()
		{
			System.out.println("animal work");

		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value1 = "Infosys";
 		String value2 = new String("Infosys");
		System.out.println(value1==value2);
		String value3 = value2.intern();
		System.out.println(value1==value3);
		
		String value4 = "Infosys";
		System.out.println(value1==value4);
		System.out.println(value1.equals(value4));
		
 		PractiseForLex a = new PractiseForLex();
 		//calls both the contrutors
 		Animal b = new PractiseForLex();
 		
 		//float f1 = 1234.0 ; /// its double
 		float f2 = 1234;
 		int i = 1234;
 		double d3 = 1234.0;
 		long num = 1234;
 		
 		Calendar cal =  Calendar.getInstance();
 		cal.set(Calendar.MONTH, 3);
 		
 		PractiseForLex s =  new PractiseForLex();
 		PractiseForLex s1 =  new PractiseForLex();
 		PractiseForLex s2 =  new PractiseForLex();
 		PractiseForLex s3 =  new PractiseForLex();
 		s=s2;
 		s1=s3;
 		s2=null;
 		System.out.println(s);
 		System.out.println(s1);
 		System.out.println(s2);
 		System.out.println(s3);

 		
 		Animal aaa = new PractiseForLex();
 		//aaa.wor1k(); // error
 		aaa.abcd();
 		Animal ass = new PractiseForLex();
 		PractiseForLex nz = new PractiseForLex();
 		nz.wor1k();
 		Animal nzz = new PractiseForLex();
 		//nzz.wor1k();
 		
 		int x,y,z;
 		
 		String assertString = "demoForHard";
 		
 		/*SoftAssert softassert = new SoftAssert();
 		softassert.assertEquals("demoForHard", assertString);
 		
 		System.out.println("after assert equals");
 		
 		softassert.assertTrue(assertString.equals("demoForHards"));
 		
 		System.out.println("After assert true");*/
 	

	}

}
