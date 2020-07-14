import java.util.ArrayList;
import java.util.List;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	 static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		 	
	        List<Integer> c = null ;

	         int m=0;
	        for(int i  =0 ; i< a.size();i++)
	        {
	             for(int j  =0 ; j< b.size();j++)
	        {
	            if(a.get(i)>a.get(j)) 
	            {
	            	m=m+1;
	               c.add(0, m);;     
	            }
	            else
	            {
	            	m=m+1;
	            	c.add(1,m);
	            }
	        }
	        }
	        {

	        }
	        return new ArrayList<Integer>(c);

	    }
 

}
