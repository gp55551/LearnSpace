package JavaRelated;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//An object whose state cannot be changed after it is created is 
		//known as an Immutable object. String, Integer, Byte, Short, Float, Double and 
		//all other wrapper classes objects are immutable.
		
		//Each time you create a String literal, the JVM checks the string pool first. 
		//If the string literal already exists in the pool, a reference to the pool instance is returned. 
		//If string does not exist in the pool, a new string object is created, and is placed in the pool. 
		//String objects are stored in a special memory area known as string constant pool inside the heap memory.
		
		String str1 = "_gp_";
		String str2 = new String("_sb_");
		String str3 = new String(str2);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
		String str4 = str2+str3;
		System.out.println(str4);
		System.out.println(str2.concat(str3));
		
		
		str1= "_sb_";
		System.out.println(str1);
		
		String st1 = "java";
		String st2 = "java";
		String st3 = new String("java");
		String st4 = new String("java");
		
		System.out.println(st1==st2);
		System.out.println(st1==st3);   //Its because we are creating a new object using new operator, 
									    //and thus it gets created in a non-pool memory area of the heap.
										//s1 is pointing to the String in string pool while s3 is pointing to
										//the String in heap and hence, when we compare s1 and s3, the answer is false.
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));

		System.out.println(st3==st4); 
		System.out.println(st3.equals(st4));
		
		String s1 = "Abhi";
		String s2 = "Viraaj";
		String s3 = "Abhi";
		System.out.println(s1.compareTo(s2));   //return -1 because s1 < s2 
		System.out.println(s1.compareTo(s3));     //return 0 because s1 == s3 
		System.out.println(s2.compareTo(s1));     //return 1 because s2 > s1
		
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(s1.length()-1));
		
		System.out.println(s1.equalsIgnoreCase("Abhi"));
		
		String str="StudyTonight";
        System.out.println(str.indexOf('t'));   //3rd form
        System.out.println(str.indexOf('t', 3));    //2nd form
        String subString="Ton";
        System.out.println(str.indexOf(subString)); //1st form
        System.out.println(str.indexOf(subString,7));   //4th form //-1 indicates that the substring/Character is not found in the given String.
		System.out.println(str.lastIndexOf("t")); // will fetch the last occurrence of the char
	
		
		System.out.println(str.length());
		
		
		String abc = "Gaurav patnaikp";
		System.out.println(abc.replace("p", "P")); //replace all occurrences of a char
		System.out.println(abc.replaceAll("p", "P")); //replace all occurrences of a string/substring
		System.out.println(abc.replaceFirst("p", "P")); //replace first occurrences of a char
		
		System.out.println(abc.substring(4));
		System.out.println(abc.substring(3,5));
		System.out.println(abc.subSequence(3, 4));
		
		System.out.println(abc.toLowerCase());
		System.out.println(abc.toUpperCase());
		
		int a = 1234;
		String str10 = String.valueOf(a); //valueOf() is used to convert primitive data types into Strings.
		System.out.println(str10+"cdsdf");
		
		String str11 = "Hello World";
		System.out.println(str11.toString()); //toString() method returns the string representation of the object used to invoke this method. toString() is used to represent any Java Object into a meaningful string representation. It is declared in the Object class, hence can be overrided by any java class. 
											//(Object class is super class of all java classes.)
		
		
		String str13 = "  _hello_  ";
		System.out.println(str13.trim()); //This method returns a string from which any 
										  //leading and trailing whitespaces has been removed.
		
		
		String s14 = "study tonight";
		System.out.println(s14.trim()); // will output "study tonight" because 
									   //trim() method removes only the leading and trailing whitespaces
		
		
		//stringBuffer class
		
		//As we know that String objects are immutable, so if we do a lot of changes with String objects, 
		//we will end up with a lot of memory leak(gc wont work.... it will try find to find reference).
		//So StringBuffer class is used when we have to make lot of modifications to our string
		
		String a1 = "abc";
		String b = "def";
		String c = a1+b;
		System.out.println("the c value: "+c+"-" +a1+b);

		
		
		char a2= 'A';
		char a3= 'A';
		System.out.println(a2+a3);

		System.out.println("========================");

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
