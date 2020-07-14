package JavaRelated;

public class NovPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str = "GauraV";
		
		char chr[]  = str.toCharArray();
		for(int i = str.length() -1; i>= 0;i--)
		{
			str = str + chr[i];
		}
		
		System.out.println(str);
	}

}
