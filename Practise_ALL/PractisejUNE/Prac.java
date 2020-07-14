package PractisejUNE;

import org.openqa.selenium.ElementNotVisibleException;

import OOPS.finalCar;

public class Prac {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		try
		{
			int i = 0 ;
			int j = 1/i;
			System.out.println(j);
		}
		catch (ElementNotVisibleException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e1) {
			System.out.println(e1.getMessage());
			throw new Exception("divide by zero error");
			
		}
		
		finally {
			System.out.println("finally block");
		}
	}

}
