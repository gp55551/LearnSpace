package JavaRelated;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println(sdf.format(date));
		
		Date d1 = sdf.parse("04-Mar-1992");
		Date d2 = sdf.parse("11-Mar-1992");
		
		System.out.println(d1.compareTo(d2));
		
		

		
	}

}
